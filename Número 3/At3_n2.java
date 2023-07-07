import java.util.Scanner;
public class At3_n2{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		float raio;
		System.out.println("Digite o raio de um círculo: ");
		raio = ler.nextFloat();
		System.out.println("O círculo tem uma área de: " + (3.14*(raio*raio)));
	}
}