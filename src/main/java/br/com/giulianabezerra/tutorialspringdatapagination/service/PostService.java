package br.com.giulianabezerra.tutorialspringdatapagination.service;

import br.com.giulianabezerra.tutorialspringdatapagination.model.Post;
import br.com.giulianabezerra.tutorialspringdatapagination.repository.PostRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Page<Post> listPosts(Pageable pageable) {
        return postRepository.findAll(pageable);
    }
}
