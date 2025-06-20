package ControleDeFluxoEOperadores;
/* esse codigo nao compila pq o bloco if esta solto dentro da classe,
fora de qualquer metodo, o que no Java nao e permitido

o Java exige que blocos de codigo como if, for, while etc.
estejam dentro de um metodo, geralmente o main().

logo esse codigo nao tem nenhuma saida :)

se o codigo estivesse funcional o resultado impresso seria "Tarefa critica".
 */
public class Controle {
    int prioridade = 4;
    int urgencia = 8;

    if (prioridade > 3 && urgencia > 7) {
        System.out.println("Tarefa critica");
    } else if (prioridade > 3 || urgencia > 7) {
        System.out.println("Tarefa importante");
    } else {
        System.out.println("Tarefa comum");
    }
}
