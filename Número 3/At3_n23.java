import java.util.*;
public class At3_n23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String operacao;
        double valor = 0;
        double num, expo;
        System.out.println("Digite a operação(Raiz/Potencia): ");
        operacao = ler.next().toUpperCase();
        if(operacao.equals("RAIZ")){
            System.out.println("Digite um número: ");
            num = ler.nextDouble();
            valor = Math.sqrt(num);
        }else if (operacao.equals("POTENCIA")){
            System.out.println("Digite a base: ");
            num = ler.nextDouble();
            System.out.println("Digite o expoente: ");
            expo = ler.nextDouble();
            valor = Math.pow(num, expo);
        }
        System.out.println("O resultado da operação é: " + valor);
    }
}