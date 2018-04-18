package br.com.easypet.easypet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.easypet.easypet.entities.Food;
import br.com.easypet.easypet.enums.PetFoodEnum;
import br.com.easypet.easypet.repositories.FoodRepository;
import br.com.easypet.easypet.repositories.FoodSearchRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository repository;

	@Autowired
	private FoodSearchRepository searchRepository;

	public Iterable<Food> findAllExcept(Food food) {
		return null;
		// if (food != null && food.getId() != null)
		// return searchRepository.findOwnerFoodExcept(food.getId());
		// return searchRepository.findOwnerFood();
	}

	public Iterable<Food> findAll() {
		return repository.findAll();
	}

	public void save(Food food) {
		repository.save(food);
	}

	public Food find(Long id) {
		return repository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		repository.deleteById(id);
		;
	}

	public String calcFoodQuality(String foodName) {
		for (PetFoodEnum petFoodEnum : PetFoodEnum.values()) {
			if (petFoodEnum.getName().equals(foodName))
				return petFoodEnum.getQuality();
		}
		return null;
	}

}