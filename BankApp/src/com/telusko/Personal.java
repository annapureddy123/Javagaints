package com.telusko;

public class Personal
{
	private String firstname ;
	private String middlename;
	private String lastname;
    private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
//	@Override
//	public String toString() {
//		return "Personal [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + "]";
//	}

}
