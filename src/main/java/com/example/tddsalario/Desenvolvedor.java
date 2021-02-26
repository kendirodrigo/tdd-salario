package com.example.tddsalario;

public class Desenvolvedor extends Funcionario {

    double taxa = 0.2;

    public Desenvolvedor(String nome, String sobrenome, Cargo cargo, double salarioBruto) {
        super(nome, sobrenome, cargo, salarioBruto);
    }

    @Override
    public double getSalarioLiquido() {
        return 0;
    }


    public double getSalarioLiquido(double salarioBruto) {
        if(salarioBruto >= 3000) {

        }
        return salarioBruto * taxa;
    }

}
