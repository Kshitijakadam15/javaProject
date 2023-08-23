package com.jspiders.car_dekho.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Scanner;
import javax.persistence.Query;
import com.jspiders.car_dekho.dto.CarDto;
import java.util.List;


public class CarDao{
	private static Scanner inputs=new Scanner(System.in);
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    private static EntityTransaction entityTransaction;
    private static int num;
    static int choice;
	static Scanner inp = new Scanner(System.in);
	static boolean flag=false;
    
    private static void openConnection() {
        entityManagerFactory = Persistence.createEntityManagerFactory("cardetails");
        entityManager = entityManagerFactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    private static void closeConnection() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityTransaction != null) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        }
    }
    
    public static void addCar() {
		
	      openConnection();
	      entityTransaction.begin();
	   try {
		    System.out.println("How many cars you want to add ?");
		     num =inputs.nextInt();
			}
		catch(Exception e) {
			System.out.println("Invalid input..Enter the number !!!");
			inputs.nextLine();
		}
	   for(int i=0;i<num;i++){
		try{
			CarDto car=new CarDto();
			System.out.print("Enter CarID: ");
			int carid=inputs.nextInt();
			car.setCarid(carid);
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
	        entityManager.persist(car);
	        entityTransaction.commit();
	        
      if(carid!=0) {
      System.out.println("Record added successfully !!!");
      
      }
		}
		catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
				i--;
			}
		}
	   closeConnection();
	}
	
	//Delete Method

	 public static void deleteCar() {
		   try { getdetails();
		   
		   openConnection();
		   entityTransaction.begin();
		    System.out.print("Enter the Car ID to delete: ");
		    int carId=inputs.nextInt();
		    CarDto car = entityManager.find(CarDto.class, carId);
            if (car != null) {
                entityManager.remove(car);
                System.out.println("Record deleted successfully !!!");
            }
            entityTransaction.commit();
            closeConnection();
		   }
		   catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
			}
	    }
	 
//Update
	 
  public  static void updateCar () {
	 
try {
	            openConnection();
		        entityTransaction.begin();	
		     CarDto car=new CarDto();
        	 System.out.print("Enter CarID to update : ");
             int carid=inputs.nextInt();
             car.setCarid(carid);
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
         	 entityManager.merge(car);
         	 entityTransaction.commit();
            if(carid !=0) {
            System.out.println("Record updated successfully !!!");
             }
            getdetails();
            closeConnection();
        	}
         catch(Exception e) {
            System.out.println("Invalid input...!!!");
         	        inputs.nextLine();
			}
		}
	
	 //Search
	 
	 public static void searchCarId() {
		 try {
		    openConnection();
		   entityTransaction.begin();
		    System.out.print("Enter the Car ID to Search: ");
		    int carId=inputs.nextInt();
		    CarDto car = entityManager.find(CarDto.class, carId);
		    System.out.println(car);
		    entityTransaction.commit();
            closeConnection();  
		 }
		 catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
			}
	 }
	 
	 public static void getdetails() {
		 try {
	     openConnection();
	     entityTransaction.begin();
	     Query query=entityManager.createQuery("Select car from CarDto car");
		@SuppressWarnings("unchecked")
		List <CarDto> cars=query.getResultList();
		for(CarDto car:cars ) {
			 System.out.println(car);
			
		}
		 entityTransaction.commit();
		 closeConnection();
		 }
		 catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
			} 
	 }
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
				                        case 1:addCar();break;
				                        case 2:deleteCar();break;
				                        case 3:cardisplay();break;
				                        default:System.out.println("==Invalid choice..Try again !!!==");break;
				                        };break;
			               			}
			               			catch(Exception e) {
			               				System.out.println("Invalid input..Try again !!!");
			               				inp.nextLine();
			               			}
			                    
			case 2:System.out.print("1. Search Car by Id\n"
	                +"2. Go to Menu\n"
	                +"Enter Your Choice: ");
			      try {
	                int choice2=inp.nextInt();
	                switch (choice2) {
	                case 1:searchCarId();break;
	                case 2:cardisplay();break;
	                default:System.out.println("==Invalid choice..Try again !!!==");
	    			break;};break;
			      }
			      catch(Exception e) {
	   				System.out.println("Invalid input..Try again !!!");
	   				inp.nextLine();
	   			}
			case 3:updateCar();
				break;
			case 4:getdetails();break;
			case 5:System.out.println("Thankyou...!!");flag=true;
				break;
			default:System.out.println("==Invalid choice..Try again !!!==");
				break;
			}
			

       
    }
}
