package com.dl.ps.service.core;

public class SecurityContext {
	private String securityToken;
	private String credentialInfo;
	
	public String getSecurityToken() {
		return securityToken;
	}
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}
	public String getCredentialInfo() {
		return credentialInfo;
	}
	public void setCredentialInfo(String credentialInfo) {
		this.credentialInfo = credentialInfo;
	}
	
	
}
