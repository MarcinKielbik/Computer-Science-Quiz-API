package com.albur.Computer_Science_Quiz.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Version;  // Import the @Version annotation
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionText;

    private String option1;
    private String option2;
    private String option3;
    private String option4;

    private String correctOption;

    private String language;

    @Version  // Add the @Version annotation here
    private Integer version;  // This will be used by Hibernate for optimistic locking

    public void setLanguage(String language) {
        this.language = language;
    }

}
