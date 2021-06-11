package pl.indexpz.workshop.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.indexpz.workshop.domain.model.Book;
import pl.indexpz.workshop.domain.repository.BookRepository;

import javax.transaction.Transactional;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class DataSetup {

    private static final Logger loger = LoggerFactory.getLogger(DataSetup.class);

    private AtomicBoolean alreadyRun = new AtomicBoolean(false);

    private final BookRepository bookRepository;


    public DataSetup(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @EventListener
    @Transactional
    public void testData(ContextRefreshedEvent event){
        if(!alreadyRun.getAndSet(true)){
            System.out.println("Aplikacja właśnie się uruchomiła i rozpoczynamy zabawę");
            bookRepository.save(new Book(null, "isbn-445", "Pan Wołodyjowski", "Henryk Sienkiewicz", "Na zdrowie", "przygodowa"));
            bookRepository.save(new Book(null, "isbn-118", "Niebieski", "Jurand Janicki", "Pij", "sy-fy"));
        }
    }
}
