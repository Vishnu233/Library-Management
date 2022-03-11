package com.example.Library.service;

import com.example.Library.dto.Books;
import com.example.Library.dto.Users;
import com.example.Library.entity.BooksEntity;
import com.example.Library.entity.UsersEntity;
import com.example.Library.repository.BooksRepository;
import com.example.Library.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    BooksRepository booksRepository;

    @Override
    public List<Users> getAllUsers() {
        List<Users> u=new ArrayList<>();
        for(UsersEntity user : usersRepository.findAll()) {
            Users s1 = new Users();
            s1.setId(user.getId());
            s1.setName(user.getName());
            s1.setAddress(user.getAddress());
            s1.setPhonenumber(user.getPhonenumber());
            u.add(s1);
        }
        return u;
    }

    @Override
    public void addUsers(Users user) {
        UsersEntity se1=new UsersEntity();
        se1.setId(user.getId());
        se1.setName(user.getName());
        se1.setAddress(user.getAddress());
        se1.setPhonenumber(user.getPhonenumber());
        usersRepository.save(new UsersEntity(se1.getId(),se1.getName(),se1.getAddress(),se1.getPhonenumber()));
    }

    @Override
    public List<Books> getAllBooks() {
        List<Books> b=new ArrayList<>();
        for(BooksEntity book:booksRepository.findAll()){
            Books s1=new Books();
            s1.setId(book.getId());
            s1.setName(book.getName());
            s1.setWriter(book.getWriter());
            s1.setSummary(book.getSummary());
            s1.setCategory(book.getCategory());
            b.add(s1);
        }
        return b;
    }

    @Override
    public void addBooks(Books books) {
        BooksEntity be1=new BooksEntity();
        be1.setId(books.getId());
        be1.setName(books.getName());
        be1.setWriter(books.getWriter());
        be1.setSummary(books.getSummary());
        be1.setCategory(books.getCategory());
        booksRepository.save(new BooksEntity(be1.getId(),be1.getName(),be1.getWriter(),be1.getSummary(),be1.getCategory()));
    }
}
