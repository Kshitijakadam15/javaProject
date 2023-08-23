import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=inp.nextInt();
		inp.close();
		int count=0;
		for(int i=2;i<num;i++) {
			if (num%i==0) {
				count++;	
			}	
		}
		if(count==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
	}

}
