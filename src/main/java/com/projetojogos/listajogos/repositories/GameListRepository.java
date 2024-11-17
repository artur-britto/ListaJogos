package com.projetojogos.listajogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojogos.listajogos.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	

}