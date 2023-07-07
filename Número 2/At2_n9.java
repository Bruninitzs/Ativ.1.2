import java.util.Scanner;
public class At2_n9 {
    public static void main(String[] args) {
        String nome, rua, cidade, estado;
        int numero, cep, cpf, telefone;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine().toUpperCase();
        System.out.println("Digite o nome da sua rua: ");
        rua = ler.nextLine().toUpperCase();
        System.out.println("Digite o número da sua casa: ");
        numero = ler.nextInt();
        System.out.println("Digite o seu CEP: ");
        cep = ler.nextInt();
        System.out.println("Digite o nome da sua cidade: ");
        cidade = ler.next().toUpperCase();
        System.out.println("Digite o nome do seu estado: ");
        estado = ler.next().toUpperCase();
        System.out.println("Digite o seu CPF: ");
        cpf = ler.nextInt();
        System.out.println("Digite o seu número de telefone: ");
        telefone = ler.nextInt();
        System.out.println("Nome........: " + nome);
        System.out.println("Endereço....: RUA " + rua + ", NÚMERO: " + numero + ", CEP: " + cep);
        System.out.println("Cidade......: " + cidade);
        System.out.println("Estado......: " + estado);
        System.out.println("CPF.........: " + cpf);
        System.out.println("Tel. Celular: " + telefone);





    }
}
