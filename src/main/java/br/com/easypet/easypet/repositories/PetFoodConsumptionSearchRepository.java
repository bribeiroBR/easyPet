package br.com.easypet.easypet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.com.easypet.easypet.entities.PetFoodConsumption;

@Transactional(readOnly = true)
public interface PetFoodConsumptionSearchRepository extends JpaRepository<PetFoodConsumption, Long> {

//	@Query("select pfc from PetFoodConsumption pfc where pfc.id <> :id and p.owner is null")
//	List<PetFoodConsumption> findOwnerPetExcept(@Param("id") Long id);
//
//	@Query("select p from Pet p where p.owner is null")
//	List<PetFoodConsumption> findOwnerPet();

}