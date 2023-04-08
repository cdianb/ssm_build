package com.mei.controller;

import com.mei.pojo.Books;
import com.mei.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author mql
 * @date 2023年04月05日 12:14
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller层调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    //查询全部书籍，并且返回到书籍展示页面
    @RequestMapping("allBook")
    public String list(Model model){
        List<Books> allBooks = bookService.getAllBooks();
        model.addAttribute("list", allBooks);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("toAddBook")
    public String toAddPage(Model model){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("addBook")
    public String addBook(Books books){
        System.out.println("addBook==>" + books);
        bookService.addBooks(books);
        return "redirect:/book/allBook";
    }

    //跳转到修改页面
    @RequestMapping("toUpdateBook")
    public String toUpdateBook(int id, Model model){
        Books book = bookService.getBooksById(id);
        model.addAttribute("books", book);
        return "updateBook";
    }

    //修改书籍的请求
    @RequestMapping("updateBook")
    private String updateBook(Books books){
        System.out.println("updateBook===>" + books);
        bookService.updateBooks(books);
        return "redirect:/book/allBook";
    }

    //删除书籍的请求
    @RequestMapping("deleteBook")
    private String deleteBook(int id){
        System.out.println("deleteBook===>" + id);
        bookService.deleteBooksById(id);
        return "redirect:/book/allBook";
    }

    //查询书籍的请求
    @RequestMapping("getBooks")
    private String getBookByName(String query, Model model){
        List<Books> allBooks = bookService.getBooks(query);
        model.addAttribute("list", allBooks);
        return "allBook";
    }





}
