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

    @Test
    void deveCalcularSalarioParaQAComSalarioAbaixoDoLimite() throws Exception {
        String nome = "QA";
        String sobrenome = "TesteAbaixo";

        Funcionario qa = new Qa(nome, sobrenome, Cargo.QA, 2499.0);

        Assertions.assertEquals(2124,15, qa.getSalarioLiquido());
    }

    @Test
    void deveCalcularSalarioParaQAComSalarioAcimaDoLimite() throws Exception {
        String nome = "QA";
        String sobrenome = "TesteAcima";

        Funcionario qa = new Qa(nome, sobrenome, Cargo.QA, 3001.0);

        Assertions.assertEquals(2250,75, qa.getSalarioLiquido());
    }

    @Test
    void deveCalcularSalarioParaCoordenadoresComSalarioAbaixoDoLimite() throws Exception {
        String nome = "Coordenador";
        String sobrenome = "TesteAbaixo";

        Funcionario coordenador = new Coordenador(nome, sobrenome, Cargo.COORDENADOR, 2499.0);

        Assertions.assertEquals(2499.0 * 0.75,75, coordenador.getSalarioLiquido());
    }

    @Test
    void deveCalcularSalarioParaCoordenadoresComSalarioAcimaDoLimite() throws Exception {
        String nome = "Coordenador";
        String sobrenome = "TesteAcima";

        Funcionario coordenador = new Coordenador(nome, sobrenome, Cargo.COORDENADOR, 4501);

        Assertions.assertEquals(4501 * 0.70,75, coordenador.getSalarioLiquido());
    }
}
