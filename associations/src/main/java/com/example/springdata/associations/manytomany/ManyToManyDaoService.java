package com.example.springdata.associations.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.HashSet;

@Component
public class ManyToManyDaoService {
    @Autowired
    ManyToManyRepository manyToManyRepository;

    public void addManyToManyAuthorBook(){
        AuthorManyToMany authorManyToMany = new AuthorManyToMany();
        authorManyToMany.setName("Clark");

        AuthorManyToMany authorManyToMany2 = new AuthorManyToMany();
        authorManyToMany.setName("John");

        BookManyToMany book = new BookManyToMany();
        book.setName("Java Programming");
        BookManyToMany book1 = new BookManyToMany();
        book1.setName("Spring Boot");

        authorManyToMany.addBook(book);
        authorManyToMany.addBook(book1);

        manyToManyRepository.save(authorManyToMany);
    }
}
