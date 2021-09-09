package test;

public class SimpleTester {
	
	public static int count;
	
	public static void main(String[] args) {
		SimpleTester st1 = new SimpleTester();
		System.out.println(st1.count);
		st1.count++;
		SimpleTester st2 = new SimpleTester();
		System.out.println(st2.count);
		st2.count++;
		SimpleTester st3 = new SimpleTester();
		System.out.println(st3.count);
		st3.count++;
		SimpleTester st4 = new SimpleTester();
		System.out.println(st4.count);
		st4.count++;
		
		System.out.println(st1 == st2);
		System.out.println(st1.equals(st2));
	}
}
