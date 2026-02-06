package com.sunless.JobPort.service;


import com.sunless.JobPort.model.JobPost;
import com.sunless.JobPort.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
   private JobRepo repo;


    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }
    public void addJob(JobPost jobPost){
        repo.save(jobPost);
    }

    public Optional<JobPost> getJob(int postId) {
        return repo.findById(postId);
    }

    public void del(int postId) {
        repo.deleteById(postId);
    }

    public void update(JobPost job) {
        repo.save(job);
    }

    public Optional<JobPost> getByName(String name) {
        return repo.findBypostProfile(name);
    }

    public List<Optional<JobPost>> getByReqExperience(int reqExperience) {
        return repo.findByReqExperience(reqExperience);
    }



}
