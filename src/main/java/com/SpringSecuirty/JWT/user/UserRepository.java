package com.SpringSecuirty.JWT.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


//to connect the Repository methods to access the database and give the query AS needed
public interface UserRepository extends JpaRepository<User, Integer> {

	
	Optional<User> findBYEmail(String email);
}
