package org.example.coffee.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestDTO {

    public static class TestListResponseDTO {
            ArrayList<TestResponseDTO> testResponseDtoList;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TestResponseDTO{
        String testString;
    }

}