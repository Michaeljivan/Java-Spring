package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping("/test")
	public String welcome()
	{
		System.out.println("AppContoller ->welcome()");
		return "test";
	}
	
	@RequestMapping("/list_players")
	public String listPlayer(Model model) {
		
		System.out.println("AppContoller ->listPlayer()");
		
		ContactBusiness team1 = new ContactBusiness();
		List<Player> playersList = team1.getPlayerList();
		
		model.addAttribute("players", playersList);
		
		// return players.jsp from the views
		return "players";
	}
	
	

}
