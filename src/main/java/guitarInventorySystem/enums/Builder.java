package guitarInventorySystem.enums;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

	@Override
	public String toString() {
		return switch (this) {
			case FENDER -> "Fender";
			case MARTIN -> "Martin";
			case GIBSON -> "Gibson";
			case COLLINGS -> "Collings";
			case OLSON -> "Olson";
			case RYAN -> "Ryan";
			case PRS -> "PRS";
			default -> "Any";
		};
	}
}
