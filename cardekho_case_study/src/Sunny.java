import java.util.Scanner;
public class Sunny {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num=inp.nextInt();
		int next=num+1;
		inp.close();
		int count=0;
		for(int i=1;i<next;i++) {
			if(i*i==next) {
				System.out.println("Sunny Number");
				count++;
			}
		}
		if(count==0) {
			System.out.println("Not sunny num");
		}
		
	}

}
