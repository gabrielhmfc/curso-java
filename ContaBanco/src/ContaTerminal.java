import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao Banco. Aqui você poderá escolher seu número de conta e agência. Vamos criar sua conta agora?");
        System.out.print("Digite o número da conta com 4 dígitos:");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o número da agência com 3 números e um dígito:");
        String agencia = scanner.next();

        System.out.print("Digite o seu primeiro nome:");
        String primeiroNomeCliente = scanner.next();
        
        System.out.print("Digite o seu último nome:");
        String ultimoNomeCliente = scanner.next();

        System.out.print("Digite o saldo inicial considerando casas decimais:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + primeiroNomeCliente + " " + ultimoNomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        //System.out.println("sua agência é " + agencia +", conta " + numeroConta);
        //System.out.println("e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}