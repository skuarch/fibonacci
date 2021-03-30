package app.structure.main.controllers;

import app.structure.main.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/fibonacci")
public class Fibonacci {

    @Autowired
    private FibonacciService fibonacciService;

    @GetMapping("/{number}")
    public int fibonacci(@PathVariable("number") int number) {
        return fibonacciService.calculateFibonacci(number);
    }

}
