package com.designpatterns.structuralpatterns_FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class Sportsfactory {
	
	
	public static ISports getSports(String sportsName)
	{
		Map<String,ISports> map=new HashMap<>();
		ISports sports=null;
		if(map.containsKey(sportsName))
			sports=map.get(sportsName);
		
		else
		{	
			switch(sportsName)
			{
			case "Cricket":
			
				sports= new Cricket(11);
				break;
				
				
			case "Football":
				sports= new Football(12);
				break;
				
				
			case "BasketBall":
				sports= new BasketBall(7);
				break;
				
			
			
			}
			
			map.put(sportsName, sports);
			
		}
		
	return sports;
		
	}

}
