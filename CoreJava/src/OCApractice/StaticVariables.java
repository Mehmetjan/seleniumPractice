package OCApractice;

public class StaticVariables {

	static int age=24;
	

	public StaticVariables() {

		System.out.println(age++);

	}

	public static void main(String[] args) {

		StaticVariables data1 = new StaticVariables();
		StaticVariables data2 = new StaticVariables();
		StaticVariables data3 = new StaticVariables();

	}

}
