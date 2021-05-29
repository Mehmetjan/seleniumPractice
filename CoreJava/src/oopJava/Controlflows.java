package oopJava;

public class Controlflows {

	public static void main(String[] args) {

   // if, if..else,  switch...
		
		int value  =4; 
		if(value==5) {
			System.out.println("original value is 4");
		}
		
		
		if(value <3) {
			System.out.println("your value is less that 6");
		}else
		{System.out.println("your value is not less than 6");
		
		}
		
		
		int value2 = 7;
		switch (value2) {
		case 1:
			System.out.println("the original value was 7");
			break;
			
		case 2:
			System.out.println("the value is not 2");
			
		case 3:  case 4:   case 5: 
			System.out.println("these all wrong");
			break;
			
		case 7:
			System.out.println("you entered right value");
			break;
			
			default:
				System.out.println(" please check original value");
				break;
			
			
		}
		

	}

}
