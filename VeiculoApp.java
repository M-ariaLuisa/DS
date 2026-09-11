
import java.util.Scanner;

public class VeiculoApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int op;

        do{
            System.out.println("---Sistema cadastro de veículos--- ");
            System.out.println("1 Moto");
            System.out.println("2 Carro");
            System.out.println("0 Sair ");
            System.out.println("Escolha uma opção: ");

            while(!sc.hasNextInt()){
                System.out.println("Opção inválida.Digite 0, 1 ou 2");
                sc.next();
            }

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:{
                    System.out.println("Informe a marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Informe o ano de fabricação");
                    int ano = sc.nextInt();

                    System.out.println("Informe a cilindrada: ");
                    double cilindrada = sc.nextDouble();

                    Moto m = new Moto(marca, ano, cilindrada);
                    m.setMarca(marca);
                    m.setAno(ano);
                    m.setCilindrada(cilindrada);

                    System.out.println("Dados da moto: ");
                    m.exibirInfo();
            
                    break;
                }
                    case 2:{
                        System.out.println("Informe a marca");
                        String marca = sc.nextLine();

                        System.out.println("Informe o ano de fabricação");
                        int ano = sc.nextInt();

                        System.out.println("Informe a quantidade de portas : ");
                        int qtdPortas = sc.nextInt();

                        Carro c = new Carro(marca, ano, qtdPortas);
                        c.setMarca(marca);
                        c.setAno(ano);
                        c.setQtdPortas(qtdPortas);

                        c.exibirInfo();
                        break;

                        
                    }
                    case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                    default:
                    System.out.println("Opção inválida. Digite 0, 1 ou 2");
                    break;
            }
            } while (op != 0);
        
            sc.close();



        }



    }
    

