package com.read_account.demo.controller;


import com.read_account.demo.pojo.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "book-center-privider")
public interface RemoteBookCentClient {


    @RequestMapping(method = RequestMethod.GET,value = "/bookshelf",consumes = "application/json")
    public List<Book> test(@RequestBody List<String> BOOOKID);




}
