import modelo.Livro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro 1","Autor do livro",1984,150);
        livro1.getDescricao();
    }
}