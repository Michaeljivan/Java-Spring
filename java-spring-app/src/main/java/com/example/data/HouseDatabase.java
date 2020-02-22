package com.example.data;

import java.util.ArrayList;
import java.util.List;

import com.example.objects.House;

public class HouseDatabase {
	
	public List<House> getHouseList(){
		List<House> houseList = new ArrayList<>(); 
		
		houseList.add(new House(2500, 1560000.99, "California"));
		houseList.add(new House(3450, 780000.00, "California"));
		houseList.add(new House(1982, 350900.00, "Arizona"));
		houseList.add(new House(1616, 555900.99, "Nevada"));
		houseList.add(new House(28660, 165000000.00, "California"));
				
		return houseList;
	}
}
