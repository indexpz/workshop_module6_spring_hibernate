package pl.indexpz.workshop.domain.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String isbn;
    @Column(nullable = false)
    @NotEmpty
    private String title;
    @Column(length = 100)
    @Size(max=100)
    private String author;
    @Column(length = 100)
    @Size(max=100)
    private String publisher;
    @Column
    private String type;


}
