package com.martial.user_webflux.controllers;

import com.martial.user_webflux.entities.User;
import com.martial.user_webflux.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public Flux<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/live", produces = "text/event-stream")
    public Flux<User> getLiveAllUsers() {
        return userRepository.findAll();
    }
}
