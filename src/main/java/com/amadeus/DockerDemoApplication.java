package com.amadeus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class DockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }

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

}
