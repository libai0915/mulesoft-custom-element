package com.mulesoft.training;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleException;
import org.mule.api.lifecycle.Callable;
import org.mule.api.lifecycle.Startable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MuleLifeCycleComponent implements Startable, Callable {
	
	private static final Logger logger = LogManager.getLogger("com.mulesoft.training.Logger");
	
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		logger.info("******Component executed******");
		return eventContext.getMessage();
	}

	@Override
	public void start() throws MuleException {
		// TODO Auto-generated method stub
		logger.info("Component initiated startup");
	}

}
