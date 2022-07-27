package com.codestorm.demo;



import com.codestorm.demo.bean.Employee;
import com.codestorm.demo.mapper.EmployeeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMyBatishApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeMapper mapper;

    @Override
    public void run(String...args) throws Exception {

        logger.info("Inserting -> {}", mapper.insert(new Employee(10011L, "Asep", "Saputra", "asep@gmail.com")));
        logger.info("Inserting -> {}", mapper.insert(new Employee(10012L, "John", "D", "john@gmail.com")));
        logger.info("Inserting -> {}", mapper.insert(new Employee(10013L, "Tony", "Stark", "stark@gmail.com")));

        logger.info("Employee id 10011 -> {}", mapper.findById(10011L));

        logger.info("Update 10003 -> {}", mapper.update(new Employee(10011L, "Asep", "Ganteng", "asep@gmail.com")));

        mapper.deleteById(10013L);

        logger.info("All users -> {}", mapper.findAll());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyBatishApplication.class, args);
    }
}