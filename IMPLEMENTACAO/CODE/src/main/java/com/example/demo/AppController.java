package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AppController {
	
	@Autowired
    private UserRepository userRepo;
	
	@Autowired
	private AutomovelRepository automovelRepository;
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
	    model.addAttribute("user", new User());
	     
	    return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
	    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encodedPassword = passwordEncoder.encode(user.getPassword());
	    user.setPassword(encodedPassword);
	     
	    userRepo.save(user);
	     
	    return "register_success";
	}
	
	@GetMapping("/sucesso")
	public String sucessoPage(Model model) {
		List<User> listUsers = userRepo.findAll();
	    model.addAttribute("listUsers", listUsers);
		
		return "index";
	}
	
	@GetMapping ("/cadastroautomovel")
//	method=RequestMethod.GET, value="/cadastroautomovel"
	public String inicio() {
		return "cadastroautomovel";
	}
	
	@GetMapping  ("/salvarautomovel")
//	method=RequestMethod.POST, value="/salvarautomovel
	public String salvar(AutomovelModel automovel) {
		automovelRepository.save(automovel);
		return "index";
}
	
	
}
