package com.amadeus.controller;

import com.amadeus.model.User;
import com.amadeus.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/test1")
    public String test() {
        log.info("111111");
        return "hello";
    }

    @GetMapping(value = "/test2")
    public String test2() {
        log.info("222222");
        return "word";
    }

    @GetMapping(value = "get/{id}")
    public String get(@PathVariable("id") Long id) {
        return userRepository.findById(id).orElse(new User()).toString();
    }
}
