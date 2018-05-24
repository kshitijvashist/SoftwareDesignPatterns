package com.designpatterns.creationalpatterns_AbstractFactory;

public class TestingFactory extends AbstractFactory{

	public TestingInterface getTestingTasks(String taskName)
	{
		switch (taskName){
		
		case "TestingUI":
			return new TestingUI();
			
			
		case "TestingBackend":
			return new TestingBackend();
			
			
		case "TestingAPI":
			return new TestingAPI();
			
			default:
				return null;
			
		
		}
		
		
	}

	

	@Override
	DevelopmentInterface getDevelopmentTasks(String taskName) {
		// TODO Auto-generated method stub
		return null;
	}
}

