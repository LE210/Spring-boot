package com.example.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            // CustomerEntity 의 Customer() 생성자를 필요로 하며 해당 생성자를 사용
            // 데이터 저장
            repository.save(new Customer("Jack", "Sparrow"));
            repository.save(new Customer("Hector", "Barbossa"));
            repository.save(new Customer("Black", "Pearl"));
            repository.save(new Customer("Flying", "Dutchman"));

            // 모든 데이터 출력
            log.info("Customers found with findAll():");
            log.info("--------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // 해당 ID 와 일치하는 데이터 출력
            Customer customer = repository.findById(2L);
            log.info("Customer found with findById(2L):");
            log.info("----------------------------------");
            log.info(customer.toString());
            log.info("");

            // lastName 이 일치하는 데이터 출력
            log.info("Customer found with findByLastName('Sparrow'):");
            log.info("-----------------------------------------------");
            repository.findByLastName("Sparrow").forEach(sparrow -> {
                log.info(sparrow.toString());
            });

//            for (Customer sparrow : repository.findByLastName("Sparrow")) {
//                log.info(sparrow.toString());
//            }
            log.info("");
        };
    }
}
