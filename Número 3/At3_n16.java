import java.util.Scanner;
public class At3_n16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float valor;
        int porcentagem;
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextFloat();
        System.out.println("Digite a porcentagem de desconto: ");
        porcentagem = ler.nextInt();
        System.out.println("O valor total do produto com desconto é de: " + (valor-((valor*porcentagem)/100)));
    }
}