package com.example.sai.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    ///////////////////////////////////////////////////////////////////////////
    // In Spring's approach to building RESTful web services, HTTP requests are
    // handled by a controller. These components are identified by
    // the @RestController annotation, and the GreetingController.
    ///////////////////////////////////////////////////////////////////////////
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    ///////////////////////////////////////////////////////////////////////////
    // Handling GET requests from /greeting by returning a new instance of
    // the Greeting class
    ///////////////////////////////////////////////////////////////////////////
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    // @GetMapping annotation ensures that HTTP GET request to /greeting are mapped to the greeting().
}
