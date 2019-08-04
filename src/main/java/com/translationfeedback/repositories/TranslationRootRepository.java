package com.translationfeedback.repositories;

import com.translationfeedback.models.Language;
import com.translationfeedback.models.OrigText;
import com.translationfeedback.models.TranslationRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TranslationRootRepository extends JpaRepository<TranslationRoot,Long>{

    List<TranslationRoot> findAllByOrigText(OrigText origText);

    List<TranslationRoot> findAllByLanguage(Language language);

    TranslationRoot getById(Long id);
}
