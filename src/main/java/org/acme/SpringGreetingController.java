package org.acme;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-spring")
public class SpringGreetingController {

    @GetMapping
    public String hello(@RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println(key + "->" + value);
        });
        return "Hello Spring";
    }
}
