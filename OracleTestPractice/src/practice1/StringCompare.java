package practice1;

public class StringCompare {

	public static void main(String[] args) {
		String name = "ablet";
		String gender = "male";
		  
		System.out.println( "positive means longer string, result: "+(gender.length() - name.length()));
        System.out.println("is the two String are same? :           "+name.equals(gender));
	}
}
