import java.util.*;
public class At5_n2_Lf{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite um número inteiro: ");
        num1 = ler.nextInt();
        System.out.println("digite outro número inteiro: ");
        num2 = ler.nextInt();
        System.out.println("O valor mínimo entre os dois números é: " + (Math.min(num1, num2)));
    }
}