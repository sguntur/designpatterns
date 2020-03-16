package self.learning.singleton;

public class EagerInitialization {
	private static final EagerInitialization INSTANCE = new EagerInitialization();
	
	private EagerInitialization() {
		
	}
	
	// Not Thread Safe
	/*
	 * public static EagerInitialization getInstance() { return INSTANCE; }
	 */
	
	// Thread Safe
	public static synchronized EagerInitialization getInstance() { return INSTANCE; }
}
