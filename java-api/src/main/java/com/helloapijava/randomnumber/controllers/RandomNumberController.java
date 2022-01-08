package com.helloapijava.randomnumber.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RandomNumberController {

  @GetMapping("/random-number")
  public double randomNumber() {
    return Math.random();
  }
}
