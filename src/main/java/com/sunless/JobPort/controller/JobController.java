package com.sunless.JobPort.controller;


import com.sunless.JobPort.model.JobPost;
import com.sunless.JobPort.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @PostMapping("job")
    public void addjob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
    }

    @GetMapping({"jobs"})
    public List<JobPost> jobs(Model m){
        List<JobPost> jobs=service.getAllJobs();
        m.addAttribute("jobPosts",jobs);
        return service.getAllJobs();
    }

    @GetMapping("getJob/{postId}")
    public Optional<JobPost> getJob(@PathVariable int postId){
        return service.getJob(postId);
    }


    @PostMapping({"handleForm"})
    public String handleForm(JobPost jobPost){
        System.out.println("hello");
        service.addJob(jobPost);
        return "success";
    }
    @DeleteMapping("del/{postId}")
    public void del(@PathVariable int postId){
        service.del(postId);
    }
    @PutMapping("job")
    public Optional<JobPost> update(@RequestBody JobPost job){
        service.update(job);
        return service.getJob(job.postId);
    }
    @GetMapping("getByName/{name}")
    public Optional<JobPost> getByName(@PathVariable String name){
        return service.getByName(name);
    }

    @GetMapping("getByExp/{reqExperience}")
    public List<Optional<JobPost>> getByReqExperience(@PathVariable int reqExperience){
        return service.getByReqExperience(reqExperience);
    }

}
