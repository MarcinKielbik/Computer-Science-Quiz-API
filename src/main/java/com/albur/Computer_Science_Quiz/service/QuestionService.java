package com.albur.Computer_Science_Quiz.service;

import com.albur.Computer_Science_Quiz.models.Question;
import com.albur.Computer_Science_Quiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions(String language) {
        return questionRepository.findByLanguage(language);
    }

    public Optional<Question> getQuestionById(Long id) {
        return questionRepository.findById(id);
    }

    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Question updateQuestion(Long id, Question updatedQuestion) {
        if (questionRepository.existsById(id)) {
            return questionRepository.save(updatedQuestion); // Lombok automatycznie ustawi id
        }
        return null;
    }

    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}
