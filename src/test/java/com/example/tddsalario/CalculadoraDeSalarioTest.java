package com.example.tddsalario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculadoraDeSalarioTest {


    @Test
    public void deveCalcularSalarioParaDesenvolvedorComSalarioAbaixoDoLimite(){
        String nome = "";
        String sobrenome = "";
        Funcionario desenvolvedor = new Funcionario(nome, sobrenome, Cargo.DESENVOLVEDOR, new BigDecimal(1500.0));
        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
        BigDecimal salarioLiquido = calculadoraSalario.calcularSalarioLiquido(Cargo.DESENVOLVEDOR, 1500.0);

        Assertions.assertEquals(1350, salarioLiquido);
    }
}
