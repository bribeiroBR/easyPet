package br.com.easypet.easypet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.com.easypet.easypet.entities.Food;

@Transactional(readOnly = true)
public interface FoodSearchRepository extends JpaRepository<Food, Long> {

//	@Query("select f from Food f where f.id <> :id and f.owner is null")
//	List<Food> findOwnerFoodExcept(@Param("id") Long id);

//	@Query("select f from Food f where f.owner is null")
//	List<Food> findOwnerFood();

}
