package Questao6;

import java.util.ArrayList;

/*
  O codigo cria uma lista de horarios e realiza operacoes de adicao e remocao.

  A linha final imprime o elemento no indice 1 da lista, que é "12:00".
  a saida nesse caso vai ser 12:00 pq a ArrayList sempre comeca no indice 0
  entao contando com o 08:00 estando na posicao 0
  e o 10:00 ter sido removido da posicao 1
  agora a posicao 1 se tornou o 12:00
*/

public class Questao6 {
    public static void main(String[] args) {
        // Cria uma lista de Strings chamada "horarios"
        ArrayList<String> horarios = new ArrayList<>();

        // Adiciona horários à lista
        horarios.add("08:00"); // índice 0
        horarios.add("10:00"); // índice 1
        horarios.add("12:00"); // índice 2

        // Remove o horário do índice 1 ("10:00")
        horarios.remove(1);

        // Adiciona "14:00" ao final da lista
        horarios.add("14:00"); // índice 2

        // Imprime o valor que está no índice 1 da lista: "12:00"
        System.out.println(horarios.get(1)); // Saída: 12:00
    }
}