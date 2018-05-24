package com.designpatterns.creationalpatterns_AbstractFactory;

public abstract class AbstractFactory {
	abstract DevelopmentInterface getDevelopmentTasks(String taskName);
	abstract TestingInterface getTestingTasks(String taskName);
}
