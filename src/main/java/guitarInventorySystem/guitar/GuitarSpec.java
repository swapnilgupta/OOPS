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
	private int numStrings = 0;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood,
		int numStrings) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}

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

	public int getNumStrings() {
		return this.numStrings;
	}
	
	public boolean equals(GuitarSpec guitarSpec) {
		if(this.getBuilder() != guitarSpec.getBuilder())
			return false;
		String model = this.getModel().toLowerCase();
		if(!model.isEmpty() && !model.equals(guitarSpec.getModel().toLowerCase()))
			return false;
		if(this.getType() != guitarSpec.getType())
			return false;
		if(this.getBackWood() != guitarSpec.getBackWood())
			return false;
		if(this.getTopWood() != guitarSpec.getTopWood())
			return false;
		if(this.getNumStrings() != 0 &&
			guitarSpec.getNumStrings() != this.getNumStrings())
			return false;
		return true;
	}
}
