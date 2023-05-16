package controller;

import model.Job;
import service.JobService;

import java.util.List;

public class JobController {
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    public void addJob(Job job) {
        jobService.addJob(job);
        System.out.println("Job added successfully: " + job);
    }

    public Job getJobById(String jobId) {
        return jobService.getJobById(jobId);
    }

    public void updateJob(Job job) {
        jobService.updateJob(job);
        System.out.println("Job updated successfully: " + job);
    }

    public void deleteJob(Job job) {
        jobService.deleteJob(job);
        System.out.println("Job deleted successfully: " + job);
    }

    public List<Job> getAllJobs() {
        return jobService.findAllJobs();
    }
}
