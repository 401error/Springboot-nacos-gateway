package com.read_account.demo.mapper;


import com.read_account.demo.pojo.User;
import com.read_account.demo.pojo.UserBookshelf;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Mapper
@Repository
public interface UserBookmapper {
    @Select("select * from user_bookshelf where user_id = #{id}")
    public List<UserBookshelf> getBookshelf(String id);

    @Insert("INSERT INTO user_bookshelf (user_id,book_id,last_chapter_id,create_time) VALUES (#{user_id},#{book_id},#{lastchapter_id},#{timestamp}) ")
    public  boolean insertbookshelf(String user_id, String book_id, String lastchapter_id,Timestamp timestamp );


    @Delete("DELETE FROM user_bookshelf WHERE user_id=#{user_id} AND book_id=#{book_id}")
    public  boolean deletbookshelf(String user_id, String book_id);

    @Select("select * from user_bookshelf where user_id = #{user_id} AND book_id=#{book_id} ")
    public UserBookshelf ifbookshelf(String user_id, String book_id);
}
