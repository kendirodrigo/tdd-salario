package com.example.tddsalario;

public class Coordenador extends Funcionario {

    public Coordenador(String nome, String sobrenome, Cargo cargo, double salarioBruto) {
        super(nome, sobrenome, cargo, salarioBruto);
    }

    @Override
    public double getSalarioLiquido() {
        double porcentagemSalarioComDesconto = 0.70;
        if (this.getSalarionBruto() > 4500) {
            return this.getSalarionBruto() * porcentagemSalarioComDesconto;
        }
        porcentagemSalarioComDesconto = 0.75;
        return this.getSalarionBruto() * porcentagemSalarioComDesconto;
    }

}
