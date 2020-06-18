package org.hzro.boot.swagger;

import org.hzero.autoconfigure.swagger.EnableHZeroSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author GGF
 * @version 1.0
 * @date 2020/6/16 15:45
 */
@EnableHZeroSwagger
@EnableDiscoveryClient
@SpringBootApplication
public class HzroBootSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzroBootSwaggerApplication.class, args);
    }
}
