import java.util.Scanner;
public class Spy {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Num : ");
		int num=inp.nextInt();
		int pro=1;
		int sum=0;
		while(num>0) {
			int last=num%10;
			pro*=last;
			sum+=last;
			num/=10;
		}
		if (pro==sum) {
			System.out.println("Spy number");
		}
		else {
			System.out.println("Not spy");
		}
		inp.close();
		
	}

}
