package org.cooze.springboot.neo4j.repository;

import org.cooze.springboot.neo4j.entity.Student;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/7/27
 */
public interface StudentRepositry extends GraphRepository<Student> {

    @Query("MATCH (n:Student) " +
            "WHERE n.name = {name}  " +
            "RETURN n")
    Student getStudentByName(@Param("name") String Name);

    Student findByName( String Name );
}
