package net.spring.boot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.spring.boot.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByLastName(String lastname);
    
}
