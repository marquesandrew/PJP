package modelo;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        if(anoPublicacao<1500){
            System.out.println("Livros com ano de publicação menor que 1500 não são permitidos!");
            return 0;
        }else{
            return anoPublicacao;
        }

    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<0){
            System.out.println("O preço não pode ser negativo!");
        }else {
            this.preco = preco;
        }
    }

    public void getDescricao(){
        System.out.println("O título do livro é: " + titulo + " o autor do livro é: " + autor + " e o ano de publicação foi: "+anoPublicacao);
    }
}
