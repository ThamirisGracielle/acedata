package com.thamiris.avaliacao.exercicio2.controller;

import com.thamiris.avaliacao.exercicio2.dataTransferObject.SequenceRequest;
import com.thamiris.avaliacao.exercicio2.dataTransferObject.SequenceResponse;
import com.thamiris.avaliacao.exercicio2.service.SequenceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sequence")
public class SequenceController {

    private final SequenceService sequenceService;

    public SequenceController(SequenceService sequenceService) {

        this.sequenceService = sequenceService;
    }

    @PostMapping("/sequence")
    public SequenceResponse submitSequence(@Valid @RequestBody SequenceRequest request) {
        return sequenceService.processSequence(request.getQuantity(), request.getNumbers());
    }
}
