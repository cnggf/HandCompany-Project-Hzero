package org.hzro.boot.oauth;

import org.hzero.autoconfigure.oauth.EnableHZeroOauth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author GGF
 * @version 1.0
 * @date 2020/6/16 15:37
 */
@EnableHZeroOauth
@EnableDiscoveryClient
@SpringBootApplication
public class HzroBootOauthApplication {
    public static void main(String[] args) {
        SpringApplication.run(HzroBootOauthApplication.class, args);
    }
}
