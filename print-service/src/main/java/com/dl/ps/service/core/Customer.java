package com.dl.ps.service.core;

public class Customer {

	private String UID;
	private String customerNo;
	private String contractNo;
	private Boolean fetchUIDFromSBA;
	
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public Boolean getFetchUIDFromSBA() {
		return fetchUIDFromSBA;
	}
	public void setFetchUIDFromSBA(Boolean fetchUIDFromSBA) {
		this.fetchUIDFromSBA = fetchUIDFromSBA;
	}
	
	
}
