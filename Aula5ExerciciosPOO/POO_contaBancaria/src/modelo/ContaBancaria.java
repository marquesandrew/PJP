package modelo;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void depositar(double valor){
        if (valor>0){
            setSaldo(valor);
        }else{
            System.out.println("Não é possível depositar um valor negativo");
        }
    }
    public void sacar(double valor){
        if(getSaldo()>=valor){
            setSaldo(-valor);
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void exibeSaldo(){
        System.out.printf("O saldo atual da conta é: R$ %.2f . \n",getSaldo());
    }
}
