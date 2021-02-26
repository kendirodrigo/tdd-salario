package com.example.tddsalario;

import java.math.BigDecimal;

public class CalculadoraSalario {

    public BigDecimal calcularSalarioLiquido(Cargo desenvolvedor, double salario) throws Exception {
        BigDecimal porcentagemDesconto;
        if (desenvolvedor == Cargo.DESENVOLVEDOR) {
            if (salario > 3000) {
                porcentagemDesconto = new BigDecimal(0.20);
                BigDecimal valorSalario = BigDecimal.valueOf(salario);

                BigDecimal valorDesconto = valorSalario.multiply(porcentagemDesconto);
                return valorDesconto.subtract(valorDesconto);
            }
            porcentagemDesconto = new BigDecimal(0.10);
            BigDecimal valorSalario = BigDecimal.valueOf(salario);

            BigDecimal valorDesconto = valorSalario.multiply(porcentagemDesconto);

            return valorDesconto.subtract(valorDesconto);
        } else if (desenvolvedor == Cargo.DBA || desenvolvedor == Cargo.QA) {

        } else if (desenvolvedor == Cargo.COORDENADOR || desenvolvedor == Cargo.GERENTE) {

        } else {
            throw new Exception("Cargo inv�lido.");
        }

        return null;
    }

}
