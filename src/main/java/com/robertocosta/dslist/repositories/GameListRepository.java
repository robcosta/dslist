package com.robertocosta.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertocosta.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
