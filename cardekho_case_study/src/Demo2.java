import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		System.out.println("ENTER STRING : ");
		String s=inp.next();
		inp.close();
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o'||s.charAt(i)=='u' ) {
				count++;
			}
		}
		System.out.println("Vowel count is "+count);
	}

}
