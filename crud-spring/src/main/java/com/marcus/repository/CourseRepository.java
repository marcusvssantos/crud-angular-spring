package com.marcus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcus.model.Course;

@Repository 
public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
