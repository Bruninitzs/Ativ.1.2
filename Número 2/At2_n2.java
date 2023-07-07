import java.util.Scanner;
public class At2_n2 {
    public static void main(String[] args) {
        String nome;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine().toUpperCase();
        System.out.println("Seja bem vindo " + nome + "!!");
    }
}
