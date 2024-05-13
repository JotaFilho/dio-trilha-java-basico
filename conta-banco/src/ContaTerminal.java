
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Seu saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        //imprimido os dados obtidos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponivel para saque.");

    }
}
