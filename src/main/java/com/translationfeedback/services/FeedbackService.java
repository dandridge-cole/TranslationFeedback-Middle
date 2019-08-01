package com.translationfeedback.services;

import com.translationfeedback.models.Feedback;
import com.translationfeedback.repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    private FeedbackRepository feedbackRepository;

    @Autowired
    public FeedbackService(FeedbackRepository feedbackRepository){ this.feedbackRepository = feedbackRepository;}

    public Feedback createFeedback(Feedback feedback){return this.feedbackRepository.save(feedback);}
    public Feedback getFeedbackById(Long id){return this.feedbackRepository.getOne(id);}
    public List<Feedback> getFeedbackByUserId(Long id){return this.feedbackRepository.findAllByIdOrderByTranslationFragmentFragmentIndexStartAsc(id);}
    public List<Feedback> getAllFeedback(){return this.feedbackRepository.findAll();}

}
