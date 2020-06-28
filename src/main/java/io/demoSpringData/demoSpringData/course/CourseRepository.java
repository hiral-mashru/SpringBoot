package io.demoSpringData.demoSpringData.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> getCourseByName(String topicId);

    Course findOne(String id);
}
