package net.refactoreverything.headfirstspringboot.service;

import net.refactoreverything.headfirstspringboot.model.Job;
import net.refactoreverything.headfirstspringboot.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepository jobRepository;

    public Job createJob(Job job) {
        return jobRepository.createJob(job);
    }

    public List<Job> getAllJobs() {
        return jobRepository.getAllJobs();
    }

    public Job findOne(int id) {
        return jobRepository.findOne(id);
    }

    public Job updateOne(Job job) {
        return jobRepository.updateOne(job);
    }

    public Job deleteOne(int id) {
        return jobRepository.deleteOne(id);
    }
}
