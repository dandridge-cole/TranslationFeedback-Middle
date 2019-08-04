package com.translationfeedback.repositories;

import com.translationfeedback.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String passwordCrypt);
    User getById(Long id);
}
