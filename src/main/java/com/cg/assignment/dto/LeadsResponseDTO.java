package com.cg.assignment.dto;

import java.time.LocalDate;

import lombok.Data;
@Data
public class LeadsResponseDTO {
	
	private String msg;
	private int id;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String email;
	private LocalDate dob;
	private int pincode;
	private String gender;
	private String smoker;
	private String alcoholic;
	private String address;
	private String dependant;
	private LocalDate annualIncome;
	private int govRebate;
	private int taxRebate;
	private String idProof;
	private String financialProof;
	private String quotationRef;
	private String premium;
	private String product;
	private long sum;
	private String leadStage;
	private String contacted;


}
