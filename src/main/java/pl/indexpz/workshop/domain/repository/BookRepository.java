package pl.indexpz.workshop.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.indexpz.workshop.domain.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

//    @Query("select b from Book b")
    List<Book> findAllBy();

    Book save(Book book);




}
