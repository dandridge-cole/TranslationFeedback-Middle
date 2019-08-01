package com.translationfeedback.repositories;

import com.translationfeedback.models.TranslationRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TranslationRootRepository extends JpaRepository<TranslationRoot,Long>{

    public List<TranslationRoot> findAllByOrigText(Integer origTextId);
}
