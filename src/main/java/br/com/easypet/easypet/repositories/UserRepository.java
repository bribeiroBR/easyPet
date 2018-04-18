package br.com.easypet.easypet.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.easypet.easypet.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUsername(String username);

}
