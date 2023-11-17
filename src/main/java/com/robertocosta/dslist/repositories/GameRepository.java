package com.robertocosta.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertocosta.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
