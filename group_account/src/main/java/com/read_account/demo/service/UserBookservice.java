package com.read_account.demo.service;

import com.read_account.demo.mapper.UserBookmapper;
import com.read_account.demo.pojo.User;
import com.read_account.demo.pojo.UserBookshelf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserBookservice {

    @Autowired
    private UserBookmapper userBookmapper;

    public List<String> getbookid(String userid){

        List<UserBookshelf> bookshelves =userBookmapper.getBookshelf(userid);
        List<String> bookid=new ArrayList<>();
        for(UserBookshelf userBookshelf:bookshelves){
            bookid.add(userBookshelf.getBookId());
        }

        return bookid;
    }


    public  boolean insertbookshelf (String user_id, String book_id){

        Date date = new Date();
        java.sql.Timestamp timestamp = new Timestamp(date.getTime());
        return userBookmapper.insertbookshelf(user_id,book_id,null,timestamp);

    }


    public boolean deletbookshelf(String user_id, String book_id){

        return userBookmapper.deletbookshelf(user_id,book_id);
    }

    public boolean ifbookshelf(String user_id, String book_id){


        UserBookshelf userBookshelf = userBookmapper.ifbookshelf(user_id,book_id);

        if(userBookshelf == null) return false;
        else return true;
    }
}
