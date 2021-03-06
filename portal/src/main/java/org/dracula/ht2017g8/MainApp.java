package org.dracula.ht2017g8;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dk
 */
@SpringBootApplication
@EnableAdminServer
public class MainApp {

    public static void main(String[] args){
        SpringApplication.run(MainApp.class, args);
    }

}
