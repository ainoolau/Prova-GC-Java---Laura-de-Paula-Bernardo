package ConstrucaoDeClassesEMetodos;
/* a classe principal e usada pra testar a classe livro
no main criamos um objeto, atribuimos um titulo ao livro
e verificamos seu status antes e depois de emprestar ele

a saida antes de emprestar deve mostrar "Disponivel"
e depois de emprestar deve mostrar "Indisponivel"
 */
public class Principal {
    public static void main(String[] args){
        Livro l = new Livro();
        l.titulo = "Java para Iniciantes";
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());
    }
}
