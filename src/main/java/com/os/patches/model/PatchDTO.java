package com.os.patches.model;

public class PatchDTO {

	private String date;

	private String patch_name;

	public String getPatch_name() {
		return patch_name;
	}

	public void setPatch_name(String patch_name) {
		this.patch_name = patch_name;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	private String product_name;

	private String severity;




	public String getdate() {
		return date;
	}

	public void setdate(String date) {
		this.date = date;
	}



}
