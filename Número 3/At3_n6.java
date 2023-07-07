import java.util.Scanner;
public class At3_n6{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int dias, horas, minutos, segundos;
        System.out.println("Digite quantos dias: ");
        dias = ler.nextInt();
        System.out.println("Digite quantas horas: ");
        horas = ler.nextInt();
        System.out.println("Digite quantos minutos: ");
        minutos = ler.nextInt();
        System.out.println("Digite quantos segundos: ");
        segundos = ler.nextInt();
        System.out.println("O tempo total em segundos é de " + (segundos + (minutos*60) + ((horas*60)*60) + (((dias*24)*60)*60)));
    }
}