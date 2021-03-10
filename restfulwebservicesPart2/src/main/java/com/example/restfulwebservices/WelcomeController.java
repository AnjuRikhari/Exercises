package com.example.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class WelcomeController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to Spring Boot";
    }

    @GetMapping("/goodmorning")
    public String goodmorningInternationalized() {
        return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
    }

    @GetMapping("/greetings")
    public String greetingsInternationalized(@RequestParam String username) {
        return messageSource.getMessage("hello.message", null, LocaleContextHolder.getLocale()) + " " + username;
    }
}
