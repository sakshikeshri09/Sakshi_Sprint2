package org.capg.services;

import java.util.List;

import org.capg.entities.Test;

public interface ITestService {

	Test remove(Test test);

	List<Test> fetchAll();

	Test findById(String testId);

	Test saveTest(Test test);
}
