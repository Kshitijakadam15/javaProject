
public class MethNum {
	static int a=0;
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		a++;
		if(a<=10) {
			System.out.println(a);	
			m1();
		}
	}
	

}
