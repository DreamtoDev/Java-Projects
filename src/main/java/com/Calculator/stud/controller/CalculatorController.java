package com.Calculator.stud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Calculator.stud.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/sub")
    public int sub(@RequestParam int a, @RequestParam int b) {
        return calculatorService.sub(a, b);
    }

    @GetMapping("/mul")
    public int mul(@RequestParam int a, @RequestParam int b) {
        return calculatorService.mul(a, b);
    }

    @GetMapping("/div")
    public int div(@RequestParam int a, @RequestParam int b) {
        return calculatorService.div(a, b);
    }

    @GetMapping("/mod")
    public int mod(@RequestParam int a, @RequestParam int b) {
        return calculatorService.mod(a, b);
    }
}
