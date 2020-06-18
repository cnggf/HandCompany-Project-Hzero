package org.hzro.boot.gateway;

import org.hzero.autoconfigure.gateway.EnableHZeroGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author GGF
 * @version 1.0
 * @date 2020/6/16 15:30
 */
@EnableHZeroGateway
@EnableDiscoveryClient
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class HzroBootGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzroBootGatewayApplication.class,args);
    }
}
