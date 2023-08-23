import java.util.Scanner;
public class Nfibo {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=inp.nextInt();
		int prev=0;
		int next=1;
		int sum=0;
		for(int i=1;i<=num-2;i++) {
			sum=prev+next;
			prev=next;
			next=sum;	
		}
		System.out.println(sum);
		inp.close();
	}

}
