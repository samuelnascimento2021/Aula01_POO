package Aula01_POO;

public class ContaBancariaTestar {
    public static void main(String[] args) {
        //Instanciar objeto

        ContaBancaria c1 = new ContaBancaria();

        c1.numero = 123456;
        c1.titular = "Samuel";
        c1.saldo = 2565;

        System.out.println("Número da conta: " + c1.numero + "\nTitular da conta: " + c1. titular + "\nSaldo: " + c1.saldo);

        c1.depositar(15000);
        c1.exibir();

        c1.sacar(2565);
        c1.exibir();

    }
}
