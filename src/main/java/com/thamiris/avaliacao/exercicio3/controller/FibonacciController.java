package com.thamiris.avaliacao.exercicio3.controller;

import com.thamiris.avaliacao.exercicio3.dataTransferObject.FibonacciRequest;
import com.thamiris.avaliacao.exercicio3.dataTransferObject.FibonacciResponse;
import com.thamiris.avaliacao.exercicio3.service.FibonacciService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

    private final FibonacciService service;

    public FibonacciController(FibonacciService service) {
        this.service = service;
    }

    @PostMapping("/fibonacci")
    public FibonacciResponse getFibonacci(@Valid @RequestBody FibonacciRequest request) {
        return service.generateFibonacci(request.getN());
    }
}
