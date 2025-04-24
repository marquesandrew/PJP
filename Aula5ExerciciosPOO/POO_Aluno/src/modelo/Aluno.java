package modelo;

public class Aluno {
    private String aluno;
    private String matricula;
    private double nota1;
    private double nota2;

    public Aluno(String aluno, String matricula, double nota1, double nota2) {
        this.aluno = aluno;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void calculaMedia(){
        System.out.println((getNota1() + getNota2())/2);
    }

    public void verificarSituacao(){
        if(((getNota1() + getNota2())/2) >= 6 ) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}