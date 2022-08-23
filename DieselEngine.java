package com.practice.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine{

	private MechanicService theMechanicService;
	
	@Autowired
	public DieselEngine(MechanicService theMechanicService) {
		this.theMechanicService= theMechanicService;
	}
	
	
	
	@Override
	public String startengine() {
		
		return "Engine has started.";
	}



	@Override
	public String getFeedback() {
		
		return theMechanicService.noProblem();
	}
	
	

}
