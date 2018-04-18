package br.com.easypet.easypet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.com.easypet.easypet.entities.Pet;

@Transactional(readOnly = true)
public interface PetSearchRepository extends JpaRepository<Pet, Long> {

//	@Query("select p from Pet p where p.id <> :id and p.owner is null")
//	List<Pet> findOwnerPetExcept(@Param("id") Long id);
//
//	@Query("select p from Pet p where p.owner is null")
//	List<Pet> findOwnerPet();

}
