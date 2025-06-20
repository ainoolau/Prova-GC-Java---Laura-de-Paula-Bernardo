package ConstrutoresEInstancias;
//classe Principal para demonstrar como instanciar um objeto da classe usuario
public class Principal {
    public static void main(String[] args){
        Usuario u = new Usuario("Joao", 25);
//exibe os dados do objeto criado
        System.out.println("Nome: " + u.nome);
        System.out.println("Idade: " + u.idade);
    }
}
