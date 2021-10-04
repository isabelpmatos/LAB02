package com.example.models;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface AutomovelDetailsService {
	
	UserDetails loadAutomovelByPlaca(String placa) throws UsernameNotFoundException;
}
