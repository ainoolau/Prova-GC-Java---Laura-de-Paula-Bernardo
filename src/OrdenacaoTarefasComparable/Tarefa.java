package OrdenacaoTarefasComparable;
/* a classe tarefa representa uma tarefa com um titulo
ela implementa a interface comparable para permitir a ordenacao por titulo
 */
public class Tarefa implements Comparable<Tarefa> {
    String titulo;
//construtor que define o titulo da tarefa
    public Tarefa(String titulo){
        this.titulo = titulo;
    }
//esse metodo define como as tarefas serao comparadas entre si (por ordem alfabetica do titulo)
    public int compareTo(Tarefa outra){
        return this.titulo.compareTo(outra.titulo);
    }
    /*
     O correto aqui seria a gente sobreescrever o toString pra que a tarefa imprima apenas
     o titulo quando usar o println, vou deixar comentado esse bloco de codigo

     @Override
     public String toString(){
        return titulo;
     }
     */

    public static void main(String[] args){
        //criamos a lista de tarefas
        List<Tarefa> tarefas = new ArrayList<>();
        //adcionamos as tarefas com titulos diferentes
        tarefas.add(new Tarefa("Estudar"));
        tarefas.add(new Tarefa("Almocar"));
        tarefas.add(new Tarefa("Dormir"));
        //ordenamos a lista com base no compareTo() por ordem alfabetica
        Collections.sort(tarefas);
        //printamos a lista apos a ordenacao
        System.out.println(tarefas);
    }
}

/*
uma observacao apenas, eu fiz exatamente o codigo do enunciado
pois sei que foi pedido apenas a saida apos a ordenacao e nao o resultado do println
pro codigo compilar corretamente ele deveria tambem conter os importes
java.until.ArrayList
java.until.Collections
java.until.List
 */
