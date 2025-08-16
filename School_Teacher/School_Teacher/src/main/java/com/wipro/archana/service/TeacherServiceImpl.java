package com.wipro.archana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.archana.entities.Teacher;
import com.wipro.archana.repository.TeacherRepository;


@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		
		return teacherRepository.findAll();
	}

	@Override
	public Teacher getTeacherById(Long id) {
		return teacherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Teacher not found"));
	}

	@Override
	public Teacher updateTeacher(Long id, Teacher teacher) {
		Teacher teach = getTeacherById(id);
        teach.setTeacherName(teacher.getTeacherName());
        teach.setTeacherAddress(teacher.getTeacherAddress());
        teach.setQualification(teacher.getQualification());
        teach.setAge(teacher.getAge());
        teach.setDob(teacher.getDob());
        teach.setExperience(teacher.getExperience());
        return teacherRepository.save(teach);
	}

	@Override
	public void deleteTeacher(Long id) {
		teacherRepository.deleteById(id);
		
	}

	//custom
	@Override
	public List<Teacher> getTeachersByExperienceGreaterThan(int experience) {
		return teacherRepository.findByExperienceGreaterThan(experience);
	}

	//native sql
	@Override
	public List<Teacher> getTeachersOlderThanNative(int age) {
		return teacherRepository.findTeachersOlderThanNative(age);
	}

}
