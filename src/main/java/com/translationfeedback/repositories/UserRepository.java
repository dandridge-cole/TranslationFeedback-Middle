package com.translationfeedback.repositories;

import com.translationfeedback.models.Language;
import com.translationfeedback.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String passwordCrypt);
    User getById(Long id);
    //List<User> findAllByLanguages(Language lang);
}
