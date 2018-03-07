package net.spring.boot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.spring.boot.domain.Course;

public interface CourseRepository extends CrudRepository<Course, Long>  {
    
	List<Course> findByName(String name);
}

