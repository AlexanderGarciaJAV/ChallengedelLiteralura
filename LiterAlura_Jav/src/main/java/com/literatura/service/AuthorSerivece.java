package com.literatura.service;

import com.literatura.models.Author;
import com.literatura.respository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class AuthorSerivece {

    @Autowired
    AuthorRepository authorRepository;

    public List<Author> getAllAuthors(){
        Optional<List<Author>> authors= Optional.of(authorRepository.findAll());
        return authors.orElse(null);
    }
    public List<Author> getAuthorsLiveIn(int year) {
        return authorRepository.findByBirthYearLessThanEqualAndDeathYearGreaterThan(year,year);
    }

}
