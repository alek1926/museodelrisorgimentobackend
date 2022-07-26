package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class NewsletterController {

    @Autowired
    NewsletterRepository nr;

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        return nr.save(user);
    }

    @GetMapping("/iscritti")
    public List<User> getAll() {
        return nr.findAll();
    }
}
