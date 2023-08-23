import java.util.Scanner;
public class Demo5 {
	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		System.out.println("ENTER STRING : ");
		String s=inp.next();
		inp.close();
		int num=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				
				num+=48-s.charAt(i);
			}
			
		}
		System.out.println("Digit"+num);
	}
}

