package modelo;

public class Pessoa {
    private String nome;
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void atualizarDataNascimento(int diaNascimento,int mesNascimento,int anoNascimento) {
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual){
        if (mesAtual<mesNascimento){
            idade = anoAtual - anoNascimento - 1;
        } else if (mesAtual==mesNascimento){
            if(diaAtual>=diaNascimento){
                idade = anoAtual-anoNascimento;
            }else {
                idade = anoAtual - anoNascimento - 1;
            }
        }else {
            idade = anoAtual - anoNascimento - 1;
        }
    }
}