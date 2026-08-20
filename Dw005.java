import java.util.Scanner;

public class Dw005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Iniciar jogo");
                    break;
                case 0:
                    System.out.println("sair");
                    break;
                default:
                    System.out.println("opção inválida");
                    break;
            }
        } while (op != 0);

        sc.close();
    }
}