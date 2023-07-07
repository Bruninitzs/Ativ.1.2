import java.util.*;
public class At5_n4_La{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double raio;
        System.out.println("Digite o raio do círculo: ");
        raio = ler.nextDouble();
        System.out.println("O círculo tem uma área de: " + (Math.PI*(Math.pow(raio, 2))));
    }
}