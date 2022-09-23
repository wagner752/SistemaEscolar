package br.imd.ufrn.dominio;

public class Prova extends Turma {
    protected double notaParte1;
    protected double notaParte2;


    //Getters and Setters
    public double getNotaParte1() {
        return notaParte1;
    }
    public void setNotaParte1(double NotaParte1){
        this.notaParte1 = NotaParte1;
    }
    public double getNotaParte2() {
        return notaParte2;
    }
    public void setNotaParte2(double NotaParte2){
        this.notaParte2 = NotaParte2;
    }

    //Métodos
    public double calcularNotaTotal(Aluno aluno){
        double resultado;

        resultado = aluno.getNotaParte1() + aluno.getNotaParte2();
        if(resultado > 10){
            return resultado = 10;
        }
        else{
            return resultado;
        }
    }
}
