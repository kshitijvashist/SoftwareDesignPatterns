package com.designpatterns.creationalpatterns_FactoryPatterns;

public class FactoryDesignPatterns {

	public DeliveryInterface getInstance(String taskName)
	{
		switch (taskName){
		
		case "Development":
			return new TaskDevelopment();
			
			
		case "Deployment":
			return new TaskDeployment();
			
			
		case "Testing":
			return new TaskTesting();
			
			default:
				return null;
			
				
		
		}
		
		
	}
}
