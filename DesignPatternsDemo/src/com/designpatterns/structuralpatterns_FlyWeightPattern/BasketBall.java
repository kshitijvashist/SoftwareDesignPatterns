package com.designpatterns.structuralpatterns_FlyWeightPattern;

public class BasketBall implements ISports {

	int basketballLength;
	public BasketBall(int basketballLength) {
		super();
		this.basketballLength = basketballLength;
	}
	@Override
	public int sportsLength(String sportsName) {
		// TODO Auto-generated method stub
		return 7;
	}

}
