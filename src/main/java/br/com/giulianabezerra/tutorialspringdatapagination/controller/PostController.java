package br.com.giulianabezerra.tutorialspringdatapagination.controller;

import br.com.giulianabezerra.tutorialspringdatapagination.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.giulianabezerra.tutorialspringdatapagination.model.Post;

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
