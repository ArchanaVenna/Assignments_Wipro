package com.wipro.archana.service;

import java.util.List;

import com.wipro.archana.entities.Teacher;

public interface TeacherService {

	Teacher saveTeacher(Teacher teacher);

	List<Teacher> getAllTeachers();

	Teacher getTeacherById(Long id);

	Teacher updateTeacher(Long id, Teacher teacher);

	void deleteTeacher(Long id);

	List<Teacher> getTeachersByExperienceGreaterThan(int experience);

	List<Teacher> getTeachersOlderThanNative(int age);
	

}
