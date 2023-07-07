import java.util.Scanner;
public class At3_n10 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int dias;
    float valor;
        System.out.println("Digite quantos dias o carro foi alugado: ");
        dias = ler.nextInt();
        System.out.println("Digite o preço diário do aluguel do carro: ");
        valor = ler.nextFloat();
        System.out.println("O preço total pago é de: " + (dias*valor));
    }
}