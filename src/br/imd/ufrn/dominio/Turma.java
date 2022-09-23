package br.imd.ufrn.dominio;

public class Turma {
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;

    //Construtor da turma com seus alunos e suas notas pre-definas
    public Turma() {
        this.aluno1 = new Aluno();
        aluno1.setNotaParte1(6.5);
        aluno1.setNotaParte2(8.0);

        this.aluno2 = new Aluno();
        aluno2.setNotaParte1(9.5);
        aluno2.setNotaParte2(3.0);

        this.aluno3 = new Aluno();
        aluno3.setNotaParte1(7.5);
        aluno3.setNotaParte2(9.0);
    }

    //Getters And Setters
    public Aluno getAluno1() {
        return aluno1;
    }
    public Aluno getAluno2() {
        return aluno2;
    }
    public Aluno getAluno3() {
        return aluno3;
    }
    public void setAluno1(Aluno aluno1) {
        this.aluno1 = aluno1;
    }
    public void setAluno2(Aluno aluno2) {
        this.aluno2 = aluno2;
    }
    public void setAluno3(Aluno aluno3) {
        this.aluno3 = aluno3;
    }

    //Métodos
    public double calcularMedia(){
        double resultado = aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia();
        resultado = resultado / 3;
        return resultado;
    }
}
