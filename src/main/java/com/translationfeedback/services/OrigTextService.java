package com.translationfeedback.services;

import com.translationfeedback.repositories.OrigTextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrigTextService {

    private OrigTextRepository origTextRepository;

    @Autowired
    public OrigTextService(OrigTextRepository origTextRepository){this.origTextRepository=origTextRepository;}
}
