package Hotel;

import java.util.Scanner;

public class ReservasHotel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int MAX_QUARTOS = 5;
        final int MAX_RESERVAS = 25;

        // Arrays dos quartos
        int[] quartos = new int[MAX_QUARTOS];
        int[] camas = new int[MAX_QUARTOS];

        // Arrays das reservas
        String[] hospedes = new String[MAX_RESERVAS];
        int[] reservasQuarto = new int[MAX_RESERVAS];

        int quantidadeQuartos;
        int quantidadeReservas = 0;
        int opcao;

        // Solicita a quantidade de quartos
        do {
            System.out.print("Informe a quantidade de quartos (1 a 5): ");
            quantidadeQuartos = scanner.nextInt();

            if (quantidadeQuartos < 1 || quantidadeQuartos > MAX_QUARTOS) {
                System.out.println("Quantidade inválida! O hotel pode ter no máximo 5 quartos.");
            }

        } while (quantidadeQuartos < 1 || quantidadeQuartos > MAX_QUARTOS);


        do {

            System.out.println("\n===== SUNSTAY HOTEL =====");
            System.out.println("1 - Registrar número dos quartos");
            System.out.println("2 - Registrar quantidade de camas");
            System.out.println("3 - Reservar quarto");
            System.out.println("4 - Consultar reservas por quarto");
            System.out.println("5 - Consultar reservas por hóspede");
            System.out.println("6 - Encerrar sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer


            switch (opcao) {

                // =========================================
                // 1 - REGISTRAR NÚMERO DOS QUARTOS
                // =========================================
                case 1:

                    System.out.println("\n--- REGISTRAR QUARTOS ---");

                    for (int i = 0; i < quantidadeQuartos; i++) {

                        System.out.print("Informe o número do quarto " + (i + 1) + ": ");
                        quartos[i] = scanner.nextInt();

                    }

                    System.out.println("Quartos registrados com sucesso!");

                    break;


                // =========================================
                // 2 - REGISTRAR QUANTIDADE DE CAMAS
                // =========================================
                case 2:

                    System.out.println("\n--- REGISTRAR CAMAS ---");

                    for (int i = 0; i < quantidadeQuartos; i++) {

                        System.out.print(
                            "Quarto " + quartos[i] + " -> quantidade de camas: "
                        );

                        camas[i] = scanner.nextInt();

                    }

                    System.out.println("Quantidade de camas registrada com sucesso!");

                    break;


                // =========================================
                // 3 - RESERVAR QUARTO
                // =========================================
                case 3:

                    if (quantidadeReservas >= MAX_RESERVAS) {

                        System.out.println("Limite de 25 reservas atingido!");

                        break;
                    }

                    System.out.print("Informe o número do quarto: ");
                    int numeroQuarto = scanner.nextInt();
                    scanner.nextLine();

                    int posQuarto = -1;

                    // Procurar o quarto
                    for (int i = 0; i < quantidadeQuartos; i++) {

                        if (quartos[i] == numeroQuarto) {

                            posQuarto = i;
                            break;
                        }
                    }

                    // Quarto não existe
                    if (posQuarto == -1) {

                        System.out.println("Este quarto não existe!");

                    } else {

                        // Verificar camas
                        if (camas[posQuarto] <= 0) {

                            System.out.println(
                                "Não há camas disponíveis neste quarto!"
                            );

                        } else {

                            System.out.print("Informe o nome do hóspede: ");
                            String nomeHospede = scanner.nextLine();

                            // Registrar reserva
                            hospedes[quantidadeReservas] = nomeHospede;
                            reservasQuarto[quantidadeReservas] = numeroQuarto;

                            // Diminuir uma cama
                            camas[posQuarto]--;

                            // Aumentar quantidade de reservas
                            quantidadeReservas++;

                            System.out.println(
                                "Reserva realizada com sucesso!"
                            );
                        }
                    }

                    break;


                // =========================================
                // 4 - CONSULTAR RESERVAS POR QUARTO
                // =========================================
                case 4:

                    System.out.print("Informe o número do quarto: ");
                    int quartoConsulta = scanner.nextInt();
                    scanner.nextLine();

                    int posConsulta = -1;

                    // Verificar se o quarto existe
                    for (int i = 0; i < quantidadeQuartos; i++) {

                        if (quartos[i] == quartoConsulta) {

                            posConsulta = i;
                            break;
                        }
                    }

                    if (posConsulta == -1) {

                        System.out.println("Este quarto não existe!");

                    } else {

                        boolean encontrou = false;

                        System.out.println("\nHóspedes do quarto " + quartoConsulta + ":");

                        for (int i = 0; i < quantidadeReservas; i++) {

                            if (reservasQuarto[i] == quartoConsulta) {

                                System.out.println("- " + hospedes[i]);

                                encontrou = true;
                            }
                        }

                        if (!encontrou) {

                            System.out.println(
                                "Não há reservas para este quarto!"
                            );
                        }
                    }

                    break;


                // =========================================
                // 5 - CONSULTAR RESERVAS POR HÓSPEDE
                // =========================================
                case 5:

                    System.out.print("Informe o nome do hóspede: ");
                    String nomeConsulta = scanner.nextLine();

                    boolean encontrouHospede = false;

                    System.out.println("\nReservas de " + nomeConsulta + ":");

                    for (int i = 0; i < quantidadeReservas; i++) {

                        if (hospedes[i].equalsIgnoreCase(nomeConsulta)) {

                            System.out.println(
                                "- Quarto " + reservasQuarto[i]
                            );

                            encontrouHospede = true;
                        }
                    }

                    if (!encontrouHospede) {

                        System.out.println(
                            "Não há reservas para este hóspede!"
                        );
                    }

                    break;


                // =========================================
                // 6 - ENCERRAR
                // =========================================
                case 6:

                    System.out.println("Encerrando o sistema...");
                    break;


                // =========================================
                // OPÇÃO INVÁLIDA
                // =========================================
                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        scanner.close();
    }
}
