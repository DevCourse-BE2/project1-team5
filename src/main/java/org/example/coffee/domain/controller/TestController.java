package org.example.coffee.domain.controller;

import lombok.RequiredArgsConstructor;
import org.example.coffee.domain.dto.TestDTO;
import org.example.coffee.global.common.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequiredArgsConstructor
public class TestController {
    @GetMapping("/test0")
    public String test() {
        return "테스트";
    }

    @GetMapping("/test1")
    public BaseResponse<TestDTO.TestResponseDTO> testAPI1(){
        return BaseResponse.onSuccess(new TestDTO.TestResponseDTO("String 1"));
    }

    @GetMapping("/test2")
    public BaseResponse<ArrayList<TestDTO.TestResponseDTO>> testAPI2(){
        ArrayList<TestDTO.TestResponseDTO> testListResponseDTO = new ArrayList<>();
        testListResponseDTO.add(new TestDTO.TestResponseDTO("String 1"));
        return BaseResponse.onSuccess(testListResponseDTO);
    }

    @GetMapping("/test3")
    public BaseResponse<String> testAPI3(){
        //실패의 경우 controller가 아닌 데이터 처리단에서 에러핸들링과 동시에 처리
        return BaseResponse.onFailure("실패 테스트");
    }

}
