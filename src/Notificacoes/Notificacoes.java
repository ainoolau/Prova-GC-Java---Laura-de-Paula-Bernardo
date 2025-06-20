package Notificacoes;

/*
  O codigo simula um contador de notificacoes.
  Começamos com o valor 0.
  Usamos um laco for que vai de 1 até 5.
  Para cada numero:
    Se for par (i % 2 == 0), somamos +2 notificacoes.
    Se for impar, somamos +1.

  Passo a passo:
  i = 1 -> impar -> +1 -> total = 1
  i = 2 -> par -> +2 -> total = 3
  i = 3 -> impar -> +1 -> total = 4
  i = 4 -> par -> +2 -> total = 6
  i = 5 -> impar -> +1 -> total = 7

  Resultado final impresso: 7

  obs: o codigo em si no enunciado nao compila pois o bloco de codigo
  nao estar dentro de um metodo, mas como a questao e apenas uma simulacao
  o resultado esperado pra esse codigo, quando esta feito de forma correta, e 7.
*/

public class Notificacoes {
    public static void main(String[] args) {
        int notificacoes = 0;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                notificacoes += 2;
            } else {
                notificacoes++;
            }
        }

        System.out.println(notificacoes); // Saída: 7
    }
}