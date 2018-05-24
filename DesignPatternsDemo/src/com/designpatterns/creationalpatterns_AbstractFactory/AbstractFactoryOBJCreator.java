package com.designpatterns.creationalpatterns_AbstractFactory;

public class AbstractFactoryOBJCreator {
	
		   public static AbstractFactory getFactory(String task){
		   
		      if(task.equalsIgnoreCase("Development")){
		         return new DevelopmentFactory();
		         
		      }else if(task.equalsIgnoreCase("Testing")){
		         return new TestingFactory();	      }
		      
		      return null;
		   }
		}


