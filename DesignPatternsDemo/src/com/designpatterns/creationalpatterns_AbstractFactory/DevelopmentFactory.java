package com.designpatterns.creationalpatterns_AbstractFactory;

public class DevelopmentFactory extends AbstractFactory{

	public DevelopmentInterface getDevelopmentTasks(String taskName)
	{
		switch (taskName){
		
		case "DevelopmentUI":
			return new DevelopmentUI();
			
			
		case "DevelopmentBackend":
			return new DevelopmentBackend();
			
			
		case "DevelopmentAPI":
			return new DevelopmentAPI();
			
			default:
				return null;
			
		
		}
		
		
	}

	

	@Override
	TestingInterface getTestingTasks(String taskName) {
		// TODO Auto-generated method stub
		return null;
	}
}
