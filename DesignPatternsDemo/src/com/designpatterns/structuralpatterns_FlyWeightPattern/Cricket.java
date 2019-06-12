package com.designpatterns.structuralpatterns_FlyWeightPattern;

public class Cricket implements ISports {
	int cricketLength;

	public Cricket(int cricketLength) {
		super();
		this.cricketLength = cricketLength;
	}

	@Override
	public int sportsLength(String sportsName) {
		// TODO Auto-generated method stub
		
		return 11;
		
	}

}
