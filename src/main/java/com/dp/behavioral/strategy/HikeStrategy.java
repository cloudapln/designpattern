package com.dp.behavioral.strategy;
public class HikeStrategy implements Strategy {

	public boolean checkTemperature(int temperatureInF) {
		if ((temperatureInF >= 50) && (temperatureInF <= 90)) {
			return true;
		} else {
			return false;
		}
	}

}