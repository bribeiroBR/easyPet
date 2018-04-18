package br.com.easypet.easypet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.com.easypet.easypet.entities.UserMembership;

@Transactional(readOnly = true)
public interface UserMembershipSearchRepository extends JpaRepository<UserMembership, Long> {

////	@Query("select um from UserMembership um where um.id <> :id")
////	List<UserMembership> findOwnerFoodExcept(@Param("id") Long id);
////
////	@Query("select um from UserMembership um where um.owner is null")
//	List<UserMembership> findOwnerFood();

}
