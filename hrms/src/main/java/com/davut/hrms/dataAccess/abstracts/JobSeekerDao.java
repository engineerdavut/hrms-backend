package com.davut.hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import com.davut.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer>{

}
