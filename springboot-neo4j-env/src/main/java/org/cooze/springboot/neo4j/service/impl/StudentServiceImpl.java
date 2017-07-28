package org.cooze.springboot.neo4j.service.impl;

import org.cooze.springboot.neo4j.entity.Student;
import org.cooze.springboot.neo4j.repository.StudentRepositry;
import org.cooze.springboot.neo4j.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/7/28
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepositry studentRepositry;

    @Override
    public Student getStudent(String name) {
        return studentRepositry.findByName(name);
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepositry.save(student);
    }
}
