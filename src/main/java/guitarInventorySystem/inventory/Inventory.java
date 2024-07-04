package guitarInventorySystem.inventory;

import guitarInventorySystem.guitar.Guitar;
import guitarInventorySystem.guitar.GuitarSpec;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private final List<Guitar> guitars;

	public Inventory() {
		guitars = new ArrayList<>();
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}

	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new ArrayList<>();
		for (Guitar guitar : guitars) {
			GuitarSpec guitarSpec = guitar.getSpec();
			if(searchSpec.equals(guitarSpec)) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}
}
