package dev.wandessonsoares.tutorialspringdatapagination.repository;

import dev.wandessonsoares.tutorialspringdatapagination.model.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

}
