package org.example.coffee.domain.dto;

import lombok.*;
import org.apache.ibatis.type.Alias;

import java.util.ArrayList;

@Getter
@Builder
@AllArgsConstructor
public class TestEmpDTO {

    public static class TestEmpListResponseDTO {
        ArrayList<TestEmpDTO.TestEmpResponseDTO> testEmpResponseDtoList;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TestEmpResponseDTO{
        String empno;
        String ename;
        String job;
        String mgr;
        String hiredate;
        String sal;
        String comm;
        String deptno;
    }
}
