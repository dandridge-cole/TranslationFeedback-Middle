package com.translationfeedback.repositories;

import com.translationfeedback.models.OrigText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrigTextRepository extends JpaRepository<OrigText,Long> {
}
