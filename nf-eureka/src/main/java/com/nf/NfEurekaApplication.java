package com.nf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 54110 on 2020/9/1.
 */
@SpringBootApplication
//标注工程为eureka的服务端
@EnableEurekaServer
public class NfEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NfEurekaApplication.class);
    }
}
