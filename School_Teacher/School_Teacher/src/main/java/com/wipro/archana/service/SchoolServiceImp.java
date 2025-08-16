package com.wipro.archana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.archana.entities.School;
import com.wipro.archana.repository.SchoolRepository;

import jakarta.validation.Valid;

@Service
public class SchoolServiceImp implements SchoolService {
	
	@Autowired
	private SchoolRepository schoolRepository;

	@Override
	public School save(@Valid School school) {
		
		return schoolRepository.save(school);
	}

	@Override
	public List<School> getAllSchools() {
		return schoolRepository.findAll();
	}

	@Override
	public School getSchoolById(Long id) {
		
		return schoolRepository.findById(id).orElseThrow(() -> new RuntimeException("School not found"));
	}

	@Override
	public School updateSchool(Long id, School school) {
		School existedschool=schoolRepository.findById(id).
                orElseThrow(()->new RuntimeException("User with that id not present" +id));
		existedschool.setSchoolName(school.getSchoolName());
		existedschool.setSchoolAddress(school.getSchoolAddress());
		existedschool.setTeachers(school.getTeachers());

     return schoolRepository.save(existedschool);
	}

	@Override
	public void deleteSchoolById(Long id) {
		schoolRepository.deleteById(id);
		
	}

	//custom
	@Override
	public List<School> searchSchoolByName(String schoolName) {
		
		return schoolRepository.findBySchoolNameIgnoreCase(schoolName);
	}

	//native
	@Override
	public List<School> getSchoolByAddress(String schoolAddress) {
		 return schoolRepository.findSchoolsByAddress(schoolAddress);
	}

	@Override
	public School patchUpdateSchool(Long id, String schoolName, String schoolAddress) {
		School school = getSchoolById(id);
        if (schoolName != null) school.setSchoolName(schoolName);
        if (schoolAddress != null) school.setSchoolAddress(schoolAddress);
		return schoolRepository.save(school);
	}
	
	
	

}
