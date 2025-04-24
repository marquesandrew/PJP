import modelo.Empregado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empregado jose = new Empregado("José","Souza",12595.25);
        Empregado jaqueline = new Empregado("Jaqueline","Delgado",6580.63);

        System.out.printf("O salário de José é: R$ %.2f . \n",jose.getSalarioMensal());
        System.out.printf("O salário de Jaqueline é: R$ %.2f . \n",jaqueline.getSalarioMensal());

        jose.aumentarSalario(20);
        jaqueline.aumentarSalario(50);

        System.out.printf("O novo salário de José é: R$ %.2f . \n",jose.getSalarioMensal());
        System.out.printf("O novo salário de Jaqueline é: R$ %.2f . \n",jaqueline.getSalarioMensal());
    }
}