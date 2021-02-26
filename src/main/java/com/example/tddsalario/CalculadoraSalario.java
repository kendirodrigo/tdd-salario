package com.example.tddsalario;

import java.math.BigDecimal;

public class CalculadoraSalario {

    public BigDecimal calcularSalarioLiquido(Cargo desenvolvedor, double v) throws Exception {
        BigDecimal porcentagemDesconto = new BigDecimal(0);
        if (desenvolvedor == Cargo.DESENVOLVEDOR) {
            if(v>3000){
                porcentagemDesconto = new BigDecimal(0.20);
            }
            porcentagemDesconto = new BigDecimal(0.10);
            return v>3000?
        } else if (desenvolvedor == Cargo.DBA || desenvolvedor == Cargo.QA) {

        } else if (desenvolvedor == Cargo.COORDENADOR || desenvolvedor == Cargo.GERENTE) {

        } else {
            throw new Exception("Cargo inv�lido.");
        }

    }

}
