package com.acme.demoBoot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.acme.demoBoot.modelo.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
	
	User findByUsername(String name);

}
