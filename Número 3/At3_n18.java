import java.util.Scanner;
public class At3_n18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, ano;
        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();
        System.out.println("Digite o ano em que estamos: ");
        ano = ler.nextInt();
        System.out.println("Você nasceu no ano de " + (ano-idade));
    }
}

