package net.refactoreverything.headfirstspringboot.controller.api;

import net.refactoreverything.headfirstspringboot.model.Job;
import net.refactoreverything.headfirstspringboot.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class JobApiController {

    @Autowired
    JobService jobService;

    @GetMapping("/jobs")
    @ResponseBody
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @PostMapping(path = "/jobs", produces = {"application/json"}, consumes = {"application/json"})
    @ResponseBody
    public Job create(@RequestBody Job job) {
        return jobService.createJob(job);
    }

    @GetMapping("/jobs/{id}")
    @ResponseBody
    public Job getJob(@PathVariable("id") int id) {
        return jobService.findOne(id);
    }

    @PutMapping("/jobs/{id}")
    @ResponseBody
    public Job updateJob(@PathVariable("id") int id, @RequestBody Job job) {
        job.setJobId(id);
        return jobService.updateOne(job);
    }

    @DeleteMapping("/jobs/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteJob(@PathVariable("id") int id) {
        Job job = jobService.deleteOne(id);
        if (job != null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
