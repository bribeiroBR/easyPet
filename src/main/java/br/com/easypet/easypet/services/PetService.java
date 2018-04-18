package br.com.easypet.easypet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.easypet.easypet.entities.Pet;
import br.com.easypet.easypet.repositories.PetRepository;
import br.com.easypet.easypet.repositories.PetSearchRepository;

@Service
public class PetService {

	@Autowired
	private PetRepository repository;

	@Autowired
	private PetSearchRepository searchRepository;

	public Iterable<Pet> findAllExcept(Pet pet) {
		return null;
//		if (pet != null && pet.getId() != null)
//			return searchRepository.findOwnerPetExcept(pet.getId());
//		return searchRepository.findOwnerPet();
	}

	public Iterable<Pet> findAll() {
		return repository.findAll();
	}

	public void save(Pet pet) {
		repository.save(pet);
	}

	public Pet find(Long id) {
		return repository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}