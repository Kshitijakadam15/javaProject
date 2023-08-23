
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		System.out.println("Enter a String");
		String s=inp.next();
		inp.close();
		String rev ="";
		s=s.toLowerCase();
		for (int i=s.length()-1;i>=0;i--) {
			
			rev+=s.charAt(i);
			
		}
		System.out.println(s +":"+rev);
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		
	}

}
