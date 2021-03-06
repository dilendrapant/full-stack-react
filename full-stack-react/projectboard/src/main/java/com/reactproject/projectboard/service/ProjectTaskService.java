package com.reactproject.projectboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactproject.projectboard.model.ProjectTask;
import com.reactproject.projectboard.repository.ProjectTaskRepository;

@Service
public class ProjectTaskService {

	@Autowired
	private ProjectTaskRepository projectTaskRepository;

	public ProjectTask saveOrUpdatePT(ProjectTask projectTask) {

		return projectTaskRepository.save(projectTask);
	}

	public Iterable<ProjectTask> findAll() {

		return projectTaskRepository.findAll();
	}
	
	public ProjectTask findById(Long id) {
		
		return projectTaskRepository.getById(id);
	}
	
	public void delete(Long id) {
		
		ProjectTask pTask=findById(id);
		projectTaskRepository.delete(pTask);
	}
}
