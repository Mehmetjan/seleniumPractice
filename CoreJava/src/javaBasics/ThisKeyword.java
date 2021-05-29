package javaBasics;

public class ThisKeyword {
	
	  public int age = 34;
	  String name = "jack";
	  
	  
	  
	  public String info(int age, String name) {
		  
		  age = age+1;
		  name = "no one";
		  return name;
		  
	  }
	
	

	public static void main(String[] args) {
		
		ThisKeyword method = new ThisKeyword();

     
     System.out.println(method.info(23,"ma"));

	}
	
	
	
	
	

}
