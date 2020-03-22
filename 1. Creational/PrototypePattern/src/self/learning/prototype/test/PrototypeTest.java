package self.learning.prototype.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import self.learning.prototype.DocumentPrototypeManager;
import self.learning.prototype.PrototypeCapableDocument;

class PrototypeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testTAndC() {
		PrototypeCapableDocument tAndC = DocumentPrototypeManager.getClonedDocument("TAndC");
		tAndC.setVendorName("ABC Vendor");
		System.out.println(tAndC);
		PrototypeCapableDocument nda = DocumentPrototypeManager.getClonedDocument("NDAgreement");
		nda.setVendorName("ABC Vendor");
		System.out.println(nda);
	}

}
