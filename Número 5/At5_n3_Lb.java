import java.util.*;
public class At5_n3_Lb{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double valor;
        System.out.println("Digite o valor: ");
        valor = ler.nextDouble();
        System.out.println("O arco seno do valor é: " + (Math.toDegrees((Math.asin(valor)))) + " graus");
    }
}