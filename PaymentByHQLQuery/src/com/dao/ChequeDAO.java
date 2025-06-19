package com.dao;

import java.util.List;

import com.entity.Cheque;

public interface ChequeDAO {

	void saveCheque(Cheque cheque);

	void updateCheque(Cheque cheque);

	void deleteCheque(int id);

	Cheque getChequeById(int id);

	List<Cheque> getAllCheques();
}
