package com.example.tddsalario;

public class Desenvolvedor extends Funcionario {



    public Desenvolvedor(String nome, String sobrenome, Cargo cargo, double salarioBruto) {
        super(nome, sobrenome, cargo, salarioBruto);
    }

    @Override
    public double getSalarioLiquido() {
            double porcentagemSalarioComDesconto = 0.80;
            if (this.getSalarionBruto() > 3000) {

                return this.getSalarionBruto() * porcentagemSalarioComDesconto;
            }
            porcentagemSalarioComDesconto = 0.90;
            return this.getSalarionBruto() * porcentagemSalarioComDesconto;
    }

}
