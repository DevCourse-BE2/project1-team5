package org.example.coffee.global.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        // API 기본 정보 설정
        Info info = new Info()
                .title("Team5 API Document")
                .version("1.0")
                .description(
                        "Programmers BackEnd DevCourse 2기 3회차 1차 프로젝트 Team 5의 API 문서입니다.\n");

        // JWT 인증 방식 설정
//        String jwtScheme = "jwtAuth";
//        SecurityRequirement securityRequirement = new SecurityRequirement().addList(jwtScheme);
//        Components components = new Components()
//                .addSecuritySchemes(jwtScheme, new SecurityScheme()
//                        .name("Authorization")
//                        .type(SecurityScheme.Type.HTTP)
//                        .in(SecurityScheme.In.HEADER)
//                        .scheme("Bearer")
//                        .bearerFormat("JWT"));

        // Swagger UI 설정 및 보안 추가
        return new OpenAPI()
                .addServersItem(new Server().url("http://localhost:8080"))  // 추가적인 서버 URL 설정 가능
                .info(info);
    }
}