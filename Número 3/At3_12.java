import java.util.Scanner;
public class At3_12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float valor;
        System.out.println("Digite o valor do produto: ");
        valor =ler.nextFloat();
        System.out.println("O valor do produto com acréscimo é de: " + (valor+((valor*15)/100)));
    }
}