package com.book.bookcenter.mapper;

import com.book.bookcenter.pojo.Book;
import com.book.bookcenter.pojo.BookChapter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface HomePageMapper {

    @Select("select * from book where id in (select distinct book_id from book_chapter)order by rand() limit 10")
    public List<Book> getBookList();

    @Select("select name from book_chapter where book_id =#{book_id} order by sort_number")
    public List<String> getBookChapterList(Integer book_id);

    @Select("select content from book_chapter where book_id=#{book_id} and sort_number=#{sort_number}")
    public String getBookContext(Integer book_id,Integer sort_number);

    @Select("select * from book where book_id =#{book_id}")
    public Book getBookbybookid(String book_id);

    @Select("select distinct book_id from book_chapter")
    public List<Integer> getBookListbyid();

    @Select("select * from book where book_name like #{book_name}")
    public List<Book> getBookListbyname(String book_name);


}
