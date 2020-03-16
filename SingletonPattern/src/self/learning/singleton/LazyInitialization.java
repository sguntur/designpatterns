package self.learning.singleton;

public class LazyInitialization {
	private static LazyInitialization instance = null;
	
	// So that other classes cannot initialize class with new
	private LazyInitialization() {
		
	}
	
	// Not threadsafe
	/*
	 * public static LazyInitialization getInstance() { if(null==instance) {
	 * instance = new LazyInitialization(); } return instance; }
	 */
	
	// Thread Safe
	public static synchronized LazyInitialization getInstance() {
		if(null==instance) {
			instance = new LazyInitialization();
		}
		return instance;
	}
	
}
