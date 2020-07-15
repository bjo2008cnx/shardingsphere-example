package org.cheng.shardingsphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SinggleExampleMain {

    public static void main(final String[] args) {
        SpringApplication.run(SinggleExampleMain.class, args);
    }
}