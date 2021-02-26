package com.example.tddsalario;

public class CalculadoraSalario {

    public Double calcularSalarioLiquido(Cargo desenvolvedor, double salario) throws Exception {
        double porcentagemDesconto;
        if (desenvolvedor == Cargo.DESENVOLVEDOR) {
            if (salario > 3000) {
                porcentagemDesconto = 0.80;

                return salario * porcentagemDesconto;
            }
            porcentagemDesconto = 0.90;

            return salario * porcentagemDesconto;

        } else if (desenvolvedor == Cargo.DBA || desenvolvedor == Cargo.QA) {

        } else if (desenvolvedor == Cargo.COORDENADOR || desenvolvedor == Cargo.GERENTE) {

        } else {
            throw new Exception("Cargo inv�lido.");
        }

        return null;
    }

}
