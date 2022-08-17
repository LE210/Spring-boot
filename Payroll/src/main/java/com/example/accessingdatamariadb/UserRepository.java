package com.example.accessingdatamariadb;

import org.springframework.data.repository.CrudRepository;

// 이 기능은 Spring 에 의해서 userRepository 라는 Bean 으로 자동 구현
public interface UserRepository extends CrudRepository<User, Integer> {
}
