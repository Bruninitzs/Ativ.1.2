import java.util.*;
public class At5_n3_Ld{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double num;
        System.out.println("Digite um número: ");
        num = ler.nextDouble();
        System.out.println("O arco seno do numero é: " + (Math.toDegrees((Math.atan(num))) + " graus"));
    }
}