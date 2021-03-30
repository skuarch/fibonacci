package app.structure.main;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    public int calculateFibonacci(int num) {
        return fib(num);
    }

    private int fib(int num) {
        if (num <= 1) {
            return num;
        }
        return fib(num-1) + fib(num-2);
    }

}
