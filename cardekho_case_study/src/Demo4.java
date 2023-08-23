import java.util.Scanner;
public class Demo4 {
	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		System.out.println("ENTER STRING : ");
		String s=inp.next();
		inp.close();
		int num=0;
		String str="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				
				num=num*10+48-s.charAt(i);
			}
			else
			{
				str+=s.charAt(i);
				
			}
		}
		System.out.println(" Digit : "+num+ "\n String : "+str);
	}

}
