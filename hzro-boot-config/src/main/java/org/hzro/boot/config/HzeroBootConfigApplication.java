package org.hzro.boot.config;

import org.hzero.autoconfigure.config.EnableHZeroConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.config.ConfigServerAutoConfiguration;

/**
 * @author GGF
 * @version 1.0
 * @date 2020/6/16 15:21
 */
@EnableHZeroConfig
@EnableDiscoveryClient
@SpringBootApplication(exclude = ConfigServerAutoConfiguration.class)
public class HzeroBootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroBootConfigApplication.class, args);
    }
}
