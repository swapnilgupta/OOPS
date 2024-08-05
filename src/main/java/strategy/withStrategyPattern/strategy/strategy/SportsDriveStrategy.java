package strategy.withStrategyPattern.strategy.strategy;

public class SportsDriveStrategy implements DriveStrategy {
	@Override
	public void drive() {
		System.out.println("Driving with sports strategy");
	}
}
