import modelo.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa albertEinstein = new Pessoa("Albert Einstein",14,3,1879);
        albertEinstein.calculaIdade(17,4,2025);
        System.out.println(albertEinstein.getNome());
        System.out.println(albertEinstein.getIdade());

        Pessoa isaacNewton = new Pessoa("Isaac Newton",4,1,1643);
        isaacNewton.calculaIdade(17,4,2025);
        System.out.println(isaacNewton.getNome());
        System.out.println(isaacNewton.getIdade());

        albertEinstein.atualizarDataNascimento(28,9,1991);
        System.out.println();
        System.out.println("Nova Idade");
        albertEinstein.calculaIdade(17,4,2025);
        System.out.println(albertEinstein.getNome());
        System.out.println(albertEinstein.getIdade());

        isaacNewton.atualizarDataNascimento(2,2,1970);
        System.out.println();
        System.out.println("Nova Idade");
        isaacNewton.calculaIdade(17,4,2025);
        System.out.println(isaacNewton.getNome());
        System.out.println(isaacNewton.getIdade());



    }
}