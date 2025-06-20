package PlataformaDeEstudos;
/* o codigo faz uma media ponderada entre as duas notas
uma com peso 2 outra com o peso 3
se a media for maior ou igual a 7.0 imprime aprovado
senao ele imprime revisar conteudo
no caso a saida desse codigo vai ser passado pro else "revisar conteudo"
pq o a nota vai ser inferior a 7.0 (o resultado vai dar 6.4) */
public class PlataformaDeEstudos {
    public static void main(String[] args){
        int nota = 7;
        int peso = 2;
        double media = (nota * peso + 6 * 3) / 5;
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Revisar conteudo");
        }
    }
}
