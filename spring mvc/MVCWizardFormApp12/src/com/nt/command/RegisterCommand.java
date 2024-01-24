package com.nt.command;

public class RegisterCommand{
	
	//Login Credentials
	private String userName;
	private String password;
	//Contact Details
	private String emailId;
	private String phone;
	//Address Details
	private String city;
	private String pincode;
	
	public RegisterCommand(){
		System.out.println("RegisterCommand:0-param constructor");
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "RegisterCommand [userName=" + userName + ", password="
				+ password + ", emailId=" + emailId + ", phone=" + phone
				+ ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
		
}