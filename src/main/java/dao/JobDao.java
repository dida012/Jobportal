package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Job;

public class JobDao {
    private EntityManagerFactory entityManagerFactory;

    public JobDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("your-persistence-unit-name");
    }

    public void addJob(Job job) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(job);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public Job getJobById(String jobId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return entityManager.find(Job.class, jobId);
        } finally {
            entityManager.close();
        }
    }

    public void updateJob(Job job) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.merge(job);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public void deleteJob(Job job) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Job mergedJob = entityManager.merge(job);
            entityManager.remove(mergedJob);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public void close() {
        entityManagerFactory.close();
    }
}
