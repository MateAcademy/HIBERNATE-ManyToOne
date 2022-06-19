package com.library_hibernate;

import com.library_hibernate.entity.Author;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

        Author au = new Author();
        au.setName("Shevchenko");
        ah.addAuthor(au);

        List<Author> authorList = ah.getAuthorList();
        for (Author author : authorList) {
            System.out.println(author.getId() + " " + author.getName());
        }

//        Author authorList = ah.getAuthorByID(1);
//        System.out.println(authorList.getId() + " " + authorList.getName());
    }
}
