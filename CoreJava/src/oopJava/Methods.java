package oopJava;

public class Methods {
	
	// public , private, default, protected

	public static void main(String[] args) {

		String fullName ="JohnSmith";
	
//	int length = fullName.length();
//	int index= fullName.indexOf("n");
//	boolean contains= fullName.contains("Smith");
//	boolean includes = fullName.endsWith("h");
//	String replace = fullName.replaceAll("John","jack");
//	
//	System.out.println(length);
//	System.out.println(index);
//	System.out.println(contains);
//	System.out.println(replace);
		
		System.out.println();
		age1();
		age1(1994);
	
	}
	
	public static void  age1() {
		int year= 2020;
		int brithYear =1999;
		int age = year-brithYear;
		System.out.println(age);
		
	}
	
	public static int age1(int year) {
		year = 2019;
		int brithYear= 1994;
		int age = year-brithYear;
		System.out.println(age);
		return age;
	}
	
	
	
	
	
}
