package net.spring.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.spring.boot.domain.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
	
    Users findByUsername(String username);

}
