package com.h24.service.patient.models;

public class Patients {
	
	private Integer id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String mobile;
	private String gender;
	private String dob;
	private String address;
	
	
	  public Patients() { }
	 

	public Patients(Integer i, String fname, String lname, String email, String password, String mobile, String gender,
			String dob, String address) {
		this.id = i;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patients [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", mobile=" + mobile + ", gender=" + gender + ", dob=" + dob + ", address=" + address
				+ "]";
	}
}
