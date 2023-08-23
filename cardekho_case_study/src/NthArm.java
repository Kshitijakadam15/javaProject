import java.util.Scanner;
public class NthArm {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int num=inp.nextInt();
		inp.close();
		for(int i=1;i<=num;i++) {
			int copy=i;
			int count=0;
			int res=0;
			while(copy>0) {
				count++;
				copy/=10;	
			}
			copy=i;
			while(copy>0) {
				int count2=count;
				int last=copy%10;
				int mul=1;
				for(int j=1;j<=count2;j++) {
					mul*=last;
				}
				res+=mul;
				copy/=10;
			}
			if(res==i) {
				System.out.println(i);	
			}
			
		}
	}

}
