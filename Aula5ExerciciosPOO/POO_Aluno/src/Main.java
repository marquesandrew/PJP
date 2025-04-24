import modelo.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("aluno","65432",7,8.5);
        aluno.calculaMedia();
        aluno.verificarSituacao();
    }
}