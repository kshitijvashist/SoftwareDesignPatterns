package com.designpatterns.structuralpatterns_FlyWeightPattern;

public class SportsSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ISports sport=Sportsfactory.getSports("Cricket");
		System.out.println(sport.sportsLength("Cricket"));

		ISports sport1=Sportsfactory.getSports("Football");
		System.out.println(sport1.sportsLength("Football"));

		ISports sport2=Sportsfactory.getSports("BasketBall");
		System.out.println(sport2.sportsLength("BasketBall"));
	}

}
