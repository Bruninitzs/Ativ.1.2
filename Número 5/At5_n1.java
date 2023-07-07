import java.util.*;
public class At5_n1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int X1, X2, Y1, Y2;
        System.out.println("Primeira coordena: ");
        System.out.println("Coordenada X: ");
        X1 = ler.nextInt();
        System.out.println("Coordenada Y: ");
        Y1 = ler.nextInt();
        System.out.println("Segunda coordena: ");
        System.out.println("Coordenada X: ");
        X2 = ler.nextInt();
        System.out.println("Coordenada Y: ");
        Y2 = ler.nextInt();
        System.out.println("A distância entre as duas coordenadas é de: " + (Math.sqrt((Math.pow(X1-X2, 2)) + (Math.pow(Y1-Y2, 2)))));
    }
}