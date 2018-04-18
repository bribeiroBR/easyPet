package br.com.easypet.easypet.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.easypet.easypet.entities.Pet;
import br.com.easypet.easypet.services.PetService;

@Controller
public class PetController {

	@Autowired
	private PetService service;

	@RequestMapping("/pet")
	public ModelAndView pet() {
		ModelAndView mv = new ModelAndView("/pet/pet");
		mv.addObject("pets", service.findAll());
		return mv;
	}

	@RequestMapping("/pet/edit")
	public ModelAndView edit(Pet pet) {
		ModelAndView mv = new ModelAndView("/pet/edit");
		mv.addObject("pet", pet);
		mv.addObject("pets", service.findAllExcept(pet));
		return mv;
	}

	@GetMapping("/pet/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		return edit(service.find(id));
	}

	@GetMapping("/pet/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		service.delete(id);
		return pet();
	}

	@PostMapping("/pet/save")
	public ModelAndView save(@Valid Pet pet) {
		service.save(pet);
		return pet();
	}

}