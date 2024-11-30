package org.example.coffee.domain.controller;

import org.example.coffee.domain.dao.TestEmpDAO;
import org.example.coffee.domain.dto.TestDTO;
import org.example.coffee.domain.dto.TestEmpDTO;
import org.example.coffee.global.common.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestEmpController {

    @Autowired
    private TestEmpDAO testEmpDAO;

    @GetMapping("/emp")
    public BaseResponse<ArrayList<TestEmpDTO.TestEmpResponseDTO>> empAll(){
        ArrayList<TestEmpDTO.TestEmpResponseDTO> testEmpListResponseDTO = testEmpDAO.empAll();
        return BaseResponse.onSuccess(testEmpListResponseDTO);
    }


}
