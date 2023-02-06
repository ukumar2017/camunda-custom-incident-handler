package com.camunda.poc.incident.handler;

import org.camunda.bpm.engine.impl.incident.IncidentContext;
import org.camunda.bpm.engine.impl.incident.IncidentHandler;
import org.camunda.bpm.engine.runtime.Incident;

public abstract class BaseIncidentHandler implements IncidentHandler {

	@Override
	public Incident handleIncident(IncidentContext context, String message) {
		//To-Do as per needed
		return null;
	}

	@Override
	public void resolveIncident(IncidentContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteIncident(IncidentContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
