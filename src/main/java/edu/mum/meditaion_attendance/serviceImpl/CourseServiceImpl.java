package edu.mum.meditaion_attendance.serviceImpl;


import edu.mum.meditaion_attendance.domain.Course;
import edu.mum.meditaion_attendance.domain.Location;
import edu.mum.meditaion_attendance.repository.CourseRepository;
import edu.mum.meditaion_attendance.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@Service

public class CourseServiceImpl implements CourseService {

    @Autowired
    public CourseRepository courseRepository ;


    @Override
    public List<Course> findAll(){
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long courseId){
        return  courseRepository.findById(courseId).get();

    }
    @Override
    public Course save(Course course){

        return  courseRepository.save(course);
    }

    @Override
    public void delete(Long id) {
        courseRepository.deleteById(id);
    }
}
