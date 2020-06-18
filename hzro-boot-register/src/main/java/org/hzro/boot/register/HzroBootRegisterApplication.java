package org.hzro.boot.register;

import org.hzero.autoconfigure.register.EnableHZeroRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author GGF
 * @version 1.0
 * @date 2020/6/16 15:01
 */

@EnableHZeroRegister
@EnableEurekaServer
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class HzroBootRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzroBootRegisterApplication.class,args);
    }
}
