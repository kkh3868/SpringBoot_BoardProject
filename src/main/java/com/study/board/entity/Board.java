package com.study.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // Board 클래스가 데이터베이스의 Table을 나타낸다는 것을 표시합니다.
@Data // Lombok 라이브러리의 @Data 어노테이션은 모든 필드에 대한 게터(Getter), 세터(Setter), equals(), hashCode(), 그리고 toString() 메서드를 자동으로 생성합니다.
public class Board {

    @Id // 이 필드가 엔티티의 기본 키(primary key)임을 나타냅니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // JPA에게 엔티티의 기본 키를 데이터베이스의 자동 증가 기능을 사용하여 생성하도록 지시합니다.
    private Integer id; // 게시글의 고유한 식별자

    private String title; // 게시글의 제목

    private String content; // 게시글의 내용

    private String filename;

    private String filepath;

}
