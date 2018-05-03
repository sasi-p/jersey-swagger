package com.dl.ps.service.core;

public class BatchInfo {
	
	private Boolean enabled;
	private String batchJobId;
	private Integer batchSeqNo;
	private Boolean batchEndFlag;
	
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getBatchJobId() {
		return batchJobId;
	}
	public void setBatchJobId(String batchJobId) {
		this.batchJobId = batchJobId;
	}
	public Integer getBatchSeqNo() {
		return batchSeqNo;
	}
	public void setBatchSeqNo(Integer batchSeqNo) {
		this.batchSeqNo = batchSeqNo;
	}
	public Boolean getBatchEndFlag() {
		return batchEndFlag;
	}
	public void setBatchEndFlag(Boolean batchEndFlag) {
		this.batchEndFlag = batchEndFlag;
	}
	
}
