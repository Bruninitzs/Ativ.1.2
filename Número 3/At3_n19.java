import java.util.Scanner;
public class At3_n19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, meses;
        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();
        System.out.println("Digite a quantidade de anos que você viveu: ");
        meses = ler.nextInt();
        System.out.println("Você viveu aproximadamente um total de " + ((idade*12*30) + (meses*30)) + " dias");
    }
}