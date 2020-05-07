package org.capg.services;

import java.util.List;
import java.util.Optional;

import org.capg.dao.TestDao;
import org.capg.entities.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class TestServiceImpl implements ITestService {

	 private TestDao testDao;
		

		public TestDao getTestDao() {
			return testDao;
		}

		@Autowired
		public void setTestDao(TestDao testDao) {
			this.testDao = testDao;
		}

		@Override
		public Test remove(Test test) {
		testDao.delete(test);
		return test;
		}

		@Override
		public List<Test> fetchAll() {
			List<Test> listOfTest=testDao.findAll();
			return listOfTest;
		}

		@Override
		public Test saveTest(Test test) {
			Test t=testDao.save(test);
			return t;
		}

		@Override
		public Test findById(String testId) {
			Optional<Test> optional=testDao.findById(testId);
			if(optional.isPresent())
			{
				Test t=optional.get();
				return t;
			}else
			return null;
		}



}
