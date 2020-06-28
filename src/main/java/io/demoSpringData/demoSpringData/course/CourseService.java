package io.demoSpringData.demoSpringData.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll()
                .forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id){
        //return courses.stream().filter(t-> t.getId().equals(id)).findFirst().get();
        return courseRepository.findOne(id);
    }

    public void addCourse(Course course){
        //topics.add(topic);
        courseRepository.save(course);
    }

    public void updateCourse(Course course){
        courseRepository.save(course);
    }

    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }
}

