package com.example.tddsalario;

import java.math.BigDecimal;

public class CalculadoraSalario {

    public BigDecimal calcularSalarioLiquido(Cargo desenvolvedor, double v) throws Exception {

        if (desenvolvedor == Cargo.DESENVOLVEDOR) {
            
        } else if (desenvolvedor == Cargo.DBA || desenvolvedor == Cargo.QA) {

        } else if (desenvolvedor == Cargo.COORDENADOR || desenvolvedor == Cargo.GERENTE) {

        } else {
            throw new Exception("Cargo inválido.");
        }

    }

}
