import java.util.Scanner;
public class Sqr {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Num : ");
		int num=inp.nextInt();
		inp.close();
		int count=0;
		for(int i=1;i<num;i++) {
			if(i*i==num) {
				System.out.println("Perfect Sqr");
				count++;
			}
		}
		if(count==0) {
			System.out.println("Not perfect sqr");
			
		}
		}
	}
