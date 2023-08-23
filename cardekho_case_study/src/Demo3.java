import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		System.out.println("ENTER STRING : ");
		String s=inp.next();
		inp.close();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				count++;
			}
		}
		System.out.println("Digit"+count);
	}

}