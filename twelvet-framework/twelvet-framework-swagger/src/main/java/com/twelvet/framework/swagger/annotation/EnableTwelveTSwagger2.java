package com.twelvet.framework.swagger.annotation;

import com.twelvet.framework.swagger.config.SwaggerAutoConfiguration;
import com.twelvet.framework.swagger.config.SwaggerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author twelvet
 * @WebSite www.twelvet.cn
 * @Description: 开启 swagger
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@EnableConfigurationProperties(SwaggerProperties.class)
@Import({ SwaggerAutoConfiguration.class })
public @interface EnableTwelveTSwagger2 {

}
