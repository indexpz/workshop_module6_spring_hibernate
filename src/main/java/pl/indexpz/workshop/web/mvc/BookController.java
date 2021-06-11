package pl.indexpz.workshop.web.mvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.indexpz.workshop.domain.model.Book;
import pl.indexpz.workshop.domain.service.BookService;

import javax.validation.Valid;

@Controller
@RequestMapping("/forms/book")
@Slf4j
public class BookController {

    private final BookService bookService;


    public BookController(BookService bookService) {
        this.bookService = bookService;

    }

    @GetMapping("/list")
    public String prepareList(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books/list";
    }


    @GetMapping("/create")
    public String prepareCreate(Model model){
        model.addAttribute("book", new Book());
        return "books/create-form";
    }

    @PostMapping("/create")
    public String processCreate(@Valid Book book, BindingResult bindings){
        if(bindings.hasErrors()){
            return "books/create-form";
        }
        bookService.save(book);
        log.debug("Książka po zapisie " + book);
    return "redirect:/forms/book/list";
    }

    @GetMapping("/edit")
    public String prepareEdit(Long id, Model model){
        model.addAttribute("book", bookService.findById(id));
        return "books/edit-form";
    }

    @PostMapping("/edit")
    public String procesEdit(@Valid Book book, BindingResult bindings){
        if(bindings.hasErrors()){
            return "books/edit-form";
        }
        log.debug("Książka przed edycją " + book);
        bookService.save(book);
        log.debug("Książka po edycji " + book);
    return "redirect:/forms/book/list";
    }

@GetMapping("/delete")
    public String prepareDelete(Long id, Model model){
      model.addAttribute("book", bookService.findById(id));
      return "books/confirm-delete";
}

    @PostMapping("/delete")
    public String processDelete(Long id) {
        log.debug("-----------------------------------------klik");
        Book book = bookService.findById(id);
        log.debug("Usuwanie książki: " + book);
        bookService.remove(book);
        log.info("Usunięto książkę: " + book);
        return "redirect:/forms/book/list";
    }

}
