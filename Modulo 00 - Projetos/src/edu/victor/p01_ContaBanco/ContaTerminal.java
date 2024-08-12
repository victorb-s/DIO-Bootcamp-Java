package edu.victor.p01_ContaBanco;
import java.util.*;

/**
 * @author Victor Barbosa
 * @version 1.0
 * @since 28/07/2024
 */

public class ContaTerminal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, informe o seu Nome");
    String nomeCliente = scanner.nextLine();

    System.out.println("\n" + nomeCliente + ", por favor, digite o número da Conta");
    int numero = scanner.nextInt();

    System.out.println("\n" + nomeCliente + ", por favor, digite o número da Agência");
    int agencia = scanner.nextInt();

    System.out.println("\n" + nomeCliente + ", por favor, informe o saldo disponível em sua conta");
    double saldo = scanner.nextDouble();

    System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
    }
}
