package com.dl.ps.service;

import java.nio.charset.Charset;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dl.ps.service.req.GenerateDocumentRequest;
import com.dl.ps.service.res.GenerateDocumentResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


/**
 * Root resource (exposed at "api/v1/omx" path)
 */
@Path("/api/v1/omx")
@Api(value = "Generate Document Resource", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
public class ServiceFacade {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a application/json" response.
     * @throws JsonProcessingException 
     */
    @POST
    @Path("/generateDocuments")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    @ApiOperation(value =  "Generate a document resouce. Version 1 - (version in URL)",  response = GenerateDocumentResponse.class)
    @ApiResponses( value = {
    		@ApiResponse(code = 200, message = "Success"), 
    		@ApiResponse(code = 404, message ="Failed")
    		})
    public GenerateDocumentResponse generateDocuments(GenerateDocumentRequest generateDocumentReq) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		GenerateDocumentResponse generateDocumentRes = new GenerateDocumentResponse();
		System.out.println("Request data : "+objectMapper.writeValueAsString(generateDocumentReq));
		generateDocumentRes.setStatus("200");
		generateDocumentRes.setErrorMsg("Success");
		generateDocumentRes.setMessageId("MSG723232");
		generateDocumentRes.setData("success msg".getBytes());
		System.out.println("Response data : "+objectMapper.writeValueAsString(generateDocumentRes));
        return generateDocumentRes;
    }
}
