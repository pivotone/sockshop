package com.example.user.controller;

import com.example.user.entity.Result;
import com.example.user.entity.User;
import com.example.user.util.ResultUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Api(tags = "user account crud")
@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/login")
    public Mono<Result> login(@RequestBody User user) {
        return Mono.just(ResultUtil.success());
    }
}
