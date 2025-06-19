package com.service;

import java.util.List;

import com.entity.Hospital;

public interface HospitalService {
	int addPatient(Hospital hospital);
	
	int removePatient(int id);
	
	int modifyPatient(Hospital hospital);
	
	Hospital getPatientById(int id);
	
	List<Hospital> getAllPatients();

}
