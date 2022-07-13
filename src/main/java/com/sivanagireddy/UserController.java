package com.sivanagireddy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Map.of("msg", "pong");
    }
}
