package com.gem.it.assembly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class AppStarter {

    public static void main(String[] args) {
        final Class[] configs = {AppStarter.class};
        SpringApplication.run(configs, args);
    }

}
