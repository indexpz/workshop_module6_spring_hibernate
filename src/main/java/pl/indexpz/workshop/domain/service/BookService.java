package pl.indexpz.workshop.domain.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.indexpz.workshop.domain.model.Book;
import pl.indexpz.workshop.domain.repository.BookRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Primary
@Service
@Slf4j
@Repository
@Transactional
public class BookService {

    @PersistenceContext
    protected EntityManager em;

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public Book save(Book entity) {
        return bookRepository.save(entity);
    }

    public Book update(Book entity) {
        return em.merge(entity);
    }

    public Book findById(Long id) {
        return em.find(Book.class, id);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public void remove(Book entity) {
        em.remove(em.contains(entity) ? entity : em.merge(entity));
    }
    }
