import modelo.ContaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaBancaria("José","6463-5",5000);
        contaCorrente.exibeSaldo();
        contaCorrente.depositar(100);
        contaCorrente.exibeSaldo();
        contaCorrente.sacar(3000);
        contaCorrente.exibeSaldo();
        contaCorrente.depositar(-1);
        contaCorrente.sacar(3000);
    }
}