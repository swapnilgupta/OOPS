package strategy.withStrategyPattern.strategy;

import strategy.withStrategyPattern.strategy.strategy.DriveStrategy;

public class Vehicle {
	private DriveStrategy driveStrategy;

	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}

	public void drive() {
		driveStrategy.drive();
	}

}
