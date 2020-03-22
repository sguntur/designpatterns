package self.learning.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentPrototypeManager {
	private static Map<String,PrototypeCapableDocument> prototypes = new HashMap<String,PrototypeCapableDocument>();
	
	static {
		TAndC tandc = new TAndC();
		tandc.setVendorName("Vendor Name PlaceHolder");
		// Fetch content from database
		tandc.setContent("Conent Retrieved from Database. Please read and accept terms and conditions.");
		prototypes.put("TAndC", tandc);
		
        AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
        authorizedSignatory.setName("Sumanth Guntur");
        authorizedSignatory.setDesignation("Operation Head");
        
        NDAgreement nda = new NDAgreement();
        nda.setVendorName("Vendor Name Placeholder");
        /*Retrieve Non Disclosure Agreement from database/network call/disk I/O here*/
        nda.setContent("Please read and accept the NDA...");
        nda.setAuthorizedSignatory(authorizedSignatory);

		prototypes.put("NDAgreement", nda);
	}
	
	
	public static PrototypeCapableDocument getClonedDocument(String type) {
		PrototypeCapableDocument clonedDoc = null;
		try {
			PrototypeCapableDocument doc = prototypes.get(type);
			clonedDoc=doc.cloneDocument();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedDoc;
	}
	
}
