package Ccollection;

import java.util.ArrayList;

public class Lambda {

	public static void main(String[] args) {

    ArrayList<Integer> num = new ArrayList<Integer>();
      num.add(3);
      num.add(4);
      num.add(5);
      num.add(6);
      num.add(9);
      
      
      num.forEach(
    		  
      (n) -> {System.out.println(n);
      
      }
      );
      
      
      
      System.out.println(num);
      
      for(int x: num) {
    	  System.out.println(x);
      }
      

	}

}
