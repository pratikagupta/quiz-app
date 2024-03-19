package com.phoenix.quiz.app.dao;

import com.phoenix.quiz.app.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
