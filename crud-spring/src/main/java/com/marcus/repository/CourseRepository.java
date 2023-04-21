package com.marcus.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.marcus.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
