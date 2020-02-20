package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WinLooseTie {
	public static int WINS, LOOSES, TIES;

	
	
	@RequestMapping(value = "/score/wins", method = RequestMethod.POST)
	public int increaseWins() {
		WINS++;
		return WINS;
		 

	}

	@RequestMapping(value = "/score/looses", method = RequestMethod.POST)
	public int increaseLooses() {
		LOOSES++;
		return LOOSES;

	}
	
	@RequestMapping(value = "/score/ties", method = RequestMethod.POST)
	public int increaseTies() {
		TIES++;
		return TIES;

	}
	
	
	@RequestMapping(value = "/score/PlayerChoice", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String increasePlayerWins(String PlayerChoice) {
		System.out.print(PlayerChoice);
		
		String pattern = "{ \"Result\":\"%s\"}";
		return String.format(pattern, RPS.game(PlayerChoice));
		

		
		
	}

}