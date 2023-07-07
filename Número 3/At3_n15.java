import java.util.Scanner;
public class At3_n15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float peso, altura;
        System.out.println("Digite a sua altura: ");
        altura = ler.nextFloat();
        System.out.println("Digite o seu peso: ");
        peso = ler.nextFloat();
        System.out.println("O seu IMC é de: " + (peso/(altura*altura)));
    }
}