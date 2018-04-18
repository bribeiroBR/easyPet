package br.com.easypet.easypet.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.easypet.easypet.entities.Food;

public interface FoodRepository extends CrudRepository<Food, Long> {

}
