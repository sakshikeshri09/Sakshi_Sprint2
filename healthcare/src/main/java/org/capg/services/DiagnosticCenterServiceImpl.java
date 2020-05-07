package org.capg.services;

import java.util.List;
import java.util.Optional;

import org.capg.dao.DiagnosticCenterDao;
import org.capg.entities.DiagnosticCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class DiagnosticCenterServiceImpl  implements IDiagnosticCenterService{

	DiagnosticCenterDao centerDao;
	public DiagnosticCenterDao getCenterDao() {
		return centerDao;
	}

	@Autowired
	public void setCenterDao(DiagnosticCenterDao centerDao) {
		this.centerDao = centerDao;
	}

	@Override
	public DiagnosticCenter save(DiagnosticCenter center) {
		
			DiagnosticCenter c=centerDao.save(center);
			return c;
		}

	@Override
	public DiagnosticCenter remove(DiagnosticCenter center) {
	centerDao.delete(center);
		return center ;
	}

	@Override
	public List<DiagnosticCenter> fetchAllCenter() {
		List<DiagnosticCenter> listOfCenter=centerDao.findAll();
		return listOfCenter;
	}

	@Override
	public DiagnosticCenter findById(String centerId) {
		Optional<DiagnosticCenter> optional=centerDao.findById(centerId);
		if(optional.isPresent())
		{
			DiagnosticCenter center=optional.get();
			return center;
		}else
		return null;
	}

}
