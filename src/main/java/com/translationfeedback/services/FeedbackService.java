package com.translationfeedback.services;

import com.translationfeedback.models.Feedback;
import com.translationfeedback.models.TranslationFragment;
import com.translationfeedback.models.User;
import com.translationfeedback.repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    private FeedbackRepository feedbackRepository;
    private TranslationFragmentService translationFragmentService;
    private UserService userService;


    @Autowired
    public FeedbackService(FeedbackRepository feedbackRepository, UserService userService, TranslationFragmentService translationFragmentService){
        this.feedbackRepository = feedbackRepository;
        this.translationFragmentService=translationFragmentService;
        this.userService=userService;
    }

    public Feedback createFeedback(Feedback feedback){return this.feedbackRepository.save(feedback);}
    public Feedback getFeedbackById(Long id){return this.feedbackRepository.getOne(id);}
    public List<Feedback> getFeedbackByUserId(Long userId){
        User user = this.userService.getUserById(userId);
        return this.feedbackRepository.findAllByUserOrderByTranslationFragmentAscFragmentIndexStartAsc(user);
    }
    public List<Feedback> getAllFeedback(){return this.feedbackRepository.findAll();}
    public List<Feedback> getFeedbackByUserAndFragment(Long userId, Long fragmentId){
        TranslationFragment translationFragment = this.translationFragmentService.getFragmentById(fragmentId);
        User user = this.userService.getUserById(userId);
        return this.feedbackRepository.findAllByUserAndTranslationFragmentOrderByFragmentIndexStart(user, translationFragment);
    }

}
