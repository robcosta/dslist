package com.robertocosta.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robertocosta.dslist.dto.GameMinDTO;
import com.robertocosta.dslist.entities.Game;
import com.robertocosta.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(game -> new GameMinDTO(game)).toList();
	}
}
