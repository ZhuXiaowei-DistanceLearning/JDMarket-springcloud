package com.zxw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import javax.swing.*;

/**
 * @author keriezhang
 * @date 2019/08/20
 */
@EnableEurekaServer
@SpringBootApplication
public class JdRegistry {
    public static void main(String[] args) {
        SpringApplication.run(JdRegistry.class);
    }

}
