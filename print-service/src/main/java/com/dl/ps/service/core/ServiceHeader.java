package com.dl.ps.service.core;


public class ServiceHeader {
	
	private String serviceName;
	private String applicationName;
	private Boolean isRequestResponse;
	private String locale;
	private String requestInstanceId;
	private SecurityContext requestSecurityContext;
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public Boolean getIsRequestResponse() {
		return isRequestResponse;
	}
	public void setIsRequestResponse(Boolean isRequestResponse) {
		this.isRequestResponse = isRequestResponse;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getRequestInstanceId() {
		return requestInstanceId;
	}
	public void setRequestInstanceId(String requestInstanceId) {
		this.requestInstanceId = requestInstanceId;
	}
	public SecurityContext getRequestSecurityContext() {
		return requestSecurityContext;
	}
	public void setRequestSecurityContext(SecurityContext requestSecurityContext) {
		this.requestSecurityContext = requestSecurityContext;
	}
	
}
