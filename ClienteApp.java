import java.util.Scanner;

public class ClienteApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int op:

        do{
            System.out.println("---Sistema de cadastro de clientes---");
            System.out.println("1 Pessoa Física");
            System.out.println("2 Pessoa Jurídica");
            System.out.println("0 Sair");
            System.out.println("Escolha uma opção: ");

            while(!sc.hasNextInt()){
                System.out.println("Opção inválida. Digite 0,1 ou 2");
                sc.next();

            }
            op=sc.NextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Informe o nome: ");
                    String nome=sc.nextLine();

                    System.out.println("Informe o endereço: ");
                    String endereco=sc.nextLine();

                    System.out.println("Informe o CPF: ");
                    String cpf=sc.nextLine();

                    ClientePF pf = new ClientePF(nome, endereco, cpf);
                    pf.setNome(nome);
                    pf.setEndereco(endereco);
                    pf.setCpf(cpf);

                    System.out.println("Dados do cliente PF: ");
                    pf.exibirDados();

                    break;

                default:

            }
        }
