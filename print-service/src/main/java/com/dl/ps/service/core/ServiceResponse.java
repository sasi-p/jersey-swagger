package com.dl.ps.service.core;

public class ServiceResponse {

	private String status;
	private String errorMsg;
	private String messageId;
	private byte[] date;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public byte[] getDate() {
		return date;
	}
	public void setDate(byte[] date) {
		this.date = date;
	}
	
	
}
