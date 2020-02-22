package com.example.demo;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.data.CarDatabase;
import com.example.data.HouseDatabase;
import com.example.data.PlayerDatabase;
import com.example.objects.Car;
import com.example.objects.House;
import com.example.objects.Player;

@Controller
public class AppController {
	
	@RequestMapping("/")
	public String welcome()
	{
		System.out.println("AppContoller ->welcome()");
		return "index";
	}
	
	@RequestMapping("/list_players")
	public String listPlayer(Model model) {
		
		System.out.println("AppContoller ->listPlayer()");
		
		PlayerDatabase team1 = new PlayerDatabase();
		List<Player> playersList = team1.getPlayerList();
		
		model.addAttribute("players", playersList);
		
		// return players.jsp from the views.
		return "players";
	}
	
	@RequestMapping("/list_houses")
	public String listHouse(Model model)
	{
		System.out.println("AppController ->listHouse()");
		
		HouseDatabase house1 = new HouseDatabase();
		List<House> housesList = house1.getHouseList();
		
		model.addAttribute("houses", housesList);
		
		// return houses.jsp form the views.
		return "houses";
		
	}
	
	@RequestMapping("/list_cars")
	public String listCar(Model model)
	{
		System.out.println("AppController ->listCar()");
		
		CarDatabase car1 = new CarDatabase();
		List<Car> carsList = car1.getCarList();
		
		model.addAttribute("cars", carsList);
		
		return "cars";
	}
	
	@RequestMapping("/info")
	public String info()
	{
		System.out.println("AppController ->info()");
		return "info";
	}

}
