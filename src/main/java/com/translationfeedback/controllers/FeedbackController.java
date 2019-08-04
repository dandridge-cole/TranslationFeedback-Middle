package com.translationfeedback.controllers;

import com.translationfeedback.models.Feedback;
import com.translationfeedback.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FeedbackController {

    private FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService){ this.feedbackService=feedbackService;}

    @GetMapping("/feedback")
    public List<Feedback> getAllFeedback(){return this.feedbackService.getAllFeedback();}

    @GetMapping("/feedback/{id}")
    public Feedback getFeedbackById(@PathVariable Long id){
        return this.feedbackService.getFeedbackById(id);
    }

    @GetMapping("/users/{id}/feedback")
    public List<Feedback> getFeedbackByUser(@PathVariable Long userId){
        return this.feedbackService.getFeedbackByUserId(userId);
    }

    @GetMapping("/users/{userId}/fragments/{fragmentId}/feedback")
    public List<Feedback> getFeedbackByUserAndFragment(@PathVariable Long userId, @PathVariable Long fragmentId){
        return this.feedbackService.getFeedbackByUserAndFragment(userId,fragmentId);
    }

    @PostMapping("/feedback")
    public Feedback createFeedback(@RequestBody Feedback feedback){
        return this.feedbackService.createFeedback(feedback);
    }
}
