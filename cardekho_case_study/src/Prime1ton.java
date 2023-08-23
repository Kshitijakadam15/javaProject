
import java.util.Scanner;
public class Prime1ton {
	public static void main(String[] args) {

		Scanner inp=new Scanner(System.in);
		System.out.println("Enter num : ");
		int num=inp.nextInt();
		for(int i=1;i<=num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
		inp.close();
	}

}
