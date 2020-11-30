package com.dongyinuo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dongyinuo
 * @date 2020-08-18
 */
@SpringBootApplication
// @SpringBootConfiguration -> @Configuration -> ConfigurationClassPostProcessor
// @EnableAutoConfiguration -> AutoConfigurationImportSelector
// @ComponentScan -> ConfigurationClassParser
public class ApplicationDemo01 {

    public static void main(String[] args) {

        // new SpringApplication 时, 设置 initializers & listeners 底层 spi(spring.factories) 机制
        // prepareEnvironment(listeners, applicationArguments), 创建 & 配置 Environment
        // createApplicationContext 时, 注册相关的注册器(AnnotationConfigUtils.registerAnnotationConfigProcessors(BeanDefinitionRegistry))
        // refreshContext(context), 完成 bean 的装配
        SpringApplication.run(ApplicationDemo01.class, args);
    }
}
