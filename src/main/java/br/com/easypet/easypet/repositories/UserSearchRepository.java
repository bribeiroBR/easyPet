package br.com.easypet.easypet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.com.easypet.easypet.entities.User;

@Transactional(readOnly = true)
public interface UserSearchRepository extends JpaRepository<User, Long> {

//	@Query("select u from User u where u.id <> :id")
//	List<User> findOwnerFoodExcept(@Param("id") Long id);
//
//	@Query("select u from User u where u.owner is null")
//	List<User> findOwnerFood();

}
