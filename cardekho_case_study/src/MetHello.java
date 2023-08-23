
public class MetHello {
	static int count;
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		count++;
		if(count<=5) {
			System.out.println("Hello");
			m1();
		}
	}

}
