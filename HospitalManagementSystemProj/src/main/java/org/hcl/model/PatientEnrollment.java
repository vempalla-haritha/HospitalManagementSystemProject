package org.hcl.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PatientEnrollment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String firstName;
	private String lastName;
	private String password;
	private Date doB;
	private String emailAddress;
	private Long contactNumber;
	private String state;
	private String insurancePlan;

	public PatientEnrollment() {
		// TODO Auto-generated constructor stub
	}

	public PatientEnrollment(String firstName, String lastName, String password, Date doB, String emailAddress,
			Long contactNumber, String state, String insurancePlan) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.doB = doB;
		this.emailAddress = emailAddress;
		this.contactNumber = contactNumber;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDoB() {
		return doB;
	}

	public void setDoB(Date doB) {
		this.doB = doB;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

}
