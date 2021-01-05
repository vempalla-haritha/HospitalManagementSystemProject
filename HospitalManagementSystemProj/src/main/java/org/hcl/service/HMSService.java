package org.hcl.service;

import java.util.List;

import org.hcl.model.AddPhysician;
import org.hcl.model.PatientDiagnosisDetails;
import org.hcl.model.PatientEnrollment;
import org.hcl.model.PhysicianSearch;
import org.springframework.stereotype.Service;

@Service
public interface HMSService {
	
	public void enrolling(PatientEnrollment pe);

	public List<PatientEnrollment> fetchPatient();

	public void addPhysician(AddPhysician addphy);

	public List<AddPhysician> fetchPhysician();

	public void searchPhysicianByCriteria(PhysicianSearch ps);

	public List<AddPhysician> searchPhysician(PhysicianSearch ps);

	public void patientDiagnosisDetails(PatientDiagnosisDetails pdd);

	public List<PatientDiagnosisDetails> fetchPatientDiagnosis();

	public PatientEnrollment patientHistoryDetails(Integer patientId);
}
