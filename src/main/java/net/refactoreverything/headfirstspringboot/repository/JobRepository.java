package net.refactoreverything.headfirstspringboot.repository;

import net.refactoreverything.headfirstspringboot.model.Job;
import net.refactoreverything.headfirstspringboot.model.TechStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {
    List<Job> jobs = new ArrayList<>();

    public JobRepository() {
        jobs.add(new Job(1, "Java Developer", "A fullstack Java developer", 2, "2024-06-21", List.of("Java", "JavaScript")));
        jobs.add(new Job(2, "Data Scientist", "Responsible for data analysis and machine learning models", 3, "2024-06-21", List.of("Python", "R")));
        jobs.add(new Job(3, "Web Developer", "Focus on frontend technologies", 1, "2024-06-21", List.of("HTML", "CSS", "JavaScript")));
        jobs.add(new Job(4, "System Administrator", "Manage IT infrastructure", 5, "2024-06-21", List.of("Linux", "Bash")));
        jobs.add(new Job(5, "Android Developer", "Develop mobile applications", 2, "2024-06-21", List.of("Java", "Kotlin")));
        jobs.add(new Job(6, "Project Manager", "Manage projects and coordinate teams", 4, "2024-06-21", List.of("Agile", "Scrum")));
        jobs.add(new Job(7, "UX/UI Designer", "Design interfaces and user experiences", 3, "2024-06-21", List.of("Figma", "Sketch")));
        jobs.add(new Job(8, "DevOps Engineer", "Bridge development and operations", 4, "2024-06-21", List.of("Docker", "Kubernetes")));
        jobs.add(new Job(9, "Database Administrator", "Maintain and optimize databases", 5, "2024-06-21", List.of("SQL", "PostgreSQL")));
        jobs.add(new Job(10, "Security Analyst", "Ensure information security", 3, "2024-06-21", List.of("Cybersecurity", "Networks")));
    }

    public Job createJob(Job job) {
        job.setJobId(jobs.size() + 1);
        jobs.add(job);
        return job;
    }

    public List<Job> getAllJobs() {
        return jobs;
    }

    public Job findOne(int id) {
        for (Job job : jobs) {
            if (job.getJobId() == id) {
                return job;
            }
        }
        return null;
    }

    public Job updateOne(Job job) {
        for (int i = 0; i < jobs.size(); i++) {
            if (jobs.get(i).getJobId() == job.getJobId()) {
                jobs.set(i, job);
            }
        }
        return job;
    }

    public Job deleteOne(int id) {
        Job removedJob = null;
        for (Job job : jobs) {
            if (job.getJobId() == id) {
                removedJob = job;
            }
        }
        if (removedJob != null) {
            jobs.remove(removedJob);
        }
        return removedJob;
    }
}
