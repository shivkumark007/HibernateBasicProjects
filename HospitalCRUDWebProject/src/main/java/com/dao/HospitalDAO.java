package com.dao;

import java.util.List;

import com.entity.Hospital;

public interface HospitalDAO {
	
	int insertPatient(Hospital hospital);
	
	int deletePatient(int id);
	
	int updatePatient(Hospital hospital);
	
	Hospital getPatientById(int id);
	
	List<Hospital> getAllPatients();

}
