import modelo.Fatura;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("Fatura-1","Compra de equipamento",10,200.50);
        System.out.println("-----Impressão de Fatura-----");
        System.out.printf("O preço total da sua fatura é: R$ %.2f. \n",fatura.getTotalFatura());
    }
}