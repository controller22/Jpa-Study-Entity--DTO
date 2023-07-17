package com.example.site1.domain.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.site1.domain.main.dto.ResPostDTO;
import com.example.site1.domain.main.service.PostService;

@Controller
public class PostController {
    
    @Autowired
    PostService secondService;

    @GetMapping("/post")
    // Mapping을 기반으로 함수 실행 -> controller의 함수 이름은 중요 X
    public ModelAndView postPage() {

        ModelAndView modelAndView = new ModelAndView();
        List<ResPostDTO> resPostDTOList = secondService.getPostPageData();
        modelAndView.addObject("resPostDTOList", resPostDTOList);
        modelAndView.setViewName("main/post");
        
        return modelAndView;
    }
}
