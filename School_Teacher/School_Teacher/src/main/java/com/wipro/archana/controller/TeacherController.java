package com.wipro.archana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.archana.entities.Teacher;
import com.wipro.archana.service.TeacherService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor //no need to create constructor 
@Slf4j
public class TeacherController {
	 @Autowired
	private TeacherService teacherService;
   @PostMapping("/createTeacher")
	public Teacher createTeacher(@RequestBody Teacher teacher) 
   {
	   return teacherService.saveTeacher(teacher);
	}
   @GetMapping("/getAllTeachers")
   public List<Teacher> getAllTeachers() {
       return teacherService.getAllTeachers();
   }

   // Read by ID
   @GetMapping("/getTeacherById/{id}")
   public Teacher getTeacherById(@PathVariable Long id) {
       return teacherService.getTeacherById(id);
   }

   // Update 
   @PutMapping("/updateteacher/{id}")
   public Teacher updateTeacher(@PathVariable Long id, @RequestBody Teacher teacher) {
       return teacherService.updateTeacher(id, teacher);
   }
   
   // Delete
   @DeleteMapping("/deleteTeacher/{id}")
   public void deleteTeacher(@PathVariable Long id) {
       teacherService.deleteTeacher(id);
   }
   
   //custom
   @GetMapping("/getTeachersByExperienceGreaterThan/{experience}")
   public List<Teacher> getTeachersByExperienceGreaterThan(@PathVariable int experience) {
       return teacherService.getTeachersByExperienceGreaterThan(experience);
   }
   
   @GetMapping("/getTeachersOlderThanNative/{age}")
   public List<Teacher> getTeachersOlderThanNative(@PathVariable int age) {
       return teacherService.getTeachersOlderThanNative(age);
   }
	

}
