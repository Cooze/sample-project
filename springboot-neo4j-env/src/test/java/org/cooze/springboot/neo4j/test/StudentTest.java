package org.cooze.springboot.neo4j.test;

import org.cooze.springboot.neo4j.entity.Student;
import org.cooze.springboot.neo4j.repository.StudentRepositry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/7/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Configure.class)
public class StudentTest {

    //报错有红线没关系，不影响单元测试
    @Autowired
    private StudentRepositry studentRepositry;

    @Test
    public void addStudent(){
        Student student = studentRepositry.save(new Student("张三","男",10));
    }

    @Test
    public void findStudent1(){

        Student student = studentRepositry.findByName("张三");

    }

    @Test
    public void findStudent2(){
        Student student = studentRepositry.getStudentByName("张三");
    }

}
