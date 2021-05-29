package javaBasics;

public class FinalKeyword {
	
	 int age=23;

	public static void main(String[] args) {
		
		   int age = 34;
     
     System.out.println(age);
     FinalKeyword fin = new FinalKeyword();
     FinalKeyword fin1 = new FinalKeyword();
     System.gc();

     System.out.println(fin.age); 
     
     
	}
	
	public void finalize() {
		System.out.println("finalize called");
	}
	

}
