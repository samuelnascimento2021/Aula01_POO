package Aula01_POO;

public class PessoaTestar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "João";
        p1.idade = 25;
        p1.cidade = "Belo Horizonte\n";

        p2.nome = "Maria";
        p2.idade = 28;
        p2.cidade = "Venda Nova";

        p1.apresentar();

        p2.apresentar();

    }
}
