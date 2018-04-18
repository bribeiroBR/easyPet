package br.com.easypet.easypet.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.easypet.easypet.entities.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
