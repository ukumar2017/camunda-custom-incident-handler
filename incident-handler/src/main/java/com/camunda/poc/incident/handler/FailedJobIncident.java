package com.camunda.poc.incident.handler;

import org.camunda.bpm.engine.runtime.Incident;
import org.springframework.stereotype.Component;

@Component
public class FailedJobIncident extends BaseIncidentHandler {

	@Override
	public String getIncidentHandlerType() {
		
		return Incident.FAILED_JOB_HANDLER_TYPE;
	}

}
