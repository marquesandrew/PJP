package modelo;

public class Produto {
    private String nome;
    private String codigo;
    private int quantidade;
    private double precoUnitario;

    public Produto(String nome, String codigo, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade>0) {
            this.quantidade = quantidade;
        }else {
            this.quantidade = 0;
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario>0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0;
        }
    }

    public double valorTotalEstoque(){
        return quantidade*precoUnitario;
    }


}
