package org.hzro.boot.iam;

import org.hzero.autoconfigure.iam.EnableHZeroIam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author GGF
 * @version 1.0
 * @date 2020/6/16 15:42
 */
@EnableHZeroIam
@EnableDiscoveryClient
@SpringBootApplication
public class HzroBootIamApplication {
    public static void main(String[] args) {
        SpringApplication.run(HzroBootIamApplication.class, args);
    }
}
