package org.hcl.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.hcl.dao.HMSDao;
import org.hcl.model.AddPhysician;
import org.hcl.model.PatientDiagnosisDetails;
import org.hcl.model.PatientEnrollment;
import org.hcl.model.PhysicianSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class HMSServiceImpl implements HMSService {
	private static Logger log = Logger.getLogger(HMSServiceImpl.class);
	@Autowired
	private HMSDao hmsDao;

	public void enrolling(PatientEnrollment pe) {

		log.info("Inside enrolling()");
		hmsDao.enrolling(pe);
	}

	public List<PatientEnrollment> fetchPatient() {

		log.info("Inside fetchPatient()");
		List<PatientEnrollment> patList = hmsDao.fetchPatient();
		return patList;

	}

	public void addPhysician(AddPhysician addphy) {

		log.info("Inside addPhysician()");
		hmsDao.addPhysician(addphy);

	}

	public List<AddPhysician> fetchPhysician() {

		log.info("Inside fetchPhysician()");
		List<AddPhysician> phyList = hmsDao.fetchPhysician();
		return phyList;
	}

	public void searchPhysicianByCriteria(PhysicianSearch ps) {

		log.info("Inside searchPhysicianByCriteria()");
		hmsDao.searchPhysicianByCriteria(ps);
	}

	public List<AddPhysician> searchPhysician(PhysicianSearch ps) {

		log.info("Inside searchPhysician()");
		List<AddPhysician> psList = hmsDao.searchPhysician(ps);
		return psList;
	}
	public void patientDiagnosisDetails1(PatientDiagnosisDetails pdd) {

		log.info("Inside patientDiagnosisDetails()");
		hmsDao.patientDiagnosisDetails(pdd);
	}

	public List<PatientDiagnosisDetails> fetchPatientDiagnosisDetails() {

		log.info("Inside fetchPatientDiagnosis()");
		List<PatientDiagnosisDetails> diaList = hmsDao.fetchPatientDiagnosis();
		return diaList;
	}

	public PatientEnrollment ViewpatientHistory(Integer patientId) {

		log.info("Inside patientHistoryDetails()");
		PatientEnrollment en = hmsDao.patientHistoryDetails(patientId);
		return en;

	}

}
