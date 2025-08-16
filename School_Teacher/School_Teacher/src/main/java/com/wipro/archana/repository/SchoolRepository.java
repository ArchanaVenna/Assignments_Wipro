package com.wipro.archana.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.archana.entities.School;


@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

	

    // Native Query - Find schools by address
    @Query(value = "SELECT * FROM SCHOOL WHERE SCHOOL_ADDRESS = ?1", nativeQuery = true)
    List<School> findSchoolsByAddress(String schoolAddress);

	// Custom Method  - Search by school name

	List<School> findBySchoolNameIgnoreCase(String schoolName);
}
