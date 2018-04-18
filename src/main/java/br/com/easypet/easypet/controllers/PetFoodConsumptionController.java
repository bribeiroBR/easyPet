package br.com.easypet.easypet.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.easypet.easypet.entities.PetFoodConsumption;
import br.com.easypet.easypet.services.PetFoodConsumptionService;

@Controller
public class PetFoodConsumptionController {

	@Autowired
	private PetFoodConsumptionService service;

	@RequestMapping("/petFoodConsumption")
	public ModelAndView petFoodConsumption() {
		ModelAndView mv = new ModelAndView("/petFoodConsumption/petFoodConsumption");
		mv.addObject("petFoodConsumptions", service.findAll());
		return mv;
	}

	@RequestMapping("/petFoodConsumption/edit")
	public ModelAndView edit(PetFoodConsumption petFoodConsumption) {
		ModelAndView mv = new ModelAndView("/petFoodConsumption/edit");
		mv.addObject("petFoodConsumption", petFoodConsumption);
		mv.addObject("petFoodConsumptions", service.findAllExcept(petFoodConsumption));
		return mv;
	}

	@GetMapping("/petFoodConsumption/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		return edit(service.find(id));
	}

	@GetMapping("/petFoodConsumption/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		service.delete(id);
		return petFoodConsumption();
	}

	@PostMapping("/petFoodConsumption/save")
	public ModelAndView save(@Valid PetFoodConsumption petFoodConsumption) {
		service.save(petFoodConsumption);
		return petFoodConsumption();
	}

}