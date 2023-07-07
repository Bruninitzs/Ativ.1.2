import java.util.Scanner;
public class At3_n25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float dolar;
        System.out.println("Digite um valor(em dólar): ");
        dolar = ler.nextFloat();
        System.out.println("US$" + dolar + " em reais é igual a: " + "R$" + (dolar*3.55));
    }
}