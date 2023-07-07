import java.util.Scanner;
public class At3_n17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int parcelas;
        float valor;
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextFloat();
        System.out.println("Digite em quantas parcelas você quer pagar: ");
        parcelas = ler.nextInt();
        System.out.println("Você vai pagar em " + parcelas + " parcelas, com o valor de " + (valor/parcelas) + " por mês");
    }
}