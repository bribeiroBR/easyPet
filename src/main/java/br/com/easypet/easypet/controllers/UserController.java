package br.com.easypet.easypet.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.easypet.easypet.entities.User;
import br.com.easypet.easypet.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/user")
	public ModelAndView user() {
		ModelAndView mv = new ModelAndView("/user/user");
		mv.addObject("users", service.findAll());
		return mv;
	}

	@RequestMapping("/user/edit")
	public ModelAndView edit(User user) {
		ModelAndView mv = new ModelAndView("/user/edit");
		mv.addObject("user", user);
		mv.addObject("users", service.findAllExcept(user));
		return mv;
	}

	@GetMapping("/user/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		return edit(service.find(id));
	}

	@GetMapping("/user/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		service.delete(id);
		return user();
	}

	@PostMapping("/user/save")
	public ModelAndView save(@Valid User user) {
		service.save(user);
		return user();
	}

}