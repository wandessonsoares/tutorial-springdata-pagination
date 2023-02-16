package dev.wandessonsoares.tutorialspringdatapagination.controller;

import dev.wandessonsoares.tutorialspringdatapagination.service.PostService;
import dev.wandessonsoares.tutorialspringdatapagination.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
class PostController {
    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> listPosts(Pageable pageable) {
        return postService.listPosts(pageable).getContent();
    }
}
