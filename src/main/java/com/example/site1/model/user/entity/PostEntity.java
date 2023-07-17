package com.example.site1.model.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="post")
@NoArgsConstructor
@Getter
public class PostEntity {
    @Id
    // 데이터베이스에 있는 컬럼명 연결
    // 컬럼의 속성을 맞춰주는 것이 좋음
    @Column(name="idx", nullable = false ,unique = true)
    private Integer idx;

    @Column(name="title", nullable = false)
    private String title;
    @Column(name="content", nullable = false)
    private String content;
    @Column(name = "user_idx", nullable = false)
    private String userIdx;
    @Override
    public String toString() {
        return "PostEntity [idx=" + idx + ", title=" + title + ", content=" + content + ", userIdx=" + userIdx + "]";
    }
}
