package com.yamaha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class YamahaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YamahaApplication.class, args);
//        List<String> list = new ArrayList<>();
//        list.add("Jane");
//        list.add("Heidi");
//        list.add("Hannah");
//        Iterator<String> iterator = list.iterator();
//        System.out.println(iterator);
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println(next);
//        }
//        System.out.println("hello world");


    }
    @Bean
    public WebMvcConfigurer configurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:8080", "http://localhost:8081", "http://192.168.1.14:8080","http://52.78.111.240", "http://52.78.111.240:3000",
                                "http://3.35.53.231","http://3.35.53.231:3000", "http://192.168.1.43:8080", "http://127.0.0.1:5173/")
                        .allowCredentials(true)
                        .allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH", "OPTIONS");
            }
        };
    }
}
