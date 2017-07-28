package org.cooze.springboot.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/7/27
 */
@EnableNeo4jRepositories(basePackages = {"org.cooze.springboot.neo4j.repository."  })
@EntityScan(basePackages = {"org.cooze.springboot.neo4j.entity."})
@SpringBootApplication
public class BootStrap {

    public static void main(String[] args){
        SpringApplication.run(BootStrap.class,args);
    }
}
