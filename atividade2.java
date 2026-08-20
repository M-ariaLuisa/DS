package Laços_repeticao;

import java.util.Scanner; 

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número positivo (ou negativo para sair): ");
        int numero = sc.nextInt();

        while (numero >= 0) {
            System.out.print("Digite outro número positivo (ou negativo para sair): ");
            numero = sc.nextInt();
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }
}

