package com.example.tddsalario;

import java.math.BigDecimal;

public class Funcionario {

    private final String nome;
    private final String sobrenome;
    private final Cargo cargo;
    private final BigDecimal salarionBruto;

    public Funcionario(final String nome, final String sobrenome, final Cargo cargo, final BigDecimal salarioBruto) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
        this.salarionBruto = salarioBruto;

    }
}
