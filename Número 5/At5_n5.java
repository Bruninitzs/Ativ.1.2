import java.util.*;
public class At5_n5{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double hipotenusa, oposto;
        System.out.println("Digite o valor da hipotenusa do triângulo: ");
        hipotenusa = ler.nextDouble();
        System.out.println("Digite o valor do cateto oposto do triângulo: ");
        oposto = ler.nextDouble();
        System.out.println("O valor do cateto adjacente do triângulo é: " + (Math.sqrt((Math.pow(hipotenusa, 2) - (Math.pow(oposto, 2))))));
    }
}