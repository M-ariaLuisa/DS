package Laços_repeticao;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";


        while (!nome.equals("Anderson")) {
            System.out.print("Digite o nome do professor mais fofo do SENAI: ");
            nome = sc.next(); 
        }

        System.out.println("Parabéns! Você acertou: é o Anderson!");

        sc.close();
    }
}