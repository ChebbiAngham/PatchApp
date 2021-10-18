package com.os.patches.entity;

import javax.persistence.*;

@Entity

public class PatchRedhat {

	@Id
	@GeneratedValue
	private Integer id;


	private String date;


	private String patch_name;

	@Column (length = 2048)
	private String product_name;


	private String Severity;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getdate() { return date; }

	public void setdate(String date) {
		this.date = date;
	}

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
		return Severity;
	}

	public void setSeverity(String severity) {
		Severity = severity;
	}





}
