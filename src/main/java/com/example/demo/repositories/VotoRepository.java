package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Voto;

public interface VotoRepository extends MongoRepository<Voto, String> {
	
}
