package OCApractice;

public class CallBirdDisplay {

	public static void main(String[] args) {
	 int y = 4;
		y = --y;
		
		
		int x = 4;
				x= x*2;
				
		int z  = x*4 + --y;
		
		System.out.println(y);
		System.out.println(x);
		System.out.println(z);
		System.out.println("this is my  computer ".trim());
		StringBuilder sb =new  StringBuilder();
		
		//  String builder method
		
		String  p =  "Programming class";
		
		System.out.println(p);
		
		StringBuilder builder = new StringBuilder("my programming class");
		System.out.println(builder);
		
		
		builder.insert(12, "bb");
		System.out.println(builder);
		builder.delete(12,14);
		System.out.println(builder);
		
		builder.append(" yes");
		System.out.println(builder);
		builder.insert(14,": _ ");
		System.out.println(builder);
		builder.delete(15, 16);
		System.out.println(builder);
		System.out.println(builder.reverse());
		
		StringBuilder newBuilder =  new StringBuilder("this is it");
	String myNew = newBuilder.toString();
		System.out.println(myNew.toUpperCase());
		
		
		StringBuilder name = new StringBuilder("Mehmet Bugra");
		name.delete(2,4);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
