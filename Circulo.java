package Aula01_POO;

public class Circulo {

    //Atributos

    double raio;

    //Métodos

    public double area(){
        return Math.PI*Math.pow(raio, 2);
    }

    public double perimetro(){
        return 2*Math.PI*Math.pow(raio, 2);
    }
}
