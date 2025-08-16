package com.wipro.archana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.archana.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
