package self.learning.builder.test;

import org.junit.jupiter.api.Test;

import self.learning.builder.ConcreteHouseBuilder;
import self.learning.builder.ConstructionEngineer;
import self.learning.builder.HouseBuilder;
import self.learning.builder.PrefabricatedHouseBuilder;

class HouseBuilderTest {

	@Test
	void testConcreteHouseBuilder() {
		HouseBuilder builder = new ConcreteHouseBuilder();
		ConstructionEngineer engineer = new ConstructionEngineer(builder);
		System.out.println("House is = "+engineer.constructHouse());
	}
	
	@Test
	void testPrefabricatedHouseBuilder() {
		HouseBuilder builder = new PrefabricatedHouseBuilder();
		ConstructionEngineer engineer = new ConstructionEngineer(builder);
		System.out.println("House is = "+engineer.constructHouse());
	}

}
