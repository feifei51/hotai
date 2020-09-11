package com.nf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * Created by 54110 on 2020/9/1.
 */
@SpringBootApplication
//标注当前工程为eureka的客户端
@EnableDiscoveryClient
//标注当前工程为config的服务端
@EnableConfigServer
public class NfConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NfConfigApplication.class);
    }
}
