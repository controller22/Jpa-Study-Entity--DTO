package com.example.site1.model.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
// 데이터베이스의 테이블과 연동
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
// entity에서 setter는 꼭 필요한 경우만 사용
// toString도 직접 만드는 것을 추천
public class UserEntity {
    // 기본키 (PK)에 @Id를 붙인다.
    @Id
    // 데이터베이스에 있는 컬럼명 연결
    // 컬럼의 속성을 맞춰주는 것이 좋음
    @Column(name = "idx", nullable = false, unique = true)
    private Integer idx;

    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "password", nullable = false)
    private String password;

    @Override
    public String toString() {
        return "UserEntity [idx=" + idx + ", id=" + id + ", password=" + password + "]";
    }
}