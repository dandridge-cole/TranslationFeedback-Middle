package com.translationfeedback.repositories;

import com.translationfeedback.models.Feedback;
import com.translationfeedback.models.TranslationFragment;
import com.translationfeedback.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findAllByUserOrderByTranslationFragmentAscFragmentIndexStartAsc(User user);
    List<Feedback> findAllByUserAndTranslationFragmentOrderByFragmentIndexStart(User user, TranslationFragment translationFragment);
}
