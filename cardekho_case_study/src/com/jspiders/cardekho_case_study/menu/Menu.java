package com.jspiders.cardekho_case_study.menu;
import java.util.Scanner;
import com.jspiders.cardekho_case_study.operation.Operation;




public class Menu{
	static int choice;
	static Operation operation=new Operation();
	static Scanner inp = new Scanner(System.in);
	static boolean flag=false;
	
	public static void main(String[] args) {
		while(!flag) {
			cardisplay();
		}

	}
	private static void cardisplay() {
		
			System.out.println("===Welcome to CarDekho===\n"
			                  +"1. Add/Remove Car Details\n"
					          +"2. Search Car Details \n"
			                  +"3. Update Car Details\n"
					          +"4. Show Car Details \n"
			                  +"5.Exit ");
			System.out.print("Enter Your Choice :");
			try {
			 choice=inp.nextInt();
			}
			catch(Exception e) {
				System.out.println("Invalid choice..Try again !!!");
				inp.nextLine();
			}
		switch (choice) {
		case 1:System.out.print("1. Add Cars\n"
		                        +"2. Remove Cars\n"
				                +"3. Goback to Main Menu\n"
		                        +"Enter Your Choice: ");
		                        try {
		               			 int choice1=inp.nextInt();
		               			 switch(choice1) 
			                        {
			                        case 1:operation.addCar();break;
			                        case 2:operation.deleteCar();break;
			                        case 3:cardisplay();break;
			                        default:System.out.println("==Invalid choice..Try again !!!==");break;
			                        };break;
		               			}
		               			catch(Exception e) {
		               				System.out.println("Invalid input..Try again !!!");
		               				inp.nextLine();
		               			}
		                    
		case 2:System.out.print("1. Search Car by Id\n"
                +"2. Search car by Name \n"
                +"3. Search car by Model \n"
                +"4. Search car by Fueltype \n"
                +"5. Go to Menu\n"
                +"Enter Your Choice: ");
		      try {
                int choice2=inp.nextInt();
                switch (choice2) {
                case 1:operation.searchCarId();break;
                case 2:operation.searchCarName();break;
                case 3:operation.searchCarModel();break;
                case 4:operation.searchCarFuel();break;
                case 5:cardisplay();break;
                default:System.out.println("==Invalid choice..Try again !!!==");
    			break;};break;
		      }
		      catch(Exception e) {
   				System.out.println("Invalid input..Try again !!!");
   				inp.nextLine();
   			}
		case 3:operation.updateCar();
			break;
		case 4:operation.getdetails();break;
		case 5:System.out.println("Thankyou...!!");flag=true;
			break;
		default:System.out.println("==Invalid choice..Try again !!!==");
			break;
		}
		
		
	}


}
