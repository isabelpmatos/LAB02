//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
//public class AutomovelController {
//
//	@Autowired
//	private AutomovelRepository automovelRepository;
//	
//	@RequestMapping (method=RequestMethod.GET, value="/cadastroautomovel")
//	public String inicio() {
//		return "cadastroautomovel";
//	}
//	
//	@RequestMapping  (method=RequestMethod.POST, value="/salvarautomovel")
//	public String salvar(AutomovelModel automovel) {
//		automovelRepository.save(automovel);
//		return "index";
//}
//	
//}
