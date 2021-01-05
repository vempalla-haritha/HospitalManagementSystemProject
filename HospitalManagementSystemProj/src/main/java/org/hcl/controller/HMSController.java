package org.hcl.controller;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.hcl.model.AddPhysician;
import org.hcl.model.PatientDiagnosisDetails;
import org.hcl.model.PatientEnrollment;
import org.hcl.model.PhysicianSearch;
import org.hcl.service.HMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HMSController {
	private static Logger log = Logger.getLogger(HMSController.class);
	@Autowired
	private HMSService hmsService;

	@RequestMapping(value = "/patient", method = RequestMethod.GET)
	public String loadRegistrationForm(ModelMap map) {
		log.info("Request inside loadRegistration method");
		PatientEnrollment pe = new PatientEnrollment();
		map.addAttribute("enrollForm", pe);
		return "EnrollPatient";
	}

	@RequestMapping(value = "/enroll", method = RequestMethod.POST)
	public String enrolling(@Validated @ModelAttribute("enrollForm") PatientEnrollment pe, BindingResult result,
			ModelMap map) {
		String viewPage;
		if (result.hasErrors()) {
			log.info("validation errors occured");
			viewPage = "EnrollPatient";
		} else {
			log.info("invoking enrolling method");
			Random r = new Random();
			int pid = r.nextInt(899) + 100;
			hmsService.enrolling(pe);
			List<PatientEnrollment> patList = hmsService.fetchPatient();
			map.addAttribute("patientList", patList);
			viewPage = "enrollmentsuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/physician", method = RequestMethod.GET)
	public String loadPhysician(ModelMap map) {
		log.info("Request inside loadPhysician method");
		AddPhysician addphy = new AddPhysician();
		map.addAttribute("physicianForm", addphy);
		return "AddPhysician";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPhysician(@Validated @ModelAttribute("physicianForm") AddPhysician addphy, BindingResult result,
			ModelMap map) {
		String viewPage;
		if (result.hasErrors()) {
			log.info("validation errors occured");
			viewPage = "AddPhysician";
		} else {
			log.info("invoking addPhysician method");
			Random r = new Random();
			int phyid = r.nextInt(899) + 100;
			String pid = "PR" + phyid;
			hmsService.addPhysician(addphy);
			List<AddPhysician> phyList = hmsService.fetchPhysician();
			map.addAttribute("physicianList", phyList);
			viewPage = "physiciansuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String loadSearch(ModelMap map) {
		log.info("Request inside loadSearch method");
		PhysicianSearch ps = new PhysicianSearch();
		map.addAttribute("searchForm", ps);
		return "PhysicianSearch";
	}

	@RequestMapping(value = "/physearch", method = RequestMethod.POST)
	public String searchPhysicianByCriteria(@Validated @ModelAttribute("searchForm") PhysicianSearch ps,
			BindingResult result, ModelMap map) {
		String viewPage;
		if (result.hasErrors()) {
			log.info("validation errors occured");
			viewPage = "PhysicianSearch";
		} else {
			log.info("invoking searchPhysicianByCriteria method");

			List<AddPhysician> psList = hmsService.searchPhysician(ps);
			map.addAttribute("physicianList", psList);
			viewPage = "physiciansuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/diagnosis", method = RequestMethod.GET)
	public String loadDiagnosisForm(ModelMap map) {
		log.info("Request inside loadDiagnosisForm method");
		PatientDiagnosisDetails pdd = new PatientDiagnosisDetails();
		map.addAttribute("diagnosisForm", pdd);
		return "PatientDiagnosis";
	}

	@RequestMapping(value = "/dia", method = RequestMethod.POST)
	public String patientDiagnosisDetails(@Validated @ModelAttribute("diagnosisForm") PatientDiagnosisDetails pdd,
			BindingResult result, ModelMap map) {
		String viewPage;
		if (result.hasErrors()) {
			log.info("validation errors occured");
			viewPage = "PatientDiagnosis";
		} else {
			log.info("invoking patientDiagnosisDetails method");
			Random r = new Random();
			int daid = r.nextInt(899) + 100;
			pdd.setDiagnosisId(daid);
			hmsService.patientDiagnosisDetails(pdd);
			List<PatientDiagnosisDetails> diaList = hmsService.fetchPatientDiagnosis();
			map.addAttribute("diagnosisList", diaList);
			viewPage = "diagnosissuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/view/{patId}")
	public String patientHistoryDetails(@PathVariable("patientId") Integer patientId, ModelMap map) {
		log.info("Patient History Details");
		PatientEnrollment pe = hmsService.patientHistoryDetails(patientId);
		map.addAttribute("viewForm", pe);
		return "ViewPatientHistory";
	}
}
