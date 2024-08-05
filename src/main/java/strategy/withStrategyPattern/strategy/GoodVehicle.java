package strategy.withStrategyPattern.strategy;

import strategy.withStrategyPattern.strategy.strategy.NormalDriveStrategy;

public class GoodVehicle extends Vehicle {
	public GoodVehicle() {
		super(new NormalDriveStrategy());
	}

	public void drive() {
		System.out.println("GoodVehicle is driving");
		super.drive();
	}


}
