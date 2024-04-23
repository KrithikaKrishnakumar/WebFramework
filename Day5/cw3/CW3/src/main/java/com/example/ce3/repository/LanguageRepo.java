package com.example.ce3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ce3.model.Language;

public interface LanguageRepo extends JpaRepository<Language, Integer> {
    
}
