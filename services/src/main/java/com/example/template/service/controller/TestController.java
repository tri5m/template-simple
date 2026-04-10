package com.example.template.service.controller;

import com.example.template.common.util.JsonUtil;
import com.example.template.service.common.response.ResponseResult;
import com.example.template.service.service.TestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @title: TestController
 * @author: trifolium
 * @date: 2024/2/1
 */
@Tag(name = "test")
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class TestController {

    private final TestService testService;

    @Operation(summary = "测试接口")
    @GetMapping("/hello")
    public ResponseResult<Map<String,Object>> sayHello(@RequestHeader Map<String, String> headers, HttpServletRequest request) {
        System.out.println("get");
        System.out.println("param:" + JsonUtil.toJson(request.getParameterMap()));
        System.out.println(JsonUtil.toJson(headers));
        return ResponseResult.success(JsonUtil.jsonToObjectMap("{\"token\":\"totototoken\", \"token_type\":\"Bbb\"}"));
    }

    @Operation(summary = "测试接口")
    @PostMapping("/hello")
    public ResponseResult<Map<String,Object>> sayHello(@RequestBody String body, @RequestHeader Map<String, String> headers) {
        System.out.println("post");
        System.out.println("body:  "+ body);
        System.out.println(JsonUtil.toJson(headers));
        return ResponseResult.success(JsonUtil.jsonToObjectMap("{\"token\":\"totototoken\", \"token_type\":\"Bbb\"}"));
    }
}
