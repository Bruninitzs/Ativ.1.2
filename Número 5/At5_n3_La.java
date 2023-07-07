import java.util.*;
public class At5_n3_La{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double angulo;
        System.out.println("Digite o valor do ângulo em radianos: ");
        angulo = ler.nextDouble();
        System.out.println("A tangente do ângulo é: " + (Math.tan(angulo)));
    }
}