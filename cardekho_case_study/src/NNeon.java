import java.util.Scanner;
public class NNeon {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Num : ");
		int num=inp.nextInt();
		inp.close();
		for(int i=1;i<=num;i++) {
			int sqr=i*i;
			int res=0;
			while(sqr>0) {
				int last=sqr%10;
				res+=last;
				sqr/=10;
				
			}
			if(res==i) {
				System.out.println(i);
			}	
		}
	}

}
