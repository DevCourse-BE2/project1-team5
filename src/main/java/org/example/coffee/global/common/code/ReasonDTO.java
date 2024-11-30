package org.example.coffee.global.common.code;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Builder
@Getter
public class ReasonDTO {
    private String code;
    private String message;
    private HttpStatus httpStatus;
    private Boolean isSuccess;
}