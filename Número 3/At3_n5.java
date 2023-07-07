import java.util.Scanner;
public class At3_n5{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int horas;
		float salario;
		System.out.println("Digite a sua quantidade de horas trabalhadas: ");
		horas = ler.nextInt();
		System.out.println("Digite o valor da sua hora de trabalho: ");
		salario = ler.nextFloat();
		System.out.println("O seu salário diário é igual a: " + (salario*horas));
	}
}