package com.projetojogos.listajogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojogos.listajogos.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
