package self.learning.builder;

public class ConcreteHouseBuilder implements HouseBuilder {
	
	private House house;
	
	public ConcreteHouseBuilder() {
		house = new House();
	}
	
	@Override
	public void buildFoundation() {
		house.setFoundation("Concrete, brick, and stone");
		System.out.println("ConcreteHouseBuilder: Foundation Complete!");
	}

	@Override
	public void buildStructure() {
		house.setStructure("Concrete, mortar, brick, and reinforced steel");
		System.out.println("ConcreteHouseBuilder: Structure Complete!");
	}

	@Override
	public void buildRoof() {
		house.setRoof("Concrete and reinforced steel");
		System.out.println("ConcreteHouseBuilder: Roof Complete!");
	}

	@Override
	public void paintHouse() {
		house.setPainted(true);
		System.out.println("ConcreteHouseBuilder: Painting Complete!");
	}

	@Override
	public void furnishHouse() {
		house.setFurnished(true);
		System.out.println("ConcreteHouseBuilder: Furnishing Complete!");
	}

	@Override
	public House getHouse() {
		System.out.println("ConcreteHouseBuilder: Building house complete !");
		return this.house;
	}

}
