package com.nju.rjxy.refactorbackend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // allowedOrigins: 允许对服务器进行跨域请求的域名,可填写多个string数组
        // allowedMethods：允许跨域请求的方式，所有即*
        // maxAge：当前检验的有效时间，单位为秒
        // allowedHeaders：允许发送的内容类型，如"Origin, X-Requested-With, Content-Type, Accept"
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .allowedHeaders("*")
                .maxAge(3600);
    }
}
