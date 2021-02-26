package com.example.tddsalario;

import org.junit.jupiter.api.Test;

public class CalculadoraDeSalarioTest {


    @Test
    public void deveCalcularSalarioParaDesenvolvedorComSalarioAbaixoDoLimite(){
        String nome = "";
        String sobrenome = "";
        Funcionario desenvolvedor = new Funcionario(nome, sobrenome, Cargo.DESENVOLVEDOR, 1500.0);
        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
        BigDecimal salarioLiquido = calculadoraSalario.calcularSalarioLiquido(Cargo.DESENVOLVEDOR, 1500.0);
        Assert.assertEquals(1350, salarioLiquido);

        // teste do cadini
    }
}
