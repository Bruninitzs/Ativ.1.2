import java.util.Scanner;
public class At3_n14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Digite um número inteiro: ");
        num = ler.nextInt();
        System.out.println("O valor do quadrado desse número é de: " + (num*(num*num)));
    }
}