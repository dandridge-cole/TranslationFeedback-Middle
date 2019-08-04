package com.translationfeedback.repositories;

import com.translationfeedback.models.Language;
import com.translationfeedback.models.OrigText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrigTextRepository extends JpaRepository<OrigText,Long> {

    List<OrigText> findAllByLanguage(Language language);

    OrigText getByName(String name);

    OrigText getById(Long id);
}
