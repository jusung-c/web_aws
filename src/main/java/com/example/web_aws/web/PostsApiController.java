package com.example.web_aws.web;

import com.example.web_aws.service.PostsService;
import com.example.web_aws.web.dto.PostsSaveRequestDto;
import com.example.web_aws.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }


}
