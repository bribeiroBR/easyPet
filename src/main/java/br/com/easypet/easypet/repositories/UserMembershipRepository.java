package br.com.easypet.easypet.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.easypet.easypet.entities.UserMembership;

public interface UserMembershipRepository extends CrudRepository<UserMembership, Long> {

}
