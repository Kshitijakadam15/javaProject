package com.jspiders.cardekho_case_study.operation;
import java.util.ArrayList;
import java.util.Scanner;
import com.jspiders.cardekho_case_study.entity.Car;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Properties;


public class Operation{
	private static Connection connection;
	private static ResultSet resultSet;
	private static PreparedStatement preparedstatement;
	private static Properties properties=new Properties();
	private static FileInputStream file;
	private static String filepath = "D:\\WEJA2\\cardekho_case_study2\\resource\\db_info.properties " ;
	private static String query;
	private static int result;
	private static String driverpath="com.mysql.cj.jdbc.Driver";
	private static String dburl="jdbc:mysql://localhost:3306/weja2";
	
	//open
	public static void openConnection() {
		try {
			file = new FileInputStream(filepath);
			properties.load(file);
			Class.forName(driverpath);
			connection=DriverManager.getConnection(dburl,properties);
			}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//close
	public static void closeConnection() {
		try {
		if(connection !=null) {
			connection.close();	
		}
		if(resultSet !=null) {
			resultSet.close();	
		}
		if(preparedstatement !=null) {
			preparedstatement.close();	
		}
		if(file !=null) {
			file.close();	
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//Add Method
	    static int num;
	    ArrayList <Integer> carsid=new ArrayList <Integer>() ;
		Scanner inputs=new Scanner(System.in);
	
	public void addCar() {
		
	      openConnection();
	   try {
		   query= "insert into car values (?,?,?,?,?,?)";
		   preparedstatement =connection.prepareStatement(query);
		    System.out.println("How many cars you want to add ?");
		     num =inputs.nextInt();
			}
		catch(Exception e) {
			System.out.println("Invalid input..Enter the number !!!");
			inputs.nextLine();
		}
	   for (int i=0;i<num;i++) {
		try{
			System.out.print("Enter CarID: ");
			int carid=inputs.nextInt();
			carsid.add(carid);
			preparedstatement.setInt(1,carid);
	        inputs.nextLine();
	        System.out.print("Enter Car Name: ");
	        preparedstatement.setString(2,inputs.nextLine());
	        System.out.print("Enter Car Model: ");
	        preparedstatement.setString(3,inputs.nextLine());
	        System.out.print("Enter Car Price: ");
	        preparedstatement.setDouble(4,inputs.nextDouble());
	        inputs.nextLine();
	        System.out.print("Enter Car Color: ");
	        preparedstatement.setString(5,inputs.nextLine());
	        System.out.print("Enter Car Fueltype: ");
	        preparedstatement.setString(6,inputs.nextLine());
	        result=preparedstatement.executeUpdate();
        if(result!=0) {
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

	 public void deleteCar() {
		   try { getdetails();
		   
		    openConnection();
		    query= "delete from car"
	        		+ " where carid = ? ";
		    preparedstatement =connection.prepareStatement(query);
		    System.out.print("Enter the Car ID to delete: ");
		    preparedstatement.setInt(1,inputs.nextInt());
		    result=preparedstatement.executeUpdate();
		    if(result!=0) {
		        System.out.println("Record deleted successfully !!!");
		    }
		    closeConnection();
		   }
		   catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
			}
	    }
	 

	 public void updateCar() {
		 
		 try {
			   openConnection();
			   
			 query = "update car set name= ? , model= ?, price=? ,color=?,fueltype=? where carid = ?";
			 preparedstatement =connection.prepareStatement(query);
			 System.out.print("Enter CarID to update : ");
			int carid=inputs.nextInt();
			preparedstatement.setInt(6,carid);
	        inputs.nextLine();
	        System.out.print("Enter Car Name: ");
	        preparedstatement.setString(1,inputs.nextLine());
	        System.out.print("Enter Car Model: ");
	        preparedstatement.setString(2,inputs.nextLine());
	        System.out.print("Enter Car Price: ");
	        preparedstatement.setDouble(3,inputs.nextDouble());
	        inputs.nextLine();
	        System.out.print("Enter Car Color: ");
	        preparedstatement.setString(4,inputs.nextLine());
	        System.out.print("Enter Car Fueltype: ");
	        preparedstatement.setString(5,inputs.nextLine());
	        result=preparedstatement.executeUpdate();
	        if(result!=0) {
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
		 
	 public void searchCarId() {
		 try {openConnection();
		 query= "select * from car "
	        		+ "where carid = ?";
		    preparedstatement =connection.prepareStatement(query);
		    System.out.print("Enter the Car ID to Search: ");
		    preparedstatement.setInt(1,inputs.nextInt());
		    resultSet=preparedstatement.executeQuery();
		 while (resultSet.next()) {
			 System.out.print(resultSet.getInt(1)+"\t"+
					          resultSet.getString(2)+"\t"+
					          resultSet.getString(3)+"\t"+
					          resultSet.getDouble(4)+"\t"+
					          resultSet.getString(5)+"\t"+
					          resultSet.getString(6)+"\t"+
					          "\n");
			 }
		 connection.close();
		 }
		 catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
			}
	 }
	 
	 public void searchCarName() {
		 try {
			 openConnection();
			 query= "select * from car "
		        		+ "where name =  ? ";
			    preparedstatement =connection.prepareStatement(query);
			    System.out.print("Enter the Car name to Search: ");
			    preparedstatement.setString(1,inputs.nextLine());
			    resultSet=preparedstatement.executeQuery();
			 while (resultSet.next()) {
				 System.out.print(resultSet.getInt(1)+" "+
						          resultSet.getString(2)+"  "+
						          resultSet.getString(3)+"  "+
						          resultSet.getDouble(4)+"  "+
						          resultSet.getString(5)+"  "+
						          resultSet.getString(6)+"  "+
						          "\n");
				 }
			 connection.close();
			 }
		 catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
			}
	 }
	 
	 public void searchCarModel() {
		 try {
			 openConnection();
			 query= "select * from car "
		        		+ "where model =  ? ";
			    preparedstatement =connection.prepareStatement(query);
			    System.out.print("Enter the Car model to Search: ");
			    preparedstatement.setString(1,inputs.nextLine());
			    resultSet=preparedstatement.executeQuery();
			 while (resultSet.next()) {
				 System.out.print(resultSet.getInt(1)+" "+
						          resultSet.getString(2)+"  "+
						          resultSet.getString(3)+"  "+
						          resultSet.getDouble(4)+"  "+
						          resultSet.getString(5)+"  "+
						          resultSet.getString(6)+"  "+
						          "\n");
				 }
			 connection.close();
			 }
		 catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
			}
	 }
	 public void searchCarFuel() {
		 try {
			 openConnection();
			 query= "select * from car "
		        		+ "where fueltype =  ? ";
			    preparedstatement =connection.prepareStatement(query);
			    System.out.print("Enter the Car Fueltype to Search: ");
			    preparedstatement.setString(1,inputs.nextLine());
			    resultSet=preparedstatement.executeQuery();
			 while (resultSet.next()) {
				 System.out.print(resultSet.getInt(1)+" "+
						          resultSet.getString(2)+"  "+
						          resultSet.getString(3)+"  "+
						          resultSet.getDouble(4)+"  "+
						          resultSet.getString(5)+"  "+
						          resultSet.getString(6)+"  "+
						          "\n");
				 }
			 connection.close();
			 }
		 catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
			}
		 }
	 
	 public void getdetails() {
		 try {
		 openConnection();
		 query= "select * from car;";
		 preparedstatement =connection.prepareStatement(query);
		 resultSet=preparedstatement.executeQuery(query);
		 System.out.println("*** Details ***");
		 while (resultSet.next()) {
		 System.out.print(resultSet.getInt(1)+" "+
				          resultSet.getString(2)+"  "+
				          resultSet.getString(3)+"  "+
				          resultSet.getDouble(4)+"  "+
				          resultSet.getString(5)+"  "+
				          resultSet.getString(6)+"  "+
				          "\n");
		 }
		 closeConnection();
		 }
		 catch(Exception e) {
				System.out.println("Invalid input...!!!");
				inputs.nextLine();
			} 
	 }
	 

      }
