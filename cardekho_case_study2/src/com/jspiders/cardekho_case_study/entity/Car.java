package com.jspiders.cardekho_case_study.entity;

public class Car {
	private int carid;
	private String name;
	private String model;
	private double price;
	private String color;
	private String fueltype;
	
	//........getter methods....
	
	public int getCarid(){
		return carid;	
	}
	public String getName(){
		return name;	
	}
	public String getModel(){
		return model;	
	}
	public String getColor(){
		return color;	
	}
	public double getPrice(){
		return price;	
	}
	public String getFueltype(){
		return fueltype;	
	}
	
	//......set methods......
	
	public void setCarid(int carid){
		this.carid=carid;	
	}
	public void setName(String name){
		if (name.charAt(0)>=97 && name.charAt(0)<=122 || name.charAt(0)>=65 && name.charAt(0)>=90 ) 
		{
		this.name=name;
		}
		else {
			System.out.println("Name is Not Valid");
		}
	}
	public void setModel( String model){
		if (model.charAt(0)>=97 && model.charAt(0)<=122 || model.charAt(0)>=65 && model.charAt(0)>=90 ) {
		this.model=model;
		}
		else {
			System.out.println("Model is Not Valid");
		}
	}
	public void setPrice(double price){
		this.price=price;	
	}
	public void setColor(String color){
		if (model.charAt(0)>=97 && model.charAt(0)<=122 || model.charAt(0)>=65 && model.charAt(0)>=90 ) {
		this.color=color;	
		}
		else {
			System.out.println("Color is Not Valid");
		}
	}
	public void setFueltype(String fueltype){
		if (fueltype.equalsIgnoreCase("disel")|| fueltype.equalsIgnoreCase("petrol")){
		this.fueltype=fueltype;	
		}
		else
		{
			System.out.println("Fueltype is not valid");
		}
	}
	
	@Override
	public boolean equals(Object o){
		Car c=(Car)o;
		if (this.carid==c.carid && this.name.equalsIgnoreCase(c.name)&& this.model.equalsIgnoreCase(c.model)&& this.price==c.price && this.color.equalsIgnoreCase(c.color) && this.fueltype.equalsIgnoreCase(c.fueltype))
		{
			return true;
		}
		return false;	
	}
	
	@Override
	public String toString() {
		return  carid + "\t"+
	            name + "\t" + 
				model + "\t" + 
	            price + "\t" + 
				color+ "\t" +
	            fueltype ;
	}
	
	@Override
	public int hashCode() {
		return ((Integer)carid).hashCode()+name.hashCode()+model.hashCode()+((Double)price).hashCode()+ color.hashCode()+fueltype.hashCode();
	}
	
	
}
