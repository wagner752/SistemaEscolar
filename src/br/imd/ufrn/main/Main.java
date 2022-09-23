package br.imd.ufrn.main;

import br.imd.ufrn.dominio.Prova;
import br.imd.ufrn.dominio.Turma;

public class Main {
    public static void main(String[] args) {
        //Criação do objeto turma
        Turma primeiraTurma = new Turma();

        //Impressão dos dados solicitados
        System.out.println("Primeira turma \n" +
                            "Aluno01 \n" +
                            "Média: " + primeiraTurma.getAluno1().calcularMedia());

        System.out.println("Aluno02: \n" +
                            "Média: " + primeiraTurma.getAluno2().calcularMedia());
        System.out.println("Aluno03: \n" +
                            "Média: " + primeiraTurma.getAluno3().calcularMedia());
        System.out.println("Média da turma: " + primeiraTurma.calcularMedia());

    }
}