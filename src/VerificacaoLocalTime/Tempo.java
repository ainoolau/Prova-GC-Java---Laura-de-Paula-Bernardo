package VerificacaoLocalTime;
/* aqui nos vamos ter erro de compilacao ja que o bloco de codigo
esta jogado fora de um metodo, alem da falta dos importes pra utilizar o LocalTime
 */
LocalTime envio = LocalTime.of(23, 0);
LocalTime limite = LocalTime.of(22, 59);

if (!envio.isBefore(limite)) {
    System.out.println("Entrega fora do horario");
} else {
    System.out.println("Tarefa enviada com sucesso");
}
