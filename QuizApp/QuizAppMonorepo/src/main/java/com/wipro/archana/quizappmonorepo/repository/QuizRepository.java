package com.wipro.archana.quizappmonorepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.archana.quizappmonorepo.entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Integer>  {


}
