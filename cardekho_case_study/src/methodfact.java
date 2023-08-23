import java.util.Scanner;
public class methodfact {
	public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter Number : ");
	int num=inp.nextInt();
	inp.close();
	int res=fact(num);
	System.out.println(res);
	}
	public static int fact(int num) {
		if(num>0) {
	 	return num*fact(num-1) ;
	    }
		else {
			return 1;
		}
		
	}

}
