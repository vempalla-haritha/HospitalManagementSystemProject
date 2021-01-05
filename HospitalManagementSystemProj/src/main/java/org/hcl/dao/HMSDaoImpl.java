package org.hcl.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hcl.model.AddPhysician;
import org.hcl.model.PatientDiagnosisDetails;
import org.hcl.model.PatientEnrollment;
import org.hcl.model.PhysicianSearch;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class HMSDaoImpl implements HMSDao {

	private static Logger log = Logger.getLogger(HMSDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	public void enrolling(PatientEnrollment pe) {

		log.info("Inside Dao patient enrolling()");
		sessionFactory.getCurrentSession().save(pe);

	}

	public List<PatientEnrollment> fetchPatient() {

		log.info("Inside Dao fetchPatient()");
		Query query = sessionFactory.getCurrentSession().createQuery("from EnrollPatient e");
		List<PatientEnrollment> patList = query.list();
		return patList;

	}

	public void addPhysician(AddPhysician addphy) {

		log.info("Inside Dao addPhysician()");
		sessionFactory.getCurrentSession().save(addphy);
	}

	public List<AddPhysician> fetchPhysician() {

		log.info("Inside Dao fetchPhysician()");
		Query query = sessionFactory.getCurrentSession().createQuery("from AddPhysician a");
		List<AddPhysician> phyList = query.list();
		return phyList;
	}

	public void searchPhysicianByCriteria(PhysicianSearch ps) {

		log.info("Inside Dao searchPhysicianByCriteria()");
		sessionFactory.getCurrentSession().save(ps);
	}

	public List<AddPhysician> searchPhysician(PhysicianSearch ps) {

		log.info("Inside Dao serachPhysician()");
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from AddPhysician p where p.state=:pstate and p.insPlan=:pinsPlan and p.department=:pdepartment");

		query.setParameter("pstate", ps.getState());
		query.setParameter("pinsPlan", ps.getInsurancePlan());
		query.setParameter("pdepartment", ps.getDepartment());

		List<AddPhysician> psList = query.list();
		return psList;
	}

	public void patientDiagnosisDetails1(PatientDiagnosisDetails pdd) {

		log.info("Inside Dao patientDiagnosisDetails()");
		sessionFactory.getCurrentSession().save(pdd);
	}

	public List<PatientDiagnosisDetails> fetchPatientDiagnosis() {

		log.info("Inside Dao fetchPatientDiagnosis()");
		Query query = sessionFactory.getCurrentSession().createQuery("from PatientDiagnosis pd");
		List<PatientDiagnosisDetails> diaList = query.list();
		return diaList;
	}

	public PatientEnrollment ViewpatientHistory(Integer patientId) {

		log.info("Inside Dao patientHistoryDetails()");
		PatientEnrollment pe = (PatientEnrollment) sessionFactory.getCurrentSession().get(PatientEnrollment.class,
				patientId);
		return pe;
	}

}