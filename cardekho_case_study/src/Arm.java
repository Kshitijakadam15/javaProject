import java.util.Scanner;
public class Arm {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=inp.nextInt();
		inp.close();
		int count=0;
		int copy=num;
		int res=0;
		while(copy>0) {
			count++;
			copy/=10;
			
		}
		copy=num;
		while(copy>0) {
			int last=copy%10;
			int count1=count;
			int mul=1;
			for (int i=0;i<count1;i++) {
				mul*=last;	
			}
			res+=mul;
			copy/=10;
		}
	if(num==res) {
		System.out.println("Armstrong");
		
	}
	else {
		System.out.println("Not Armstrong");
	}

}
}
