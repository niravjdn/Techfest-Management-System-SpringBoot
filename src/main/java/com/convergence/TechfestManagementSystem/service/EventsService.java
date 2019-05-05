package com.convergence.TechfestManagementSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.convergence.TechfestManagementSystem.model.Department;
import com.convergence.TechfestManagementSystem.model.Events;
import com.convergence.TechfestManagementSystem.repository.DepartmentRepository;
import com.convergence.TechfestManagementSystem.repository.EventRepository;


@Service
public class EventsService {

	@Autowired
	private EventRepository eventRepository; 
	
	public List<Events> getAllEvents() {
		List<Events> eventList = new ArrayList<Events>();
		eventRepository.findAll().forEach(eventList::add);
		return eventList;
	}

	public void addCollege(Events events) {
		eventRepository.save(events);
	}

	public void deleteEvents(Long id) {
		eventRepository.deleteById(id);
	}
}
