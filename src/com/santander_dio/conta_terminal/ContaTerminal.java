package com.santander_dio.conta_terminal;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, informe o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, informe o número da agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o nome do titular:");
        String titular = scanner.next();

        System.out.println("Por favor, informe o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ titular +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
