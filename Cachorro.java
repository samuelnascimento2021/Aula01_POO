package Aula01_POO;

public class Cachorro {

    //Atributos

    String Raca;
    int tamanho;
    String cor;
    boolean tem_rabo;

    //Métodos

    void late(){
        if(tem_rabo) {
            System.out.println("Eu sou o " + Raca + " de tamanho " + tamanho + ", minha cor é " + cor + " e eu tenho rabo.\n");
        }
        else{
            System.out.println("Eu sou o " + Raca + " de tamanho " + tamanho + ", minha cor é " + cor + " e eu não tenho rabo.\n");
        }
    }

}
