package org.example.coffee.global.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    // url : http://localhost:8080/swagger-ui/index.html#/

    private Info info() {
        return new Info()
                .title("Programmers DevCourse Team5 API Document")
                .description("데브코스 백엔드 Team5 1차 프로젝트 API 문서입니다.")
                .version("v0.0.1");
    }


    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(info());
    }
}
