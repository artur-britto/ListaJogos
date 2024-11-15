package com.projetojogos.listajogos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetojogos.listajogos.dto.GameListDTO;
import com.projetojogos.listajogos.servicies.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class ControllerList {
	
	@Autowired
	private GameListService gameListService;
	
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
}
