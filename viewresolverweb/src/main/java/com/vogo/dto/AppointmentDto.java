package com.vogo.dto;

import java.time.LocalDateTime;

public class AppointmentDto {
  
	private int appointmentNo;
	private String patientNameString;
	private String doctorName;
	private LocalDateTime appointmentDate;
	
	public int getAppointmentNo() {
		return appointmentNo;
	}
	public void setAppointmentNo(int appointmentNo) {
		this.appointmentNo = appointmentNo;
	}
	public String getPatientNameString() {
		return patientNameString;
	}
	public void setPatientNameString(String patientNameString) {
		this.patientNameString = patientNameString;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	
}
