import java.util.Scanner;
public class At3_n4{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int graus;
		System.out.println("Digite a temperatura em graus Celsius: ");
		graus = ler.nextInt();
		System.out.println(graus + "°C em fahrenheit é igual a: " + ((graus*9/5)+32));
	}
}