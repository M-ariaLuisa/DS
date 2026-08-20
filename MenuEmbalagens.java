package Atividade2;


import java.util.Scanner;

public class MenuEmbalagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op != 4) {
            System.out.println("\n--- MENU DE EMBALAGENS ---");
            System.out.println("1- Caixa de papelão");
            System.out.println("2- Sacola plástica");
            System.out.println("3- Embalagem de vidro");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");
            
            op = sc.nextInt();

            switch (op) {
                case 1 -> System.out.println("Caixa de papelão: Ideal para transporte e armazenamento");
                case 2 -> System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável");
                case 3 -> System.out.println("Embalagem de vidro: Resistente e reutilizável.");
                case 4 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}
