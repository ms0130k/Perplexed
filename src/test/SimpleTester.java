package test;

public class SimpleTester {
	
	public static void main(String[] args) {
		SimpleSingleton s0 = SimpleSingleton.getInstance();
		SimpleSingleton s1 = SimpleSingleton.getInstance();
		SimpleSingleton s2 = SimpleSingleton.getInstance();
		
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);
	}
}
