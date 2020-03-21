package com.uatx.inventarios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventariosApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(InventariosApplication.class);

    public static void main(String[] args) {
        Integer x = 10;
        Integer y = 20;
        LOGGER.debug("Hola desde el logger {} {}", x, y);
        SpringApplication.run(InventariosApplication.class, args);
    }

}
