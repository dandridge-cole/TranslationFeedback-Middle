package com.translationfeedback.repositories;

import com.translationfeedback.models.TranslationVersion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TranslationVersionRepository extends JpaRepository<TranslationVersion,Long> {

    public List<TranslationVersion> findAllByTranslationRoot(Integer rootId);
}
