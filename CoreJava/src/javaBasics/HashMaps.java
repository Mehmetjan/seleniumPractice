package javaBasics;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {

    HashMap<String, String> fullName = new HashMap<>();
    fullName.put("James","Comey");
    fullName.put("Mehmet","Bugra");
    fullName.put("Linked","Assey");
    fullName.put("Michael","Corner");
    fullName.put("Amanda","Cerney");
    fullName.put("Jack","Richard");
  //  System.out.println(fullName);
    System.out.println( fullName.get("Jack"));
	}

}
