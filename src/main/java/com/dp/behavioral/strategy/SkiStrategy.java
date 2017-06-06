package com.dp.behavioral.strategy;
public class SkiStrategy implements Strategy {

	
	public boolean checkTemperature(int temperatureInF) {
		if (temperatureInF <= 32) {
			return true;
		} else {
			return false;
		}
	}

}