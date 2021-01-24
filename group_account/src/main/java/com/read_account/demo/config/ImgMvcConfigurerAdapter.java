package com.read_account.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration//访问图片位置配置
public class ImgMvcConfigurerAdapter implements WebMvcConfigurer {

    @Value("${userimage_path}")
    String filepath;


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        String filetrue_path="file:"+filepath;
        registry.addResourceHandler("/image/**").addResourceLocations(filetrue_path);

    }
}
