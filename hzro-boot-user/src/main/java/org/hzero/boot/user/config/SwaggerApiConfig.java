package org.hzero.boot.user.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Tag;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author GGF
 * @version 1.0
 * @date 2020/6/17 17:07
 */
@Configuration
public class SwaggerApiConfig {

    public static final String USER = "User";
    public static final String TASK = "Task";

    @Autowired
    public SwaggerApiConfig(Docket docket) {
        docket.tags(
                new Tag(USER, "用户信息")
        );
    }
}
