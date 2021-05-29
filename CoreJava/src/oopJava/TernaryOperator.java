package oopJava;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int age = 40;
		boolean ageLimit = age> 28 ? true :false;
		System.out.println(ageLimit);
		
		String studentName = "jack";
		String teacherName = studentName.equals("jack")? "name is right" : "name is wrong";
		
		System.out.println(teacherName);
		

	}

}
