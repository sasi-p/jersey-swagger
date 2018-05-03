package com.dl.ps.service;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.dl.ps.service.core.Archive;
import com.dl.ps.service.core.AttachmentInfo;
import com.dl.ps.service.core.BatchInfo;
import com.dl.ps.service.core.Channel;
import com.dl.ps.service.core.Customer;
import com.dl.ps.service.core.DocInfo;
import com.dl.ps.service.core.Email;
import com.dl.ps.service.core.Fax;
import com.dl.ps.service.core.GeneralInfo;
import com.dl.ps.service.core.PDFInfo;
import com.dl.ps.service.core.Printer;
import com.dl.ps.service.core.SecurityContext;
import com.dl.ps.service.core.ServiceHeader;
import com.dl.ps.service.req.GenerateDocumentRequest;
import com.dl.ps.service.res.GenerateDocumentResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMain {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		
		GenerateDocumentRequest documentRequest = new GenerateDocumentRequest();
		GenerateDocumentResponse documentResponse = new GenerateDocumentResponse();
		
		ServiceHeader serviceHeader = new ServiceHeader();
		serviceHeader.setApplicationName("print service");
		serviceHeader.setIsRequestResponse(Boolean.TRUE);
		serviceHeader.setLocale("En");
		serviceHeader.setRequestInstanceId("20180430");
		serviceHeader.setServiceName("GenerateDocuments");
		
		SecurityContext requestSecurityContext = new SecurityContext();
		requestSecurityContext.setCredentialInfo("admin123");
		requestSecurityContext.setSecurityToken("T233434");
		serviceHeader.setRequestSecurityContext(requestSecurityContext);
		documentRequest.setHeader(serviceHeader);
		
		GenerateDocumentRequest.GenerateDocumentsPayload inputData = new GenerateDocumentRequest.GenerateDocumentsPayload();
		BatchInfo batchInfo = new BatchInfo();
		batchInfo.setBatchEndFlag(Boolean.TRUE);
		batchInfo.setBatchJobId("45");
		batchInfo.setBatchSeqNo(Integer.valueOf(1));
		batchInfo.setEnabled(Boolean.TRUE);
		inputData.setBatchInfo(batchInfo);
		
		Channel channels = new Channel();
		//Archive
		Archive archive = new Archive();
		archive.setArchiveMode("Yest");
		archive.setEnabled(Boolean.TRUE);
		channels.setArchive(archive);
		// Email
		Email email = new Email();
		email.setBcc("bcc@domain.com");
		email.setBody("body content");
		email.setCopy("2");
		email.setEnabled(Boolean.TRUE);
		email.setFetchSenderEmailFromSBA(Boolean.TRUE);
		email.setFrom("from@domain.com");
		email.setSubject("Subjct content");
		email.setTo("to@domain.com");
		channels.setEmail(email);
		// Fax
		Fax fax = new Fax();
		fax.setEnabled(Boolean.TRUE);
		fax.setFaxNumber("8473874334");
		channels.setFax(fax);
		// Printer
		Printer printer = new Printer();
		printer.setEnabled(Boolean.TRUE);
		printer.setFetchPrinterViaSBA(Boolean.TRUE);
		printer.setInputTray(Integer.valueOf(1234));
		printer.setNoOfCopies(Integer.valueOf(2));
		printer.setOutputTray(Integer.valueOf(7343));
		printer.setPrinterName("DL Printer");
		channels.setPrinter(printer);
		Customer toEcliso = new Customer();
		toEcliso.setContractNo("76834894");
		toEcliso.setCustomerNo("743934");
		toEcliso.setFetchUIDFromSBA(Boolean.TRUE);
		toEcliso.setUID("UID234");
		channels.setToEcliso(toEcliso);
		inputData.setChannels(channels);
		
		AttachmentInfo dMSAttachmentInfo = new AttachmentInfo();
		ArrayList<DocInfo> listOfDocIds = new ArrayList<DocInfo>();
		DocInfo docInfo = new DocInfo();
		docInfo.setDocReferenceId("743943773");
		docInfo.setRenderAnnotation(Boolean.TRUE);
		listOfDocIds.add(docInfo);
		dMSAttachmentInfo.setListOfDocIds(listOfDocIds);
		inputData.setDMSAttachmentInfo(dMSAttachmentInfo);
		
		GeneralInfo generalInfo = new GeneralInfo();
		generalInfo.setCompany("DL");
		generalInfo.setCountry("GE");
		generalInfo.setForm("UCS");
		generalInfo.setLocation("Germany");
		generalInfo.setSba("SBA");
		inputData.setGeneralInfo(generalInfo);
		
		PDFInfo pdfInfo = new PDFInfo();
		pdfInfo.setEnabled(Boolean.TRUE);
		inputData.setPdfInfo(pdfInfo);
		byte[] templateData = "sample data for byte array".getBytes(Charset.defaultCharset());
		inputData.setTemplateData(templateData);
		
		documentRequest.setPayload(inputData);
		
		System.out.println("Request Data : "+mapper.writeValueAsString(documentRequest));
	
	}

}
