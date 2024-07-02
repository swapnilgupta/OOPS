package guitarInventorySystem.guitar;

import guitarInventorySystem.enums.Builder;
import guitarInventorySystem.enums.Type;
import guitarInventorySystem.enums.Wood;

public class GuitarSpec {

	private final Builder builder;
	private final String model;
	private final Type type;
	private final Wood backWood;
	private final Wood topWood;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	// Getters for each attribute
	public Builder getBuilder() {
		return this.builder;
	}

	public String getModel() {
		return this.model;
	}

	public Type getType() {
		return this.type;
	}

	public Wood getBackWood() {
		return this.backWood;
	}

	public Wood getTopWood() {
		return this.topWood;
	}
}
