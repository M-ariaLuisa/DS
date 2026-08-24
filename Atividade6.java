package Atividade;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Calcular Tabuada");
            System.out.println("2 - Realizar Contagem Regressiva");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite um número: ");
                    int numero = sc.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                    break;

                case 2:
                    System.out.print("Digite um número para iniciar a contagem: ");
                    int contador = sc.nextInt();

                    for (int i = contador; i >= 0; i--) {
                        System.out.println(i);
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();

        } while (opcao != 0);

        sc.close();
    }
}