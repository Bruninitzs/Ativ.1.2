import java.util.*;
public class At5_n2_La{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float num;
        System.out.println("Digite um número decimal: ");
        num = ler.nextFloat();
        System.out.println("Esse número quando arredondado para cima é: " + (Math.ceil(num)));
    }
}