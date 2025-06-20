package ForComFiltro;

ArrayList<String> tarefas = new ArrayList<>();
tarefas.add("Estudar Java");
tarefas.add("Fazer exercicios");
tarefas.add("Revisar codigo");

for (String tarefa : tarefas) {
    if (tarefa.contains("Java")){
        System.out.println("Tarefa de programacao: " + tarefa);
    }
}

/* Fica claro que o codigo tem erro de compilacao, pois o mesmo
nao esta dentro de um metodo main, assim como nao tem os devidos importes

mas como o enunciado me pede apenas a saida simulada da logica
o resultado da saida sera apenas "Estudar Java" pois foi exatamente isso
que passamos no contains, printando apenas a tarefa que continha "Java".
 */

