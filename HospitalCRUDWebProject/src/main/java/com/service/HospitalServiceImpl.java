package com.service;

import java.util.List;

import com.dao.HospitalDAO;
import com.dao.HospitalDAOImpl;
import com.entity.Hospital;

public class HospitalServiceImpl implements HospitalService{

	@Override
	public int addPatient(Hospital hospital) {
		
		HospitalDAO dao = new HospitalDAOImpl();
		int i = dao.insertPatient(hospital);
		return i;
	}

	@Override
	public int removePatient(int id) {
		
		HospitalDAO dao = new HospitalDAOImpl();
		int i = dao.deletePatient(id);
		return i;
	}

	@Override
	public int modifyPatient(Hospital hospital) {
		
		HospitalDAO dao = new HospitalDAOImpl();
		int i = dao.updatePatient(hospital);
		return i;
	}

	@Override
	public Hospital getPatientById(int id) {
		
		HospitalDAO dao = new HospitalDAOImpl();
		Hospital hos = dao.getPatientById(id);
		return hos;
	}

	@Override
	public List<Hospital> getAllPatients() {
		
		HospitalDAO dao = new HospitalDAOImpl();
		List<Hospital> list = dao.getAllPatients();
		return list;
	}

}
