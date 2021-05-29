package oopPractice;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
    int myA[]= {5,7};
    for(int i: myA) {
    	System.out.println(i);
    	//break
    }
    List<String> list = new ArrayList<String>();
    list.add(0,"mehmet");
    list.add(1,"jamal");
    
   
		System.out.println(list);

	}

}
