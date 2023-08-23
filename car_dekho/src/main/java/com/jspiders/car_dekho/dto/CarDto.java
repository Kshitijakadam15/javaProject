package com.jspiders.car_dekho.dto;
import  javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
@Data
@Entity

public class CarDto {
	@Id
	private int carid;
	private String name;
	private String model;
	private double price;
	private String color;
	private String fueltype;
	
}
