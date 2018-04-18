package br.com.easypet.easypet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.easypet.easypet.entities.User;
import br.com.easypet.easypet.repositories.UserRepository;
import br.com.easypet.easypet.repositories.UserSearchRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private UserSearchRepository searchRepository;

	public Iterable<User> findAllExcept(User user) {
		return null;
//		if (user != null && user.getId() != null)
//			return searchRepository.findOwnerFoodExcept(user.getId());
//		return searchRepository.findOwnerFood();
	}

	public Iterable<User> findAll() {
		return repository.findAll();
	}

	public void save(User user) {
		repository.save(user);
	}

	public User find(Long id) {
		return repository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}