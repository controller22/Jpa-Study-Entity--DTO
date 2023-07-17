package com.example.site1.domain.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.site1.domain.main.dto.ResPostDTO;
import com.example.site1.model.user.entity.PostEntity;
import com.example.site1.model.user.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<ResPostDTO> getPostPageData() {
        List<PostEntity> findPostAll = postRepository.findAll();

        // entity->dto
        List<ResPostDTO> ResPostDTOList = findPostAll
                .stream()
                .map((PostEntity) -> ResPostDTO.fromEntity(PostEntity))
                .toList();

        return ResPostDTOList;
    }

}
