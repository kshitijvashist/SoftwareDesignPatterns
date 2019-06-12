package com.designpatterns.structuralpatterns_FlyWeightPattern;

public class Football implements ISports {
	
	int footballLength;
	public Football(int footballLength) {
		super();
		this.footballLength = footballLength;
	}
	@Override
	public int sportsLength(String sportsName) {
		// TODO Auto-generated method stub
		return 12;
	}

}
