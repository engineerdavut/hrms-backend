package com.davut.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.davut.hrms.core.DataResult;
import com.davut.hrms.entities.concretes.JobPosition;

@Service
public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();

}
