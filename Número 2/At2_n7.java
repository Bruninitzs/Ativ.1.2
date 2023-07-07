import java.util.Scanner;
public class At2_n7 {
    public static void main(String[] args) {
        String nome, cidade;
        int idade = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine().toUpperCase();
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Digite sua cidade: ");
        cidade = ler.next().toUpperCase();
        System.out.println("Olá " + nome + ", você mora na cidade de " + cidade + " e tem " + idade + " anos.");
    }
}
