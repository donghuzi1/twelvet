package com.twelvet.framework.security.annotation;

import com.twelvet.framework.security.config.TWTResourceServerAutoConfiguration;
import com.twelvet.framework.security.config.TWTResourceServerConfiguration;
import com.twelvet.framework.security.feign.FeignConfig;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import java.lang.annotation.*;

/**
 * @author twelvet
 * @WebSite www.twelvet.cn
 * @Description: 资源服务注解
 */
@Documented
@Inherited
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Import({ TWTResourceServerAutoConfiguration.class, TWTResourceServerConfiguration.class, FeignConfig.class })
public @interface EnableTWTResourceServer {

}