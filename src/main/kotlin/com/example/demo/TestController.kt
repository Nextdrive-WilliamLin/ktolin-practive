package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
    @RequestMapping("/test")
    class TestController{
        @RequestMapping("getResult")
        fun home(): String {
            return "Hello World"
        }
    }