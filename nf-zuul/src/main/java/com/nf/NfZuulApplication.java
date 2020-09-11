package com.nf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * Created by 54110 on 2020/9/1.
 */
@SpringBootApplication
@EnableDiscoveryClient
//标注当前工程试网关代理
@EnableZuulProxy
public class NfZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(NfZuulApplication.class);
    }
}
