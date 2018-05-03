package com.dl.ps.service.core;

public class Channel {
	
	private Printer printer;
	private Archive archive;
	private Email email;
	private Fax fax;
	private Customer toEcliso;
	
	public Printer getPrinter() {
		return printer;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	public Archive getArchive() {
		return archive;
	}
	public void setArchive(Archive archive) {
		this.archive = archive;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	public Fax getFax() {
		return fax;
	}
	public void setFax(Fax fax) {
		this.fax = fax;
	}
	public Customer getToEcliso() {
		return toEcliso;
	}
	public void setToEcliso(Customer toEcliso) {
		this.toEcliso = toEcliso;
	}
	
}
