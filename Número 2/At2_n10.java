import java.util.Scanner;
public class At2_n10 {
    public static void main(String[] args) {
        int A, B, X;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        A = ler.nextInt();
        System.out.println("Digite outro número: ");
        B = ler.nextInt();
        System.out.println("Sequência anterior: " + A + ", " + B);
        X = A;
        A = B;
        B = X;
        System.out.println("Sequência atual: " + A + ", " + B);
    }
}
