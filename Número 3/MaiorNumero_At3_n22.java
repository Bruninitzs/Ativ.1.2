import java.util.Scanner;
public class MaiorNumero_At3_n22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, maior = 0;
        System.out.println("Digite um número inteiro: ");
        num1 = ler.nextInt();
        System.out.println("Digite outro número inteiro: ");
        num2 = ler.nextInt();
        if(num1 > num2){
            maior = num1;
        }else{
            maior = num2;
        }
        System.out.println("O maior número digitado é: " + maior);
    }
}