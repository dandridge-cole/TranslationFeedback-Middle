package com.translationfeedback.repositories;

import com.translationfeedback.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    public List<Feedback> findAllByIdOrderByTranslationFragmentFragmentIndexStartAsc(Long id);
}
