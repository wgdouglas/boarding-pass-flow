package com.delta.boardingpass.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("check-in")
public class BoardingPassController {

    @GetMapping("/boarding-pass")
    public String getBoardingPass(){
        return "Success!";
    }
}
