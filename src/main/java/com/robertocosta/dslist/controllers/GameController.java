package com.robertocosta.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robertocosta.dslist.dto.GameDTO;
import com.robertocosta.dslist.dto.GameMinDTO;
import com.robertocosta.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameRepository;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		return gameRepository.findById(id);
	}
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameRepository.findAll();
		return result;
	}
	
}
