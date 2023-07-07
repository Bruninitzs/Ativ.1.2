import java.util.Scanner;
public class At3_n8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float preco;
        System.out.println("Digite o valor do produto: ");
        preco = ler.nextFloat();
        System.out.println("O preço do produto com 10% de desconto é de: " + (preco - ((preco*10)/100)));
    }
}