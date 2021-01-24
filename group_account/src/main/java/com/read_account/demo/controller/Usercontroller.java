package com.read_account.demo.controller;

import com.read_account.demo.mapper.Usermapper;
import com.read_account.demo.pojo.User;
import com.read_account.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;


@RefreshScope
@RestController
public class Usercontroller {
    @Autowired
    private Userservice userservice;

    @Value(value = "${userimage_path}")
    private String filepath;

    //@RequestParam("username") String userID, @RequestParam("password")String password
    @GetMapping("/login")
    public boolean find(HttpServletRequest request){
        String userID=request.getParameter("username");
        String password=request.getParameter("password");
        boolean islogin =userservice.FindID(userID,password);

       return islogin;
    }

    @GetMapping("/register")
    public  boolean register(HttpServletRequest request){
        String userID=request.getParameter("username");
        String password=request.getParameter("password");

        System.out.println(userID+password);
        boolean islogin =userservice.updateUser(userID,password);
        return islogin;
    }

    @GetMapping("/usercenter")
    public  User getUserInformation(HttpServletRequest request){

            String userID=request.getParameter("username");
            User user;
            user=userservice.getInformation(userID);
            return user;
    }


    @PostMapping("/saveimg")
    public boolean SaveUserImg(@RequestParam(value = "file") MultipartFile file,HttpServletRequest request){

        String userID=request.getParameter("loginname");
        String filename = file.getOriginalFilename();
        File file1=new File(filepath+filename);

        if(!file1.exists()){

            file1.getParentFile().mkdirs();
        }
        try {
            System.out.println(userID);
            file.transferTo(file1);
            System.out.println("上传成功");
            boolean isStore =userservice.SaveheadImg(userID,filename);
            System.out.println(isStore);
            return true;
        }
        catch (Exception E){
            System.out.println("上传失败");
            return false;
        }


    }

    @GetMapping("/updateuserinfo")
    public  boolean updateUserinformation(HttpServletRequest request){
        String  UserID =request.getParameter("loginname");
        String  nickName =request.getParameter("nickName");
        String  phoneNumber=request.getParameter("phoneNumber");
        return  userservice.UpdateInfo(UserID,nickName,phoneNumber);

            }



    @GetMapping("/hello/{id}")
    public  String hello(@PathVariable(name = "id") String A){

        return A;
    }
}
