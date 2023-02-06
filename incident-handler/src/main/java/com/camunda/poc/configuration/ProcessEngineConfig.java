package com.camunda.poc.configuration;

import java.util.Arrays;

import org.camunda.bpm.engine.impl.cfg.AbstractProcessEnginePlugin;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.camunda.poc.incident.handler.ExternalTaskIncident;
import com.camunda.poc.incident.handler.FailedJobIncident;

/**
 * To override the ProcessEngine default configuration
 */
@Configuration
public class ProcessEngineConfig extends AbstractProcessEnginePlugin{

	
	FailedJobIncident failedJobIncident;
	ExternalTaskIncident externalTaskIncident;
	
	
	/**
	 * @param failedJobIncident the failedJobIncident to set
	 */
	@Autowired
	public void setFailedJobIncident(FailedJobIncident failedJobIncident) {
		this.failedJobIncident = failedJobIncident;
	}


	/**
	 * @param externalTaskIncident the externalTaskIncident to set
	 */
	@Autowired
	public void setExternalTaskIncident(ExternalTaskIncident externalTaskIncident) {
		this.externalTaskIncident = externalTaskIncident;
	}


	@Override
	public void preInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
		processEngineConfiguration.setCompositeIncidentHandlersEnabled(true);
		processEngineConfiguration.setCustomIncidentHandlers(Arrays.asList(failedJobIncident,externalTaskIncident));
	}

	
}
