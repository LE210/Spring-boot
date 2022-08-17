package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication 는 다음의 기능들을 포함
// @Configuration : 애플리케이션 컨텍스트에 대한 빈 정의의 소스로 클래스에 태그를 지정
// @EnableAutoConfiguration : Spring Boot 에 클래스 경로 설정, 기타 빈 및 다양한 속성 설정을 기반으로 빈 추가를 시작하도록 지시
// @ComponentScan : Spring 이 해당 패키지에서 다른 구성 요소, 구성 및 서비스를 찾도록 지시하여 컨트롤러를 찾음
@SpringBootApplication
public class GreetingApplication {
    public static void main(String[] args) {
        SpringApplication.run(GreetingApplication.class, args);
    }
}
