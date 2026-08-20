package Do_while;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        do {
            System.out.print("Digite a senha de 4 dígitos: ");
            senha = sc.nextInt();
        } while (senha != 2024);

        System.out.println("Acesso Permitido");

        sc.close();
    }
}