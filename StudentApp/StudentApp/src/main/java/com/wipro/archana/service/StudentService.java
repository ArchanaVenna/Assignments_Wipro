package com.wipro.archana.service;

import java.util.List;

import com.wipro.archana.entities.Student;




public interface StudentService {

	public List<Student> getAll();

	public void save(Student student);

	public Student getById(Long id);

	public void delete(Long id);

}