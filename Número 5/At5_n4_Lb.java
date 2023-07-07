import java.util.*;
public class At5_n4_Lb{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double raio;
        System.out.println("Digite o raio do círculo: ");
        raio = ler.nextDouble();
        System.out.println("O círculo tem uma circunferência de: " + (2 * (Math.PI) * raio));
    }
}