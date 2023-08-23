package com.jspiders.cardekho_case_study.operation;
import java.util.ArrayList;
import java.util.Scanner;
import com.jspiders.cardekho_case_study.entity.Car;

public class Operation{
	    static int num;
	    ArrayList <Car> cars=new ArrayList<Car>();
		Scanner inputs=new Scanner(System.in);
	
	public void addCar() {
	   try {
		    System.out.println("How many cars you want to add ?");
		     num =inputs.nextInt();
			}
		catch(Exception e) {
			System.out.println("Invalid input..Enter the number !!!");
			inputs.nextLine();
		}
		for (int i=num;i>0;i--)
		{
		try{
		Car car =new Car();
		System.out.print("Enter CarID: ");
        car.setCarid(inputs.nextInt());
        inputs.nextLine();
        System.out.print("Enter Car Name: ");
        car.setName(inputs.nextLine());
        System.out.print("Enter Car Model: ");
        car.setModel(inputs.nextLine());
        System.out.print("Enter Car Price: ");
        car.setPrice(inputs.nextDouble());
        inputs.nextLine();
        System.out.print("Enter Car Color: ");
        car.setColor(inputs.nextLine());
        System.out.print("Enter Car Fueltype: ");
        car.setFueltype(inputs.nextLine());
        System.out.println("Record added successfully !!!");
        cars.add(car);
		}
		catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
				i--;
			}
		}
	}
	 public void deleteCar() {
		    getdetails();
	        System.out.print("Enter the Car ID to delete: ");
	        int id = inputs.nextInt();
	        boolean found = false;
	        for (Car car : cars) {
				if (car.getCarid()==id) {
					found=true;
					cars.remove(car);
					break;
				}
			}
	        if (found==true) {
	            System.out.println("Record deleted successfully!");
	        } else {
	            System.out.println("Record not found!");
	        }
	    }
	 public void updateCar() {
		 boolean flag=false;
		 while(!flag) {
		  try {
	        System.out.print("Enter the Car ID to update: ");
	        int id = inputs.nextInt();
	        inputs.nextLine();
	        boolean found = false;
	        for (Car car : cars) {
	            if (car.getCarid()== id) {
	                System.out.print("Enter Car Name: ");
	                car.setName(inputs.nextLine());
	                System.out.print("Enter Car Model: ");
	                car.setModel(inputs.nextLine());
	                System.out.print("Enter Car Price: ");
	                car.setPrice(inputs.nextDouble());
	                inputs.nextLine();
	                System.out.print("Enter Car Color: ");
	                car.setColor(inputs.nextLine());
	                System.out.print("Enter Car Fueltype: ");
	                car.setFueltype(inputs.nextLine());
	                found = true; 
	                break;
	            }
	        }
	        if (found==true) {
	            System.out.println("Record updated successfully!");
	        } else {
	            System.out.println("Record not found!");
	        }
	        flag=true;
		  }
		  catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
			}
		 }
	    }
	 public void searchCarId() {
		 System.out.println(" Enter Car Id :");
		 int carid=inputs.nextInt();
		 ArrayList <Car> id=new ArrayList<Car>();
		 for (Car car2 : cars) {
			 if (carid == car2.getCarid()) {
				 id.add(car2);
			}	
		}
		 if (id.size()==0) {
			 System.out.println("Enter valid Id ");
		 }
		 else {
			 System.out.println("Car id"
			 		           + "\t Car Name"
					           +"\t Car Model"
			 		           +"\t Car Price"
					           +"\t Car Color"
			 		           +"\t Car Fueltype \n"
					           +"====================================================================================");
			 for (Car k : id) {
				 System.out.println(k +"\t");	
			}
		 }
	 }
	 public void searchCarName() {
		 System.out.println(" Enter Car Name :");
		 String name=inputs.nextLine();
		 ArrayList <Car> name1=new ArrayList<Car>();
		 for (Car car3 : cars) {
			 if (name.equals(car3.getName())) 
			 {
				 name1.add(car3);
				
			}	
		}
		 if (name1.size()==0) {
			 System.out.println("Enter valid Id ");
		 }
		 else {
			 System.out.println("Car id"
			 		           + "\t Car Name"
					           +"\t Car Model"
			 		           +"\t Car Price"
					           +"\t Car Color"
			 		           +"\t Car Fueltype \n"
					           +"====================================================================================");
			 for (Car k : name1) {
				 System.out.println(k +"\t");	
			}
		 }
	 }
	 public void searchCarModel() {
		 System.out.println(" Enter Car Model :");
		 String model=inputs.nextLine();
		 ArrayList <Car> model1=new ArrayList<Car>();
		 for (Car car4 : cars) {
			 if (model.equalsIgnoreCase(car4.getModel()))
			 {
				 model1.add(car4);	
			}	
		}
		 if (model1.size()==0) {
			 System.out.print("Enter valid Id ");
		 }
		 else {
			 System.out.println("Car id"
			 		           + "\t Car Name"
					           +"\t Car Model"
			 		           +"\t Car Price"
					           +"\t Car Color"
			 		           +"\t Car Fueltype \n"
					           +"====================================================================================");
			 for (Car k : model1) {
				 System.out.println(k +"\t");	
			}
		 }
	 }
	 public void searchCarFuel() {
		 System.out.println(" Enter Car Fueltype :");
		 String fuel=inputs.nextLine();
		 ArrayList <Car> fuel1=new ArrayList<Car>();
		 for (Car car4 : cars) {
			 if (fuel.equalsIgnoreCase(car4.getFueltype()))
			 {
				 fuel1.add(car4);
				
			}	
		}
		 if (fuel1.size()==0) {
			 System.out.println("Enter valid Id ");
		 }
		 else {
			 System.out.println("Car id"
			 		           + "\t Car Name"
					           +"\t Car Model"
			 		           +"\t Car Price"
					           +"\t Car Color"
			 		           +"\t Car Fueltype \n"
					           +"====================================================================================");
			 for (Car k : fuel1) {
				 System.out.println(k +"\t");	
			}
		 }
	 }
	 public void getdetails() {
		 System.out.println("*** Details ***");
		 System.out.print("Carid \t "
		                   +"Name \t"
				           +"Model \t"
		                   +"Price \t"
				           +"Color \t"
		                   +"Fueltype \n"
		 +"=============================================================\n");
		 for (Car a : cars) {
			 System.out.println(a);	
		}
	 }
	 

      }
