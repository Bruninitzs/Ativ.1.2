import java.util.*;
public class At5_n4_Ld{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.println("Digite o valor do primeiro lado do triângulo: ");
        lado1 = ler.nextDouble();
        System.out.println("Digite o valor do segundo lado do triângulo: ");
        lado2 = ler.nextDouble();
        System.out.println("Digite o valor do terceiro lado do triângulo: ");
        lado3 = ler.nextDouble();
        System.out.println("O perímetro do triângulo é de: " + (lado1+lado2+lado3));
    }
}