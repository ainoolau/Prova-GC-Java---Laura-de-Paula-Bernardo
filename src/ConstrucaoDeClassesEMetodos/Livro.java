package ConstrucaoDeClassesEMetodos;
/* a classe Livro representa um livro que pode estar disponivel ou emprestado
ela tem dois atributos, o titulo com o nome do livro e um booleano que indica se
o livro foi ou nao emprestado

a classe tambem tem dois metodos
emprestar que define o livro como emprestado
e status que retorna uma string com a situacao atual do livro
 */
public class Livro {
    String titulo;
    boolean emprestado;

    public void emprestar(){
        emprestado = true;
    }

    public String status(){
        if (emprestado) {
            return "Indisponivel";
        }
        return "Disponivel";
    }
}
