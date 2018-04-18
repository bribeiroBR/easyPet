package br.com.easypet.easypet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.easypet.easypet.entities.UserMembership;
import br.com.easypet.easypet.repositories.UserMembershipRepository;
import br.com.easypet.easypet.repositories.UserMembershipSearchRepository;

@Service
public class UserMembershipService {

	@Autowired
	private UserMembershipRepository repository;

	@Autowired
	private UserMembershipSearchRepository searchRepository;

	public Iterable<UserMembership> findAllExcept(UserMembership userMembership) {
		return null;
//		if (userMembership != null && userMembership.getId() != null)
//			return searchRepository.findOwnerFoodExcept(userMembership.getId());
//		return searchRepository.findOwnerFood();
	}

	public Iterable<UserMembership> findAll() {
		return repository.findAll();
	}

	public void save(UserMembership userMembership) {
		repository.save(userMembership);
	}

	public UserMembership find(Long id) {
		return repository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}