package com.example.accessingdatajpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// @Table 주석이 없으므로 이 Entity 는 Customer 이라는 테이블에 매핑된다고 가정
@Entity
@Data
public class Customer {

    // 객체의 아이디로 인식할 수 있도록 @Id 어노테이션
    // ID 가 자동으로 생성되어야함을 나타내는 @GeneratedValue
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // 아래의 두 객체의 어노테이션이 없는 이유
    // 객체 자체와 동일한 이름을 고유하는 열에 매핑된다고 가정
    private String firstName;
    private String lastName;

    // default 생성자, 직접 사용하지 않으므로 protected 로 지정
    protected Customer() {}

    // 실제 사용하는 생성자
    // Customer db에 저장할 인스턴스를 만드는데 사용
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // 하나의 출력방식을 정해서 리턴
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName
        );
    }
}
