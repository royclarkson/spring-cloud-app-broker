package org.springframework.cloud.appbroker.workflow.createserviceinstance.action.appdeploy;

import java.util.Map;

public class BackingAppState {

	private Map<String, String> state;

	public BackingAppState(Map<String, String> state) {
		this.state = state;
	}

	public Map<String, String> getState() {
		return state;
	}
}