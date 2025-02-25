package com.example.template.service.controller;

import com.example.template.service.common.response.ResponseResult;
import com.example.template.service.service.TestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * @title: TestController
 * @author: trifolium
 * @date: 2024/2/1
 */
@Tag(name = "test")
@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    @Inject
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @Operation(summary = "测试接口")
    @GetMapping("/hello")
    public ResponseResult<String> sayHello() {

        return ResponseResult.success(testService.sayHello());
    }
}
