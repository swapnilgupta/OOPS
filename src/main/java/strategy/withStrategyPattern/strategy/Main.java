package strategy.withStrategyPattern.strategy;

public class Main {

	public static void main(String[] args) {
		Vehicle goodVehicle = new GoodVehicle();
		goodVehicle.drive();
		Vehicle offRoadVehicle = new OffRoadVehicle();
		offRoadVehicle.drive();
	}

}
