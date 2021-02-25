package com.sslazio.players.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/ap1/rest/hello")
public class HelloResource {

    @GetMapping
    public String hello() {
        return "Hello";
    }
}
