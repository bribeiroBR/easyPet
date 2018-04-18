package br.com.easypet.easypet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.easypet.easypet.entities.PetFoodConsumption;
import br.com.easypet.easypet.repositories.PetFoodConsumptionRepository;
import br.com.easypet.easypet.repositories.PetFoodConsumptionSearchRepository;

@Service
public class PetFoodConsumptionService {

	@Autowired
	private PetFoodConsumptionRepository repository;

	@Autowired
	private PetFoodConsumptionSearchRepository searchRepository;

	public Iterable<PetFoodConsumption> findAllExcept(PetFoodConsumption petFoodConsumption) {
		return null;
//		if (petFoodConsumption != null && petFoodConsumption.getId() != null)
//			return searchRepository.findOwnerPetExcept(petFoodConsumption.getId());
//		return searchRepository.findOwnerPet();
	}

	public Iterable<PetFoodConsumption> findAll() {
		return repository.findAll();
	}

	public void save(PetFoodConsumption petFoodConsumption) {
		repository.save(petFoodConsumption);
	}

	public PetFoodConsumption find(Long id) {
		return repository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}
