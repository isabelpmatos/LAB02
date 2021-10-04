package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AppController {
	
	@Autowired
    private UserRepository userRepo;
	
	@Autowired
	private AutomovelRepository automovelRepository;
	
	@Autowired
	private PedidoRepository pedidoRepo;
	
	@Autowired
    private AutomovelService service;
	
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
	
	@RequestMapping("/alugar/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("cadastroPedido");
	    AutomovelModel automovel = service.get(id);
	    mav.addObject("automovel", automovel);
	     
	    return mav;
	}
	
	@PostMapping("/salvarPedido")
	public ModelAndView salvarPedido(PedidoDeAluguel pedido) {
	     
	    pedidoRepo.save(pedido);
	     
	    ModelAndView mav = new ModelAndView("success");
		mav.addObject("listAutomoveis", automovelRepository.findAll());
		return mav;
	}
	
	
}
