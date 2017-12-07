package org.dracula.ht2017g8.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class MainApp {

    public static void main(String[] args){
        SpringApplication.run(MainApp.class, args);
    }

}
