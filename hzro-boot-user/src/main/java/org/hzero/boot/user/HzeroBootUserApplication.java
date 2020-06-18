package org.hzero.boot.user;

import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author GGF
 * @version 1.0
 * @date 2020/6/17 9:32
 */

@EnableDiscoveryClient
@SpringBootApplication
@EnableChoerodonResourceServer
public class HzeroBootUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroBootUserApplication.class, args);
    }
}
