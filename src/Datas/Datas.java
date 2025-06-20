package Datas;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Datas {
    public static void main(String[] args){
        //comeca a contagem a partir de 10 de junho de 2025
        LocalDate data = LocalDate.of(2025,6 , 10);
        //contador de dias uteis
        int diasUteis = 0;
        //enquanto nao alcancar 7 dias uteis
        while (diasUteis < 7){
            //avanca um dia
            data = data.plusDays(1);
            //verifica se o dia atual e sabado ou domingo
            boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;
            //verifica se o dia atual e feriado (15 de junho de 2025)
            boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

            //se nao for final de semana nem feriado, conta como dia util
            if (!fimDeSemana && !feriado){
                diasUteis++;
            }
        }
        //imprime a data quando o 7 dia util chegar
        System.out.println("Data apos 7 dias uteis: " + data);
    }
}
