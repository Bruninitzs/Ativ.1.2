import java.util.Scanner;
public class At3_n9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int litro;
        float preco;
        System.out.println("Digite o preço da gasolina: ");
        preco = ler.nextFloat();
        System.out.println("Digite quantos litros de gasolina serão abastecidos: ");
        litro = ler.nextInt();
        System.out.println("O preço total da gasolina é de: " + (preco*litro));
    }
}