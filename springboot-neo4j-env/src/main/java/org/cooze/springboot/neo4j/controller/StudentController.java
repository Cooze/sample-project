package org.cooze.springboot.neo4j.controller;

import org.cooze.springboot.neo4j.entity.Student;
import org.cooze.springboot.neo4j.repository.StudentRepositry;
import org.cooze.springboot.neo4j.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/7/27
 */
@RestController
public class StudentController {

    @Autowired
    private StudentRepositry studentRepositry;

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/student")
    @ResponseBody
    public Student addStudent(@RequestBody Student student){

        return  studentService.addStudent(student);
    }

    @GetMapping(value = "/student/{name}")
    public Student getStudent(@PathVariable(name = "name") String name){
        return studentService.getStudent(name);
    }

}
