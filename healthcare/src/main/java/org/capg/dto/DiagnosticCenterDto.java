package org.capg.dto;

import java.util.ArrayList;
import java.util.List;

import org.capg.entities.Test;

public class DiagnosticCenterDto {

	private String centerName;
	
	List<Test> listOfTests=new ArrayList<>();

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public List<Test> getListOfTests() {
		return listOfTests;
	}

	public void setListOfTests(List<Test> listOfTests) {
		this.listOfTests = listOfTests;
	}
	
}
