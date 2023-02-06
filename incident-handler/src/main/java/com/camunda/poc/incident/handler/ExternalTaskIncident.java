package com.camunda.poc.incident.handler;

import org.camunda.bpm.engine.runtime.Incident;
import org.springframework.stereotype.Component;

@Component
public class ExternalTaskIncident extends BaseIncidentHandler {

	@Override
	public String getIncidentHandlerType() {
		return Incident.EXTERNAL_TASK_HANDLER_TYPE;
	}


}
