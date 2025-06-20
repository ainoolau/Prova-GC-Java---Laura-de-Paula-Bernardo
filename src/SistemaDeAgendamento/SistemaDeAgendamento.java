package SistemaDeAgendamento;
/* em resumo a logica e que o codigo comeca com 01/06/2025
ai multiplica o valor dias por 2 e subtrai 3 -> 7 * 2 - 3 = 11
soma 11 dias na data base, agora a data sera 12/06/2025
imprime somente o numero do dia que e 12
*/
import java.time.LocalDate;

public class SistemaDeAgendamento {
    public static void main (String[]args){
        LocalDate base = LocalDate.of(2025, 6, 1);
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3);
        System.out.println(novaData.getDayOfMonth());
    }
}