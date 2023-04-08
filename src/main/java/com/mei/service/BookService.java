package com.mei.service;

import com.mei.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mql
 * @date 2023年04月05日 10:35
 */
public interface BookService {
    //增加一本书
    int addBooks(Books books);

    //删除一本书
    int deleteBooksById(int id);

    //修改一本书
    int updateBooks(Books books);

    //查找一本书
    Books getBooksById(int id);

    //查询全部书籍
    List<Books> getAllBooks();

    //通过名字模糊查询书籍
    List<Books> getBooks(String query);
}
