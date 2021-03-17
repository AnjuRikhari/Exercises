package com.example.springdata.associations.bidirectional;

import com.example.springdata.associations.Address;
import com.example.springdata.associations.Author;
import com.example.springdata.associations.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class BidirectionalDaoService {
    @Autowired
    BidirectionalRepository bidirectionalRepository;

    public void addAuthorBook(){

        BidirectionalAuthor author = new BidirectionalAuthor();
        author.setAuthorName("Tom");

        Address authorAddress = new Address();
        authorAddress.setStreetNumber(22);
        authorAddress.setLocation("Jaipur");
        authorAddress.setState("Rajasthan");

        author.setAddress(authorAddress);

        BidirectionalBook book1 = new BidirectionalBook();
        BidirectionalBook book2 = new BidirectionalBook();
        BidirectionalBook book3 = new BidirectionalBook();

        book1.setBookName("Advance Java");
        book2.setBookName("C++");
        book3.setBookName("Computer Networks");


        author.addBook(book1);
        author.addBook(book2);
        author.addBook(book3);

        bidirectionalRepository.save(author);
    }
}
