import java.util.Scanner;
public class At3_n13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidade;
        float valor;
        System.out.println("Digite a quantidade comprada do produto: ");
        quantidade = ler.nextInt();
        System.out.println("Digite o preço do produto: ");
        valor = ler.nextFloat();
        System.out.println("O preço total é de: " + (quantidade*valor));
    }
}