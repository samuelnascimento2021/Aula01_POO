package Aula01_POO;

import java.sql.SQLOutput;

public class ContaBancaria {

    //Atributos
    int numero;
    String titular;
    double saldo;

    //Métodos

    void depositar (double valor){
        saldo += valor;
    }

    void sacar (double valor) {
        saldo -= valor;
    }

    void exibir (){
        System.out.println("Seu saldo é: " + saldo);
    }
}
