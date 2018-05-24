package com.designpatterns.creationalpatterns_AbstractFactory;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the task name");
		String task=sc.next();
		
		AbstractFactory objDev=AbstractFactoryOBJCreator.getFactory(task);
		
		System.out.println("Enter the "+ task+ " task name");
		String taskName=sc.next();
		
		if(task.equalsIgnoreCase("Development"))
		{
		
		DevelopmentInterface iDev=objDev.getDevelopmentTasks(taskName);
		iDev.development();		
		}
		else
			if(task.equalsIgnoreCase("Testing"))
			{
			
			TestingInterface iDev=objDev.getTestingTasks(taskName);
			iDev.testing();	
			}
		
	}

}
