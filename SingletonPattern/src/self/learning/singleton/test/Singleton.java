package self.learning.singleton.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import self.learning.singleton.EagerInitialization;
import self.learning.singleton.LazyInitialization;

class Singleton {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		EagerInitialization eagerInstance = EagerInitialization.getInstance();
		LazyInitialization lazyInstance = LazyInitialization.getInstance();
	}

}
