package org.example.coffee.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.coffee.domain.dto.TestEmpDTO;

import java.util.ArrayList;

@Mapper
public interface TestEmpMapper {
    ArrayList<TestEmpDTO.TestEmpResponseDTO> empAll();
}
