package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// @Controller + @ResponseBody 하위 메서드에 JSON 전송가능
// 하위 모든 메서드가 view 대신 도메인 개체를 반환
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // Greeting 객체를 JSON 으로 변환해야하는데 Spring 에서는 Http 메세지 변환기를 자동으로 지원
    //  MappingJackson2HttpMessageConverter 가 자동으로 실행됨
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
