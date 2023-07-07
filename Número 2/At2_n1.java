import java.util.Scanner;
public class At2_n1 {
    public static void main(String[] args) {
        String nome, cidade;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine().toUpperCase();
        System.out.println("Digite sua cidade: ");
        cidade = ler.nextLine().toUpperCase();
        System.out.println("Olá " + nome + ", você mora na cidade de " + cidade + ".");
    }
}
