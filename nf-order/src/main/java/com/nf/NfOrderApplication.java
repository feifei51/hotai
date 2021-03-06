package com.nf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by 54110 on 2020/9/1.
 */
@SpringBootApplication
//eureka客户端
@EnableDiscoveryClient
//熔断降级
@EnableHystrix
//feign远程调用
@EnableFeignClients
public class NfOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NfOrderApplication.class);
    }
}
