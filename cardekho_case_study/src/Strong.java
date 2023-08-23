import java.util.Scanner;
public class Strong {
	public static void main(String[] args) {
		Scanner inp=new Scanner (System.in);
		System.out.println("Enter inp :");
		int num=inp.nextInt();
		inp.close();
		int copy=num;
		int sum=0;
		while(copy>0) {
			int last=copy%10;
			int mul=1;
			for(int i=1;i<=last;i++) {
				mul*=i;
			}
			sum+=mul;
			copy/=10;
		}
		if(sum==num) {
			System.out.println("Strong num");	
		}
		else {
			System.out.println("Not Strong num");
		}
	}

}
