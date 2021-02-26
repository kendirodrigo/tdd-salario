package com.example.tddsalario;

import java.util.Objects;

public abstract class Funcionario {

    private final String nome;
    private final String sobrenome;
    private final Cargo cargo;
    private final double salarionBruto;

    public Funcionario(final String nome, final String sobrenome, final Cargo cargo, final double salarioBruto) {

        Objects.requireNonNull(cargo, "Cargo nulo");
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
        this.salarionBruto = salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double getSalarionBruto() {
        return salarionBruto;
    }

    public abstract double getSalarioLiquido();

}
