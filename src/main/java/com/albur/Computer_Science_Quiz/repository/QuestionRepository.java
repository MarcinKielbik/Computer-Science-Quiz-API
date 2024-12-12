package com.albur.Computer_Science_Quiz.repository;

import com.albur.Computer_Science_Quiz.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByLanguage(String language);
}
