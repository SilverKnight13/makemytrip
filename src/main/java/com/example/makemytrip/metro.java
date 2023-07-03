package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class metro {
    @GetMapping("/mymetro")
    public String getData() { return "Please book your metro tickets from makemytrip";}
}
