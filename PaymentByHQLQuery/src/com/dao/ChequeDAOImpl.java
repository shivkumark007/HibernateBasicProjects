package com.dao;

import java.util.List;

import javax.persistence.Query;

import com.entity.Cheque;

public class ChequeDAOImpl implements ChequeDAO{

	@Override
	public void saveCheque(Cheque cheque) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCheque(Cheque cheque) {
		  Query query = session.createQuery("update Cheque set ChequeType=:ChequeType where payId=:payId");		
	}

	@Override
	public void deleteCheque(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cheque getChequeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cheque> getAllCheques() {
		// TODO Auto-generated method stub
		return null;
	}

}
