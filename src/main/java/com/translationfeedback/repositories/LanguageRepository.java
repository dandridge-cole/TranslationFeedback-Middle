package com.translationfeedback.repositories;

import com.translationfeedback.models.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language,Long> {
    Language getByName(String name);
}
