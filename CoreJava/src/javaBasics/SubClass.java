package javaBasics;

public class SubClass extends SuperClass {

	String color;

	public SubClass(String color) {
		this.color = color;
		System.out.println("this is black dog");
		System.out.println(super.color);

	}

	public static void main(String[] args) {
		SubClass sc = new SubClass("blue");

		System.out.println(sc);

	}

}
