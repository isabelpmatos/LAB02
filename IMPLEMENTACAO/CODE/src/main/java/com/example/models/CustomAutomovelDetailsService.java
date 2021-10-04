package com.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.CustomUserDetails;

public class CustomAutomovelDetailsService implements AutomovelDetailsService{
	@Autowired
    private AutomovelRepository autoRepo;
     
    @Override
    public UserDetails loadAutomovelByPlaca(String placa) throws PlacaNotFoundException {
        Automovel auto = autoRepo.findByPlaca(placa);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }
}
