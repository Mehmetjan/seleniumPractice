package OCApractice;

public class SamlpleQuestions {

	public static void main(String[] args) {

		boolean keepGoing = true;
		int count = 0;
		int x = 3;
		while (count++ < 3) {
			int y = (1 + 2 * count) % 3;
			switch (y) {
			default:
			case 0:
				x -= 1;
				break;
			case 1:
				x += 5;
			}
		}
		System.out.println(x);
		int yy =6;
		
		double xx = 3 + 2 * --yy;
		System.out.println(xx);
		int xxx = 2 * 5 + 3 * 4 - 8;
		
		System.out.println(xxx);
		int a = 3;  float b = 3.4f;
		System.out.println(a+b);
		
		int aa = 12;  int bb = 23;  int cc= 6;
		float dd = (aa+bb)/cc;
		System.out.println(dd);
		
	}
}
