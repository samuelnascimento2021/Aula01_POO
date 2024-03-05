package Aula01_POO;

public class CachorroTestar {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro();

        c1.Raca = "Golden Retriever";
        c1.tamanho = 10;
        c1.cor = "Dourado";
        c1.tem_rabo = true;

        c2.Raca = "Yorkshire";
        c2.tamanho = 5;
        c2.cor = "Marrom";
        c2.tem_rabo = false;

        c1.late();
        c2.late();

    }
}
