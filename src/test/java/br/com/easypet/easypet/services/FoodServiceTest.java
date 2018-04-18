package br.com.easypet.easypet.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.easypet.easypet.entities.Food;
import br.com.easypet.easypet.repositories.FoodRepository;

public class FoodServiceTest {
	
	@Mock
	private FoodRepository repository;
	
	@InjectMocks
	private FoodService foodService;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	

	@Test
	public void save() {
		Food foodToSave = Food.builder().name("racao pra gato").build();
		foodService.save(foodToSave);
		Food foodToVerify = Food.builder().name("racao pra gato").build();
		Mockito.verify(repository).save(foodToVerify);
		
	}
	
}
