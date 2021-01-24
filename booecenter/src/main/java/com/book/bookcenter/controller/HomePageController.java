package com.book.bookcenter.controller;

import com.book.bookcenter.mapper.HomePageMapper;
import com.book.bookcenter.pojo.Book;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HomePageController {
    @Resource
    HomePageMapper homePageMapper;

    @GetMapping("/homeRequest")
    public List<Book> getHomeBookList(HttpServletRequest request)
    {
                return homePageMapper.getBookList();
    }

    @GetMapping("/bookChapter")
    public List<String> getBookChapter(HttpServletRequest request)
    {
        String book_id=request.getParameter("book_id");
        //System.out.println(book_id);
        return homePageMapper.getBookChapterList(Integer.valueOf(book_id));
    }

    @GetMapping("/bookContext")
    public String getBookContextbyid(HttpServletRequest request)
    {
        //@RequestParam("book_id") Integer book_id,@RequestParam("sort_number") Integer sort_number
        String book_id=request.getParameter("book_id");
        String sort_number=request.getParameter("sort_number");
        String result = homePageMapper.getBookContext(Integer.valueOf(book_id),Integer.valueOf(sort_number));
        //System.out.println(result.toString());
        return result;
    }
    @GetMapping("/hello")
    public String GetHello()
    {
        return "hello";
    }
    @GetMapping("/test")
    public List<Integer> TestBookList()
    {
        return homePageMapper.getBookListbyid();
    }
    @GetMapping("/bookshelf")
    public List<Book> GetShelf(@RequestBody List<String> book_id)
    {
        List<Book> bookList=new ArrayList<>();
        for(String book:book_id)
        {
            bookList.add(homePageMapper.getBookbybookid(book));
        }
        return bookList;
    }
    @GetMapping("/booklike")
    public List<Book> GetLook(@RequestBody List<String> book_id)
    {
        List<Book> bookList=new ArrayList<>();
        for(String book:book_id)
        {
            bookList.add(homePageMapper.getBookbybookid(book));
        }
        return bookList;
    }

    @GetMapping("/bookSearch")
    public List<Book> GetBookByName(HttpServletRequest request) {
        String book_name = request.getParameter("book_name");
        book_name="%"+book_name+"%";
        return homePageMapper.getBookListbyname(book_name);
    }

}
