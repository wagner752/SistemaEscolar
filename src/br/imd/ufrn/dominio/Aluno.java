package br.imd.ufrn.dominio;

public class Aluno extends Prova {
    private Prova prova1;
    private Prova prova2;

    //Getters and Setters
    public Prova getProva1(){
        return prova1;
    }
    public void setProva1(Prova Prova1){
        this.prova1 = Prova1;
    }
    public Prova getProva2(){
        return prova2;
    }
    public void setProva2(Prova Prova2){
        this.prova2 = Prova2;
    }

    //Métodos
    public double calcularMedia(){
        double resultado;
        resultado = (notaParte1 + notaParte2)/2;

        return resultado;
    }
}
