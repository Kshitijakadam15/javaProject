import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int num=inp.nextInt();
		int num1=num;
		int rev=0;
		while(num1>0) {
			int last = num1%10;
			rev=rev*10+last;
			num1/=10;	
		}
		if(num==rev) {
			System.out.println("Palindrome");	
		}
		else {
			System.out.println("Not Palindrome");
		}
		inp.close();
	}

}
