package com.designpatterns.creationalpatterns_Singleton;

public class SingletonDesignPatterns {
	private static SingletonDesignPatterns obj=null;
	
	private SingletonDesignPatterns(){
		System.out.println("ok");
	}
	
	private static SingletonDesignPatterns getInstance()
	{
		if(obj==null)
			obj=new SingletonDesignPatterns();
		return  obj;
	}
	
	public void showMessage()
	{
		System.out.println("hiii");
	}
	
	public static void main(String args[])
	{
		SingletonDesignPatterns objMain=SingletonDesignPatterns.getInstance();
		objMain.showMessage();
		
	}

}
