package Aula01_POO;

public class CirculoTestar {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();

        c1.raio = 2;

        System.out.println(c1.area());
        System.out.println(c1.perimetro());

    }

}
