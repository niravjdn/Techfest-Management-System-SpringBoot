package com.convergence.TechfestManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.convergence.TechfestManagementSystem.model.Branch;
import com.convergence.TechfestManagementSystem.model.Events;
import com.convergence.TechfestManagementSystem.service.BranchService;
import com.convergence.TechfestManagementSystem.service.EventsService;

@RestController
@RequestMapping("/events")
public class EventsController {
	
	@Autowired
	private EventsService eventService;
	
	@GetMapping("/events")
	public List<Events> getEvents(){
		return eventService.getAllEvents();
	}
	
	@RequestMapping(value = "/events", method = RequestMethod.POST)
	public void addBranch(@RequestBody Events events){
		eventService.addCollege(events);
	}
	
	@RequestMapping(value = "/events/{id}", method = RequestMethod.DELETE)
	public void deleteBranch(@PathVariable Long id){
		eventService.deleteEvents(id);
	}
}
