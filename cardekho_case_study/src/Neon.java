import java.util.Scanner;
public class Neon {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Num : ");
		int num=inp.nextInt();
		inp.close();
		int sqr=num*num;
		int res=0;
		while(sqr>0) {
			int last=sqr%10;
			res+=last;
			sqr/=10;	
		}
		if(res==num) {
			System.out.println("Neon Num");
		}
		else {
			System.out.println("Not Neon Num");
		}
	}

}
