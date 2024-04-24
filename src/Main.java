import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o número da agência?");
        int numero = scanner.nextInt();

        System.out.println("Qual a agência?");
        String agencia = scanner.next();

        System.out.println("Qual o nome do cliente?");
        String nome = scanner.next();

        System.out.println("Qual o saldo?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo
                + " já está disponível para saque");
    }
}