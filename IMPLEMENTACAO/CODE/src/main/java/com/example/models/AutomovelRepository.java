package com.example.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.User;

public interface AutomovelRepository extends JpaRepository<Automovel, Integer>{
	
	@Query("SELECT a FROM Automovel a WHERE a.placa = ?1")
    public Automovel findByPlaca(String placa);
}
