package com.example.data;

import java.util.ArrayList;
import java.util.List;

import com.example.objects.Player;

public class PlayerDatabase {
	
	public List<Player> getPlayerList(){
		List<Player> listPlayer = new ArrayList<>(); 
		
		listPlayer.add(new Player("Kohli", "Batsman", "India"));
		listPlayer.add(new Player("Sharma", "Batsman", "India"));
		listPlayer.add(new Player("Prithvi", "Batsman", "India"));
		listPlayer.add(new Player("Shaw", "Batsman", "India"));
		listPlayer.add(new Player("Patel", "Bowler", "India"));
		
		return listPlayer;
	}
}
