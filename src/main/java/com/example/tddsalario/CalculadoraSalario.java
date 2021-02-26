package com.example.tddsalario;

public class CalculadoraSalario {

    public Double calcularSalarioLiquido(Funcionario funcionario) throws Exception {
        double porcentagemDesconto;
        if (funcionario.getCargo() == Cargo.DESENVOLVEDOR) {
            Funcionario func = new Desenvolvedor(funcionario.getNome(), funcionario.getSobrenome(), funcionario.getCargo(), funcionario.getSalarionBruto());

//            if (funcionario.getSalarionBruto() > 3000) {
//                porcentagemDesconto = 0.80;
//
//                return funcionario.getSalarionBruto() * porcentagemDesconto;
//            }
//            porcentagemDesconto = 0.90;
//
//            return funcionario.getSalarionBruto() * porcentagemDesconto;

        } else if (funcionario.getCargo() == Cargo.DBA || funcionario.getCargo() == Cargo.QA) {

        } else if (funcionario.getCargo() == Cargo.COORDENADOR || funcionario.getCargo() == Cargo.GERENTE) {

        } else {
            throw new Exception("Cargo inv�lido.");
        }

        return null;
    }

}
