package strategy.withStrategyPattern.strategy.strategy;

public class NormalDriveStrategy implements DriveStrategy {
	@Override
	public void drive() {
		System.out.println("Driving with normal strategy");
	}
}
