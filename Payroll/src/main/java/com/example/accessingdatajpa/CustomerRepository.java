package com.example.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// CustomerRepository 확장
// Customer 과 함께 작동하는 엔티티 유형 및 ID 는 Long 매개변수에 저장
// CrudRepository 에 엔티티를 저장, 삭제, 찾는 방법을 포함하여 상속
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    // 메서드를 선언하여 다른 쿼리 메서드를 정의
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
