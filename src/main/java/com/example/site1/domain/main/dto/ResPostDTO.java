package com.example.site1.domain.main.dto;

import com.example.site1.model.user.entity.PostEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResPostDTO {

    private String title;
    private String content;
    private Integer userIdx;


    public static ResPostDTO fromEntity(PostEntity postEntity) {
        return new  ResPostDTO(postEntity.getTitle(), postEntity.getContent(),postEntity.getIdx());
    }
    
}
