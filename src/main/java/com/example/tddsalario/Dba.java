package com.example.tddsalario;

public class Dba extends Funcionario{

    public Dba(String nome, String sobrenome, Cargo cargo, double salarioBruto) {
        super(nome, sobrenome, cargo, salarioBruto);
    }

    @Override
    public double getSalarioLiquido() {
        double porcentagemSalarioComDesconto = 0.75;
        if (this.getSalarionBruto() > 2500) {

            return this.getSalarionBruto() * porcentagemSalarioComDesconto;
        }
        porcentagemSalarioComDesconto = 0.85;
        return this.getSalarionBruto() * porcentagemSalarioComDesconto;
    }
}
