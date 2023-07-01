package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Voto;
import com.example.demo.repositories.VotoRepository;

@CrossOrigin(origins = "https://mateusfbarros.github.io")
@RestController
@RequestMapping(value ="/calcme")
public class VotoController {
	
	@Autowired
	public VotoRepository votoRepository;
	
	@GetMapping(value="/all")
	public List<Voto> getAllCalcmes(){
		return votoRepository.findAll(); 
	}
	
	@PostMapping(value ="/create")
	public ResponseEntity<String>  createCalcme(@RequestBody Voto calcme ) {
		try {
			votoRepository.insert(calcme);
			
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<> ("Erro ao tentar inserir registro", HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping(value ="/{id}")
	public ResponseEntity<String> deleteCalcme(@PathVariable ("id") Voto calcme) {
		try {
			votoRepository.deleteById(calcme.getId());
			
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<> ("Erro ao tentar excluir registro", HttpStatus.NOT_FOUND);
		}
		
	}
	
}
