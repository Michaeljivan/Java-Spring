package com.example.data;

import java.util.ArrayList;
import java.util.List;

import com.example.objects.Car;

public class CarDatabase {
	
	public List<Car> getCarList(){
		List<Car> carList = new ArrayList<>(); 
		
		carList.add(new Car("Prius", 2019, 35000.00));
		carList.add(new Car("Camry", 2013, 22000.00));
		carList.add(new Car("Model 3", 2018, 30000.00));
		carList.add(new Car("Civic", 2008, 2000.00));
		carList.add(new Car("Cyber truck", 2020, 39000.00));
				
		return carList;
	}
}
