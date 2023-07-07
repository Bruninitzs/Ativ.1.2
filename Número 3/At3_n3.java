import java.util.Scanner;
public class At3_n3{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		float base, altura;
		System.out.println("Digite a base do triângulo: ");
		base = ler.nextFloat();
		System.out.println("Digite a altura do triângulo: ");
		altura = ler.nextFloat();
		System.out.println("A área do triângulo é igual a: " + ((base*altura)/2));
	}
}