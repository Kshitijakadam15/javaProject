import java.util.Scanner;

public class FactSum {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int num=inp.nextInt();
		int res=sum(num);
		System.out.println(res);
		inp.close();
	}
	public static int sum(int num) {
		if(num>1) {
			return num+sum(num-1);
			
		}
		else {
			return 1;
		}
		
	}

}
