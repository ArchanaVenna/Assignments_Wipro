package com.wipro.archana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.archana.entities.School;
import com.wipro.archana.service.SchoolService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor //no need to create constructor 
@Slf4j
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService; 
	
	@PostMapping("/addSchool")
	public School addSchool(@Valid @RequestBody School school) {
		return schoolService.save(school);
	}
	
	@GetMapping("/getSchool")
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }
	@GetMapping("/getSchool/{id}")
    public School getSchool(@PathVariable Long id) {
        return schoolService.getSchoolById(id);
    }
	 @PutMapping("/updateSchool/{id}")
	    public School updateSchool(@PathVariable Long id, @RequestBody School school) {
	        return schoolService.updateSchool(id, school);
	    }
	 
	 @PatchMapping("/patchUpdateSchool/{id}")
	    public School patchUpdateSchool(@PathVariable Long id,
	                              @RequestParam(required = false) String schoolName,
	                              @RequestParam(required = false) String schoolAddress) {
	        return schoolService.patchUpdateSchool(id, schoolName, schoolAddress);
	    }

	 @DeleteMapping("/deleteSchoolById/{id}")
	    public void deleteSchoolById(@PathVariable Long id) {
	        schoolService.deleteSchoolById(id);
	    }
	 
	 @GetMapping("/searchSchoolByName/{schoolName}")
		public List<School> searchSchoolByName(@PathVariable String schoolName) {
			return schoolService.searchSchoolByName(schoolName);
			
		}
	 //native
	 @GetMapping("/getSchoolByAddress/{schoolAddress}")
	 public List<School> getSchoolByAddress(@PathVariable String schoolAddress) {
	     return schoolService.getSchoolByAddress(schoolAddress);
	 }
}
