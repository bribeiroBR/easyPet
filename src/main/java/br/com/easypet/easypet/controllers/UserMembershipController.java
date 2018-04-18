package br.com.easypet.easypet.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.easypet.easypet.entities.UserMembership;
import br.com.easypet.easypet.services.UserMembershipService;

@Controller
public class UserMembershipController {

	@Autowired
	private UserMembershipService service;

	@RequestMapping("/userMembership")
	public ModelAndView userMembership() {
		ModelAndView mv = new ModelAndView("/userMembership/userMembership");
		mv.addObject("userMemberships", service.findAll());
		return mv;
	}

	@RequestMapping("/userMembership/edit")
	public ModelAndView edit(UserMembership userMembership) {
		ModelAndView mv = new ModelAndView("/userMembership/edit");
		mv.addObject("userMembership", userMembership);
		mv.addObject("userMemberships", service.findAllExcept(userMembership));
		return mv;
	}

	@GetMapping("/userMembership/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		return edit(service.find(id));
	}

	@GetMapping("/userMembership/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		service.delete(id);
		return userMembership();
	}

	@PostMapping("/userMembership/save")
	public ModelAndView save(@Valid UserMembership userMembership) {
		service.save(userMembership);
		return userMembership();
	}

}