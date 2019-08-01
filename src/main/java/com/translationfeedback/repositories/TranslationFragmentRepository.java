package com.translationfeedback.repositories;

import com.translationfeedback.models.TranslationFragment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TranslationFragmentRepository extends JpaRepository<TranslationFragment,Long> {

    public List<TranslationFragment> findAllByTranslationVersionOrderByOrigTextIndexStart(Integer versionId);
}
