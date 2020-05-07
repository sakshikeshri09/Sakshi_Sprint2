package org.capg.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="diagnosticcenter_info")
public class DiagnosticCenter {
	
	@Id
	private String centerId;
	
	private String centerName;
	
	
	 @ElementCollection 
	 protected List<Test> tests = new ArrayList<Test>();
	 

	// @ElementCollection
	//	private List<Appointment>appointmentList;
	
	
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public List<Test> getTests() {
		return tests;
	}
	public void setTests(List<Test> tests) {
		this.tests = tests;
	}
	
	 
//	public List<Appointment> getAppointmentList() {
//		return appointmentList;
//	}
//	public void setAppointmentList(List<Appointment> appointmentList) {
//		this.appointmentList = appointmentList;
//	}

}
