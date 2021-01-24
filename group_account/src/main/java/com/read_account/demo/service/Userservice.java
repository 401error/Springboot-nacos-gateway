package com.read_account.demo.service;


import com.read_account.demo.Util.Localhostip;
import com.read_account.demo.mapper.Usermapper;
import com.read_account.demo.pojo.User;
import org.apache.velocity.tools.config.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Service
public class Userservice {

    @Autowired
    private Usermapper usermapper;

    @Autowired
    private Localhostip localhostip;

    @Value(value = "${localpath}")
    private String ip;

    public boolean FindID(String userId,String password){

        User user =usermapper.islogin(userId);
        if(user!=null&&user.getUserPwd().equals(password))return true;
        else return  false;

    }

    public  boolean updateUser(String userId,String password) {

        try {

            //String ip =localhostip.getip();
            String headimgurl = "http://"+ip+":9000/book-read-account-privider/image/default.jpg";
            Date date = new Date();
            java.sql.Timestamp timestamp = new Timestamp(date.getTime());
            String uuid = UUID.randomUUID().toString().replace("-", "");
            boolean isupdate = usermapper.insert(uuid, userId, password, timestamp,headimgurl);
            return isupdate;
        } catch (Exception e)
        {
            return  false ;
        }
    }

    public User getInformation(String userID){
        User user=usermapper.getinformation(userID);
        return user;
    }

    public boolean SaveheadImg(String userID,String filename) throws UnknownHostException, SocketException {

        String url;
        if(ip!=null) {
            url="http://"+ip+":9000"+"/book-read-account-privider/image/"+filename;
           boolean ischang =usermapper.updateHeadImg(userID,url);
            return ischang;
        }
        else {
            System.out.println("ip出错");
            return  false;
        }
    }


    public boolean UpdateInfo(String userID,String Nickname,String Phonenumber){

        try {
                boolean isupdate = usermapper.updateinfo(Nickname, Phonenumber, userID);

                return isupdate;

            }catch (Exception e)
        {
            System.out.println(e);
            return  false;
        }
    }
}
