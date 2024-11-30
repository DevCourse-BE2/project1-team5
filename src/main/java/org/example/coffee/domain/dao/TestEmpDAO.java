package org.example.coffee.domain.dao;

import org.example.coffee.domain.dto.TestEmpDTO;
import org.example.coffee.domain.mapper.TestEmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TestEmpDAO {

    @Autowired
    private TestEmpMapper testEmpMapper;


    public ArrayList<TestEmpDTO.TestEmpResponseDTO> empAll() {
        return testEmpMapper.empAll();
    }
}
