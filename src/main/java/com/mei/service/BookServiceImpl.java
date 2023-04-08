package com.mei.service;

import com.mei.dao.BookMapper;
import com.mei.pojo.Books;

import java.util.List;

/**
 * @author mql
 * @date 2023年04月05日 10:36
 */
public class BookServiceImpl implements BookService {
    //service调dao层：组合dao
    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBooks(Books books) {
        return bookMapper.addBooks(books);
    }

    public int deleteBooksById(int id) {
        return bookMapper.deleteBooksById(id);
    }

    public int updateBooks(Books books) {
        return bookMapper.updateBooks(books);
    }

    public Books getBooksById(int id) {
        return bookMapper.getBooksById(id);
    }

    public List<Books> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    public List<Books> getBooks(String query){
        return bookMapper.getBooks(query);
    }
}
