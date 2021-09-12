package test;

public class SimpleTester {
	
	public static int count;
	
	public static void main(String[] args) {
		SimpleTester st1 = new SimpleTester();
//		SimpleTester st2 = new SimpleTester();
		SimpleTester st2 = st1;
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1.equals(st2));
		System.out.println(st1 == st2);
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}
