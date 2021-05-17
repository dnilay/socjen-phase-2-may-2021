package com.example.demo.controller;

import com.example.demo.model.CustomMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/{userName}")
    public ResponseEntity<?> getResponseFromObject(@PathVariable("userName") String userName)
    {
        return ResponseEntity.ok(CustomMessage.builder().message("hello from"+userName).build());
    }
}
