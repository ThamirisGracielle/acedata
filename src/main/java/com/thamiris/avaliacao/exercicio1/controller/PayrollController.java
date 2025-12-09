package com.thamiris.avaliacao.exercicio1.controller;

import com.thamiris.avaliacao.exercicio1.dataTransferObject.EmployeeRequest;
import com.thamiris.avaliacao.exercicio1.dataTransferObject.PayrollResponse;
import com.thamiris.avaliacao.exercicio1.service.PayrollService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payroll")
public class PayrollController {

    private final PayrollService payrollService;

    public PayrollController(PayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @PostMapping
    public PayrollResponse calculate(@RequestBody EmployeeRequest request) {
        return payrollService.calculatePayroll(request);
    }
}
