package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



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
		List<AutomovelModel> listAutomoveis = automovelRepository.findAll();
	    model.addAttribute("listAutomoveis", listAutomoveis);
		
		return "success";
	}
	
	@GetMapping ("/cadastroautomovel")
//	method=RequestMethod.GET, value="/cadastroautomovel"
	public String inicio(Model model) {
		model.addAttribute("automovel", new AutomovelModel());
		return "cadastroautomovel";
	}
	
	@PostMapping("/salvarautomovel")
	public ModelAndView salvar(AutomovelModel automovel) {
		automovelRepository.save(automovel);
		
		ModelAndView mav = new ModelAndView("success");
		mav.addObject("listAutomoveis", automovelRepository.findAll());
		return mav;
}
	
	
}
