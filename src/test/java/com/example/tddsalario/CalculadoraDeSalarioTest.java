package com.example.tddsalario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraDeSalarioTest {

    @Test
    void deveCalcularSalarioParaDesenvolvedorComSalarioAbaixoDoLimite() throws Exception {
        String nome = "Funcionario";
        String sobrenome = "TesteAbaixo";

        Funcionario desenvolvedor = new Desenvolvedor(nome, sobrenome, Cargo.DESENVOLVEDOR, 1500.0);

        Assertions.assertEquals(1350, desenvolvedor.getSalarioLiquido());
    }

    @Test
    void deveCalcularSalarioParaDesenvolvedorComSalarioAcimaDoLimite() throws Exception {
        String nome = "Funcionario";
        String sobrenome = "TesteAcima";

        Funcionario desenvolvedor = new Desenvolvedor(nome, sobrenome, Cargo.DESENVOLVEDOR, 3001.0);

        Assertions.assertEquals(2400.8, desenvolvedor.getSalarioLiquido());
    }

    @Test
    void deveCalcularSalarioParaDBAComSalarioAbaixoDoLimite() throws Exception {
        String nome = "DBA";
        String sobrenome = "TesteAbaixo";

        Funcionario dba = new Dba(nome, sobrenome, Cargo.DBA, 2499.0);

        Assertions.assertEquals(2124,15, dba.getSalarioLiquido());
    }

    @Test
    void deveCalcularSalarioParaDBAComSalarioAcimaDoLimite() throws Exception {
        String nome = "DBA";
        String sobrenome = "TesteAcima";

        Funcionario dba = new Dba(nome, sobrenome, Cargo.DBA, 3001.0);

        Assertions.assertEquals(2250,75, dba.getSalarioLiquido());
    }
}
