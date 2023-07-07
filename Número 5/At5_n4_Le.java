import java.util.*;
public class At5_n4_Le{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double base, altura;
        System.out.println("Digite a base do triângulo: ");
        base = ler.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        altura = ler.nextDouble();
        System.out.println("A área do triângulo é de: " + ((base*altura)/2));
    }
}