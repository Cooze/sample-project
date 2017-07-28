package org.cooze.springboot.neo4j.service;

import org.cooze.springboot.neo4j.entity.Student;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/7/28
 */
public interface StudentService {

    Student getStudent(String name);

    Student addStudent(Student student);
}
