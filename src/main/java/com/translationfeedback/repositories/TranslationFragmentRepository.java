package com.translationfeedback.repositories;

import com.translationfeedback.models.TranslationFragment;
import com.translationfeedback.models.TranslationVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TranslationFragmentRepository extends JpaRepository<TranslationFragment,Long> {

    List<TranslationFragment> findAllByTranslationVersionOrderByOrigTextIndexStart(TranslationVersion translationVersion);

    TranslationFragment getById(Long id);
}
