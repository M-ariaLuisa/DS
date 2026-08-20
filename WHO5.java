
import java.util.Scanner;

public class WHO5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;
        while (op != 5) {
            System.out.println("Menu de opções:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
        }
        sc.close();
    }
}

