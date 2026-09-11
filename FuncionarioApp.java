package funcionarios;

import java.util.Scanner;

public class FuncionarioApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Professor[] professores = new Professor[10];
        int totalProfessores = 0;

        Tecnico[] tecnicos = new Tecnico[10];
        int totalTecnicos = 0;

        int op;

        do {
            System.out.println("---Sistema cadastro de funcionários---");
            System.out.println("1 Cadastrar dados de professores");
            System.out.println("2 Cadastrar dados de técnicos");
            System.out.println("3 Exibir dados de professores");
            System.out.println("4 Exibir dados de técnicos");
            System.out.println("0 Sair");
            System.out.println("Escolha uma opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número válido");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1: {
                    if (totalProfessores >= professores.length) {
                        System.out.println("Limite de professores atingido!");
                        break;
                    }

                    System.out.println("Informe o nome");
                    String nome = sc.nextLine();

                    System.out.println("Informe o salário do funcionário");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Informe a disciplina: ");
                    String disciplina = sc.nextLine();

                    Professor p = new Professor(nome, salario, disciplina);
                    professores[totalProfessores] = p;
                    totalProfessores++;

                    p.exibirInfo();
                    break;
                }
                case 2: {
                    if (totalTecnicos >= tecnicos.length) {
                        System.out.println("Limite de técnicos atingido!");
                        break;
                    }

                    System.out.println("Informe o nome");
                    String nome = sc.nextLine();

                    System.out.println("Informe o salário");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Informe o setor: ");
                    String setor = sc.nextLine();

                    Tecnico t = new Tecnico(nome, salario, setor);
                    tecnicos[totalTecnicos] = t;
                    totalTecnicos++;

                    t.exibirInfo();
                    break;
                }
                case 3: {
                    System.out.println("--- Lista de Professores ---");
                    boolean algumEncontrado = false;

                    for (int i = 0; i < professores.length; i++) {
                        if (professores[i] != null) {
                            professores[i].exibirInfo();
                            System.out.println("---");
                            algumEncontrado = true;
                        }
                    }

                    if (!algumEncontrado) {
                        System.out.println("Nenhum professor cadastrado.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("--- Lista de Técnicos ---");
                    boolean algumEncontrado = false;

                    for (int i = 0; i < tecnicos.length; i++) {
                        if (tecnicos[i] != null) {
                            tecnicos[i].exibirInfo();
                            System.out.println("---");
                            algumEncontrado = true;
                        }
                    }

                    if (!algumEncontrado) {
                        System.out.println("Nenhum técnico cadastrado.");
                    }
                    break;
                }
                case 0: {
                    System.out.println("Saindo...");
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");
                }
            }

        } while (op != 0);

        sc.close();
    }
}