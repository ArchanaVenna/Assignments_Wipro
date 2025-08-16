package com.wipro.archana.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.archana.entities.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	// Custom Method  - Teachers with experience greater than X
    List<Teacher> findByExperienceGreaterThan(int exp);

    // Native Query - Teachers older than a specific age
    @Query(value = "SELECT * FROM TEACHER WHERE AGE > ?1", nativeQuery = true)
    List<Teacher> findTeachersOlderThanNative(int age);
}
