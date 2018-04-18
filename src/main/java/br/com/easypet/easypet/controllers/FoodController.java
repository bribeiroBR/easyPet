package br.com.easypet.easypet.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.easypet.easypet.entities.Food;
import br.com.easypet.easypet.services.FoodService;

@Controller
public class FoodController {

	@Autowired
	private FoodService service;

	@RequestMapping("/food")
	public ModelAndView food() {
		ModelAndView mv = new ModelAndView("/food/food");
		mv.addObject("foods", service.findAll());
		return mv;
	}

	@RequestMapping("/food/edit")
	public ModelAndView edit(Food food) {
		ModelAndView mv = new ModelAndView("/food/edit");
		mv.addObject("food", food);
		mv.addObject("foods", service.findAllExcept(food));
		return mv;
	}

	@GetMapping("/food/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		return edit(service.find(id));
	}

	@GetMapping("/food/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		service.delete(id);
		return food();
	}

	@PostMapping("/food/save")
	public ModelAndView save(@Valid Food food) {
		service.save(food);
		return food();
	}

}