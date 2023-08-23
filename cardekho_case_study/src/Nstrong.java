import java.util.Scanner;
public class Nstrong {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Num : ");
		int num=inp.nextInt();
		inp.close();
		for(int i=1;i<=num;i++) {
			int copy=i;
			int res=0;
			while(copy>0) {
				int last=copy%10;
				int mul=1;
				for(int j=1;j<=last;j++) {
					mul*=j;	
				}
				res+=mul;
				copy/=10;
			}
			if (i==res) {
				System.out.println(i);
			}
			
		}
	}

}
