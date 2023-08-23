import java.util.Scanner;
public class Xylem {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter num: ");
		int num=inp.nextInt();
		int max=0;
		int min=0;
		max+=num%10;
		num/=10;
		while(num>0) {
			int last=num%10;
			
			if(num<=9) {
				max+=last;	
			}
			else {
				min+=last;
				}
			num/=10;
		}
		System.out.println(min +":"+max);
		if(min==max) {
			System.out.println("Xylem");
			
		}
		else {
			System.out.println("Not Xylem");
		}
		inp.close();
	}

}
