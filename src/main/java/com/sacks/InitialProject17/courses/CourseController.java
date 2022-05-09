package com.sacks.InitialProject17.courses;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.sacks.InitialProject17.courses.repositories.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    CourseRepository repository;

    // GET - Retrieve info

    // http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return repository.findAll();

        // return Arrays.asList(new Course(1, "Learn Microservices", "Michael Sacks"),
        // new Course(2, "Learn Full Stack with Angular and React", "Michael Sacks"));
    }

    // http://localhost:8080/courses/1
    @GetMapping("/courses/{id}")
    public Course getCourseDetails(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);
        if (course.isEmpty()) {
            throw new RuntimeException("Course not found with id " + id);
        }
        return course.get();
    }

    // POST - Create a new resource
    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course) {
        repository.save(course);
    }

    // PUT - Update/Replace a resource
    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course) {
        repository.save(course);
    }

    // DELETE - Delete a resource
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        repository.deleteById(id);
    }

}
