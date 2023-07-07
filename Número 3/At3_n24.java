import java.util.Scanner;
public class At3_n24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, i;
        System.out.println("Digite um número: ");
        num = ler.nextInt();
        for(i = 0;i <= 10; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}