package com.wipro.archana.service;

import java.util.List;

import com.wipro.archana.entities.School;

import jakarta.validation.Valid;

public interface SchoolService {

	School save(@Valid School school);

	List<School> getAllSchools();

	School getSchoolById(Long id);

	School updateSchool(Long id, School school);



	

	List<School> searchSchoolByName(String schoolName);

	void deleteSchoolById(Long id);

	List<School> getSchoolByAddress(String schoolAddress);

	School patchUpdateSchool(Long id, String schoolName, String schoolAddress);

}
