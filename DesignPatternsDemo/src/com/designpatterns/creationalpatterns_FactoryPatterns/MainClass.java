package com.designpatterns.creationalpatterns_FactoryPatterns;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		FactoryDesignPatterns obj=new FactoryDesignPatterns();
		
		System.out.println("Enter your tasks");
		String task=sc.next();
		DeliveryInterface iFace=obj.getInstance(task);
		
		iFace.getTasks();
		sc.close();
		
	}

}
