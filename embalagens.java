package Do_while;

import java.util.Scanner;

public class embalagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("1- Caixa de papelão");
            System.out.println("2- Sacola plástica");
            System.out.println("3- Embalagem de vidro");
            System.out.println("4- Sair");
            
            op = sc.nextInt();

            switch (op) {
                case 1 -> System.out.println("Caixa de papelão: Ideal para transporte e armazenamento");
                case 2 -> System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável");
                case 3 -> System.out.println("Embalagem de vidro: Resistente e reutilizável.");
                case 4 -> System.out.println("Sair");
                default -> System.out.println("Opção inválida");
            }
        } while (op != 4);
        
        sc.close();
    }
}

