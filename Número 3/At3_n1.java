import java.util.Scanner;
public class At3_n1{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite um número inteiro: ");
        num1 = ler.nextInt();
        System.out.println("Digite outro número inteiro: ");
        num2 = ler.nextInt();
        System.out.println("O resultado da soma desses dois números: " + (num1+num2));
    }
}