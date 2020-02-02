package com.mulrica.jib.controller;

import com.mulrica.jib.dto.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/greeting")
public class GreetingRestController {

    private static final String template = "Welcome Docker, %s!";
    private final AtomicInteger counter = new AtomicInteger();

    @GetMapping
    public Greeting welcome(@RequestParam(value = "name",
                                          defaultValue = "Anonymus guess") String name) {
        return Greeting.builder()
                        .id(counter.incrementAndGet())
                        .value(String.format(template,name))
                        .build();
    }

}
