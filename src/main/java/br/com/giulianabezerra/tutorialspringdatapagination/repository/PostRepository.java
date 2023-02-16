package br.com.giulianabezerra.tutorialspringdatapagination.repository;

import br.com.giulianabezerra.tutorialspringdatapagination.model.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

}
