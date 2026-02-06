package com.sunless.JobPort.repo;

import com.sunless.JobPort.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {
        Optional<JobPost> findBypostProfile(String name);
        List<Optional<JobPost>> findByReqExperience(int exp);

}
