package service;

import model.Job;

import java.util.List;

public interface JobService {
    void addJob(Job job);
    Job getJobById(String jobId);
    void updateJob(Job job);
    void deleteJob(Job job);
    List<Job> findAllJobs();
}

public class JobServiceImpl implements JobService {
    private JobDao jobDao;

    public JobServiceImpl(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Override
    public void addJob(Job job) {
        jobDao.addJob(job);
    }

    @Override
    public Job getJobById(String jobId) {
        return jobDao.getJobById(jobId);
    }

    @Override
    public void updateJob(Job job) {
        jobDao.updateJob(job);
    }

    @Override
    public void deleteJob(Job job) {
        jobDao.deleteJob(job);
    }

    @Override
    public List<Job> findAllJobs() {
        return jobDao.getAllJobs();
    }
}