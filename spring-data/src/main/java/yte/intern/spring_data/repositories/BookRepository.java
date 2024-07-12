package yte.intern.spring_data.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import yte.intern.spring_data.entities.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {

    Optional<Book> findByTitle(String title);

    List<Book> findByAgeGreaterThanEqual(Long age);

    List<Book> findByPublishDateAfter(LocalDate publishDate, Pageable pageRequest);

    List<Book> findByTitleContains(String title);

    List<Book> findByAuthorAndAgeGreaterThan(String author,Long age);

    long countByAuthor(String author);

    boolean existsByAuthor(String author);

}
