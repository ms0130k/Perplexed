package test;

public class SimpleSingleton {
	private static SimpleSingleton INSTANCE;
	
	private SimpleSingleton() {
		
	}
	
	public static synchronized SimpleSingleton getInstance() {
		if (INSTANCE == null) INSTANCE = new SimpleSingleton();
		return INSTANCE;
	}
}
