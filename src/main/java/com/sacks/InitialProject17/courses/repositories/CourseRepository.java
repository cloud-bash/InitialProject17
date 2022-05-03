package com.sacks.InitialProject17.courses.repositories;

import com.sacks.InitialProject17.courses.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}