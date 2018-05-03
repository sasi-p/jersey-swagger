package com.dl.ps.service.core;

public class Email {
	private Boolean enabled;
	private String to;
	private String copy;
	private String bcc;
	private String from;
	private String subject;
	private String body;
	private Boolean fetchSenderEmailFromSBA;
	
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getCopy() {
		return copy;
	}
	public void setCopy(String copy) {
		this.copy = copy;
	}
	public String getBcc() {
		return bcc;
	}
	public void setBcc(String bcc) {
		this.bcc = bcc;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Boolean getFetchSenderEmailFromSBA() {
		return fetchSenderEmailFromSBA;
	}
	public void setFetchSenderEmailFromSBA(Boolean fetchSenderEmailFromSBA) {
		this.fetchSenderEmailFromSBA = fetchSenderEmailFromSBA;
	}
	
}
