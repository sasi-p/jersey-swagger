package com.dl.ps.service.req;

import com.dl.ps.service.core.AttachmentInfo;
import com.dl.ps.service.core.BatchInfo;
import com.dl.ps.service.core.Channel;
import com.dl.ps.service.core.GeneralInfo;
import com.dl.ps.service.core.PDFInfo;
import com.dl.ps.service.core.ServiceHeader;


public class GenerateDocumentRequest {
	
	private ServiceHeader header;
	private GenerateDocumentsPayload payload;
	
	public ServiceHeader getHeader() {
		return header;
	}

	public void setHeader(ServiceHeader header) {
		this.header = header;
	}

	public GenerateDocumentsPayload getPayload() {
		return payload;
	}

	public void setPayload(GenerateDocumentsPayload payload) {
		this.payload = payload;
	}

	public static class GenerateDocumentsPayload {
		private GeneralInfo generalInfo;
		private Channel channels;
		private PDFInfo pdfInfo;
		private BatchInfo batchInfo;
		private AttachmentInfo DMSAttachmentInfo;
		private byte[] templateData;
		public GeneralInfo getGeneralInfo() {
			return generalInfo;
		}
		public void setGeneralInfo(GeneralInfo generalInfo) {
			this.generalInfo = generalInfo;
		}
		public Channel getChannels() {
			return channels;
		}
		public void setChannels(Channel channels) {
			this.channels = channels;
		}
		public PDFInfo getPdfInfo() {
			return pdfInfo;
		}
		public void setPdfInfo(PDFInfo pdfInfo) {
			this.pdfInfo = pdfInfo;
		}
		public BatchInfo getBatchInfo() {
			return batchInfo;
		}
		public void setBatchInfo(BatchInfo batchInfo) {
			this.batchInfo = batchInfo;
		}
		public AttachmentInfo getDMSAttachmentInfo() {
			return DMSAttachmentInfo;
		}
		public void setDMSAttachmentInfo(AttachmentInfo dMSAttachmentInfo) {
			DMSAttachmentInfo = dMSAttachmentInfo;
		}
		public byte[] getTemplateData() {
			return templateData;
		}
		public void setTemplateData(byte[] templateData) {
			this.templateData = templateData;
		}
		
	}

}
