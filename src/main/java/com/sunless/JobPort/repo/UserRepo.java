package com.sunless.JobPort.repo;

import com.sunless.JobPort.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
