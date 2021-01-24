package com.read_account.demo.controller;


import com.read_account.demo.pojo.Book;
import com.read_account.demo.service.UserBookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserBookselfController {


    @Autowired
    private UserBookservice userBookservice;

    @Autowired
    private  RemoteBookCentClient remoteBookCentClient;

    @GetMapping("/userbook")
    public List<Book> Userbook(HttpServletRequest request){
       String userid= request.getParameter("user_id");
        System.out.println(userid);
       List<String> bookid=userBookservice.getbookid(userid);
       if( bookid.isEmpty()){

           return  null;
       }
       else {

           System.out.println(bookid);
           List<Book> test =remoteBookCentClient.test(bookid);
           return test;
        }



    }

    @GetMapping("/ok")
    public String sksj(){

        return "sksk";
    }


    @GetMapping("/addbookshelf")
    public boolean  addbookshelf(HttpServletRequest request){
        String userid =request.getParameter("user_id");
        String bookid =request.getParameter("book_id");
        System.out.println(userid+"\n"+bookid);
        return userBookservice.insertbookshelf(userid,bookid);

    }

    @GetMapping("/removebookshelf")
    public boolean  removebookshelf(HttpServletRequest request){
        String userid =request.getParameter("user_id");
        String bookid =request.getParameter("book_id");
        System.out.println(userid+"\n"+bookid);
        return userBookservice.deletbookshelf(userid,bookid);

    }

    @GetMapping("/iffavorite")
    public boolean  iffavorite (HttpServletRequest request){
        String userid =request.getParameter("user_id");
        String bookid =request.getParameter("book_id");
        System.out.println(userid+"\n"+bookid);
        return userBookservice.ifbookshelf(userid,bookid);

    }


}
