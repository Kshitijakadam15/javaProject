import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=inp.nextInt();
		int prev=0;
		int next=1;
		System.out.print(prev + " "+next);
		for(int i=1;i<=num-2;i++) {
			int sum=prev+next;
			prev=next;
			next=sum;
			System.out.print(" "+sum);
		}
		inp.close();
	}

}
