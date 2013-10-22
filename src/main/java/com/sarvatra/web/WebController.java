package com.sarvatra.web;

import com.sarvatra.smui.services.Service;
import com.sarvatra.smui.services.model.CategoryList;

public class WebController {
	Service mainController;

	public Service getMainController() {
		return mainController;
	}

	public void setMainController(Service mainController) {
		this.mainController = mainController;
	}
}
