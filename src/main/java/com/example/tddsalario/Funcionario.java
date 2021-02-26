package com.example.tddsalario;

public class Funcionario {

    private final String nome;
    private final String sobrenome;
    private final Cargo cargo;
    private final double salarionBruto;

    public Funcionario(final String nome, final String sobrenome, final Cargo cargo, final double salarioBruto) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
        this.salarionBruto = salarioBruto;

    }
}
