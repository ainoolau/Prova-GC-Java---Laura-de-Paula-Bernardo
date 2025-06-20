package CadastroComSobrecarga;

/* a classe Item tem dois atributos, nome e quantidade
ela tem  tambem dois construtores
o primeiro recebe apenas o nome e define a quantidade como 1
o segundo recebe o nome e a quantidade permitindo personalizar esse valor
no metodo main criamos um objeto x com apenas o nome
entao a quantidade fica setada como 1
tambem criamos o objeto y com nome e a quantidade 3
no final somamos x.quantidade (1) + y.quantidade (3) que resulta em 4
e entao o codigo imprime esse valor
 */
public class Item {
    String nome;
    int quantidade;

    public Item(String nome) {
        this.nome = nome;
        this.quantidade = 1;
    }

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        Item x = new Item("Caderno");
        Item y = new Item("Caneta", 3);
        System.out.println(x.quantidade + y.quantidade);
    }
}
