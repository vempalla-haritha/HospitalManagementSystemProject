package org.hcl.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PatientDiagnosisDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patientId;
	private Integer diagnosisId;
	private String symptomS;
	private String diagnosis;
	private String doctor;
	private Date dod;
	private FollowUp followup;
	private Date dof;
	private Integer bill;
	private String cardNum;
	private Payment pay;

	public PatientDiagnosisDetails() {
		// TODO Auto-generated constructor stub
	}

	public PatientDiagnosisDetails(Integer patientId, Integer diagnosisId, String symptomS, String diagnosis,
			String doctor, Date dod, FollowUp followup, Date dof, Integer bill, String cardNum, Payment pay) {
		super();
		this.patientId = patientId;
		this.diagnosisId = diagnosisId;
		this.symptomS = symptomS;
		this.diagnosis = diagnosis;
		this.doctor = doctor;
		this.dod = dod;
		this.followup = followup;
		this.dof = dof;
		this.bill = bill;
		this.cardNum = cardNum;
		this.pay = pay;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getDiagnosisId() {
		return diagnosisId;
	}

	public void setDiagnosisId(Integer diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	public String getSymptomS() {
		return symptomS;
	}

	public void setSymptomS(String symptomS) {
		this.symptomS = symptomS;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public Date getDod() {
		return dod;
	}

	public void setDod(Date dod) {
		this.dod = dod;
	}

	public FollowUp getFollowup() {
		return followup;
	}

	public void setFollowup(FollowUp followup) {
		this.followup = followup;
	}

	public Date getDof() {
		return dof;
	}

	public void setDof(Date dof) {
		this.dof = dof;
	}

	public Integer getBill() {
		return bill;
	}

	public void setBill(Integer bill) {
		this.bill = bill;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public Payment getPay() {
		return pay;
	}

	public void setPay(Payment pay) {
		this.pay = pay;
	}

}
