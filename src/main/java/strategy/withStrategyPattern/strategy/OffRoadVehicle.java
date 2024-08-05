package strategy.withStrategyPattern.strategy;

import strategy.withStrategyPattern.strategy.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
	public OffRoadVehicle( ) {
		super(new SportsDriveStrategy());
	}

	public void drive() {
		System.out.println("OffRoadVehicle is driving");
		super.drive();
	}


}
