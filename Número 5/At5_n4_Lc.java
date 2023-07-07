import java.util.*;
public class At5_n4_Lc{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double cateto1, cateto2;
        System.out.println("Digite o primeiro cateto: ");
        cateto1 = ler.nextDouble();
        System.out.println("Digite o segundo cateto: ");
        cateto2 = ler.nextDouble();
        System.out.println("A hipotenusa do triângulo retângulo é de: " + (Math.hypot(cateto1, cateto2)));
    }
}