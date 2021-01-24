package com.read_account.demo.mapper;

import com.read_account.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@Mapper
@Repository
public interface Usermapper {

    @Select("select * from user where login_name = #{id}")
    public User islogin(String id);

    @Insert("INSERT INTO user (uuid,login_name,user_pwd,create_time,head_img_url) VALUES (#{uuid},#{idname},#{password},#{timestamp},#{headimgurl}) ")
    public boolean insert(String uuid, String idname, String password, Timestamp timestamp,String headimgurl);

    @Select("select * from user where login_name= #{id}")
    public User getinformation(String id);

    @Update("UPDATE user SET nick_name = #{Nickname},phone_number=#{Phonenumber} WHERE login_name = #{userID}")
    public boolean updateinfo(String Nickname,String Phonenumber,String userID);

    @Update("UPDATE user SET head_img_url = #{imgUrl} WHERE login_name = #{userID}")
    public boolean updateHeadImg(String userID,String imgUrl);
}
