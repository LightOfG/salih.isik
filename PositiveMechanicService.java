package com.practice.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PositiveMechanicService implements MechanicService {

	

	
	
	@Override
	public String EngineBreakdown() {
		
		return "Somethings wrong in engine.";
	}

	@Override
	public String noProblem() {
		
		return "Everything is ok!";
	}

}
