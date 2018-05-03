package com.dl.ps.service.core;

public class Printer {

	private Boolean enabled;
	private String printerName;
	private Integer inputTray;
	private Integer outputTray;
	private Boolean fetchPrinterViaSBA;
	private Integer noOfCopies;
	
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getPrinterName() {
		return printerName;
	}
	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}
	public Integer getInputTray() {
		return inputTray;
	}
	public void setInputTray(Integer inputTray) {
		this.inputTray = inputTray;
	}
	public Integer getOutputTray() {
		return outputTray;
	}
	public void setOutputTray(Integer outputTray) {
		this.outputTray = outputTray;
	}
	public Boolean isFetchPrinterViaSBA() {
		return fetchPrinterViaSBA;
	}
	public void setFetchPrinterViaSBA(Boolean fetchPrinterViaSBA) {
		this.fetchPrinterViaSBA = fetchPrinterViaSBA;
	}
	public Integer getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(Integer noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
}
