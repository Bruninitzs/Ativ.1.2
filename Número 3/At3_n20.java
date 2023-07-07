import java.util.Scanner;
public class At3_n20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float lado;
        System.out.println("Digite o valor do lado de um quadrado: ");
        lado = ler.nextFloat();
        System.out.println("O valor da área do quadrado é de: " + (lado*lado));
    }
}