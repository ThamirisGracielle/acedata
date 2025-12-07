package com.thamiris.avaliacao.exercicio1;

public class CalculoSalario {

    public double calcularSalarioBruto( Funcionario funcionario){
        return  funcionario.getValorHora() * funcionario.getHorasTrabalhadas();
    }


}
