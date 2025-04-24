import modelo.Produto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto chaveInglesa = new Produto("Chave Inglesa","132",1,65.50);
        Produto chavePhilips = new Produto("Chave Philips","456",10,36.90);

        System.out.printf("O valor total em estoque da Chave Inglesa é: R$ %.2f . \n",chaveInglesa.valorTotalEstoque());
        System.out.printf("O valor total em estoque da Chave Philips é: R$ %.2f . \n",chavePhilips.valorTotalEstoque());
    }
}