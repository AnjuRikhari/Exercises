package com.example.springdata.associations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorDaoService {
    @Autowired
    AuthorRepository authorRepository;

    public void addAuthorData(){

        Author author = new Author();
        author.setAuthorName("Smith");

        Address authorAddress = new Address();
        authorAddress.setStreetNumber(18);
        authorAddress.setLocation("Delhi");
        authorAddress.setState("Delhi");

        author.setAddress(authorAddress);

        Subject subject1 = new Subject();
        Subject subject2 = new Subject();
        Subject subject3 = new Subject();

        subject1.setSubjectName("Linux");
        subject2.setSubjectName("JVM");
        subject3.setSubjectName("Spring Boot");

        author.addSubject(subject1);
        author.addSubject(subject2);
        author.addSubject(subject3);
        System.out.println(author);
        authorRepository.save(author);
    }
}
