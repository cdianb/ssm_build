package com.mei.dao;

import com.mei.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

/**
 * @author mql
 * @date 2023年04月05日 10:11
 */
public interface BookMapper {
    //增加一本书
    int addBooks(Books books);
    
    //删除一本书
    int deleteBooksById(@Param("bookId") int id);
    
    //修改一本书
    int updateBooks(Books books);
    
    //查找一本书
    Books getBooksById(@Param("bookId") int id);
    
    //查询全部书籍
    List<Books> getAllBooks();

    //模糊查询获取书籍列表
    List<Books> getBooks(@Param("query") String query);
}
