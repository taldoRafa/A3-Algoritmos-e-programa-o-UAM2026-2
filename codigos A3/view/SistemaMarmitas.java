import java.util.Scanner;

public class SistemaMarmitas {

    public void iniciar(){

        Scanner sc = new Scanner(System.in);

        int carne = 10;
        int frango = 10;
        int porco = 10;
        int peixe = 10;

        int opcaoPrincipal = 0;

        while (opcaoPrincipal != 2) {

            System.out.println("\n=== SISTEMA MARMITAS ===");
            System.out.println("1 - Restaurante");
            System.out.println("2 - Sair");

            opcaoPrincipal = sc.nextInt();

            switch (opcaoPrincipal) {

                case 1:

                    LoginBase r = new ListaR();
                    r.carregar();

                    int tentativas = 4;
                    boolean acessoPermitido = false;

                    System.out.println("\n=== LOGIN ===");

                    while (tentativas > 0 && !acessoPermitido) {

                        System.out.print("Digite o Email: ");
                        String emailDigitado = sc.next();

                        System.out.print("Digite a Senha: ");
                        String senhaDigitada = sc.next();

                        if (r.autenticar(emailDigitado, senhaDigitada)) {

                            acessoPermitido = true;

                            System.out.println("\nLogin realizado com sucesso!");

                            int opcaoRestaurante = 0;

                            while (opcaoRestaurante != 5) {

                                System.out.println("\n=== MENU RESTAURANTE ===");
                                System.out.println("1 - Armazém de marmitas");
                                System.out.println("2 - Saídas para distribuidora");
                                System.out.println("3 - Cardápio");
                                System.out.println("4 - Pedir marmita");
                                System.out.println("5 - Sair");

                                opcaoRestaurante = sc.nextInt();

                                switch (opcaoRestaurante) {

                                    case 1:

                                        System.out.println("\n=== ESTOQUE ===");
                                        System.out.println("Carne: " + carne);
                                        System.out.println("Frango: " + frango);
                                        System.out.println("Peixe: " + peixe);
                                        System.out.println("Porco: " + porco);

                                        break;

                                    case 2:

                                        System.out.println("\nQual marmita saiu?");
                                        System.out.println("1 - Carne");
                                        System.out.println("2 - Frango");
                                        System.out.println("3 - Peixe");
                                        System.out.println("4 - Porco");

                                        int tipo = sc.nextInt();

                                        System.out.println("Quantas saíram?");
                                        int saiu = sc.nextInt();

                                        switch (tipo) {

                                            case 1:

                                                if (saiu <= carne) {

                                                    carne -= saiu;
                                                    System.out.println("Saída registrada!");

                                                } else {

                                                    System.out.println("Estoque insuficiente!");
                                                }

                                                break;

                                            case 2:

                                                if (saiu <= frango) {

                                                    frango -= saiu;
                                                    System.out.println("Saída registrada!");

                                                } else {

                                                    System.out.println("Estoque insuficiente!");
                                                }

                                                break;

                                            case 3:

                                                if (saiu <= peixe) {

                                                    peixe -= saiu;
                                                    System.out.println("Saída registrada!");

                                                } else {

                                                    System.out.println("Estoque insuficiente!");
                                                }

                                                break;

                                            case 4:

                                                if (saiu <= porco) {

                                                    porco -= saiu;
                                                    System.out.println("Saída registrada!");

                                                } else {

                                                    System.out.println("Estoque insuficiente!");
                                                }

                                                break;

                                            default:
                                                System.out.println("Tipo inválido");
                                        }

                                        break;

                                    case 3:

                                        System.out.println("\n=== CARDÁPIO ===");
                                        System.out.println("Carne (" + carne + ")");
                                        System.out.println("Frango (" + frango + ")");
                                        System.out.println("Peixe (" + peixe + ")");
                                        System.out.println("Porco (" + porco + ")");

                                        break;

                                    case 4:

                                        System.out.println("\nEscolha a marmita:");
                                        System.out.println("1 - Carne");
                                        System.out.println("2 - Frango");
                                        System.out.println("3 - Peixe");
                                        System.out.println("4 - Porco");

                                        int escolha = sc.nextInt();

                                        switch (escolha) {

                                            case 1:

                                                if (carne > 0) {

                                                    carne--;
                                                    System.out.println("Marmita de carne pedida!");

                                                } else {

                                                    System.out.println("Sem estoque!");
                                                }

                                                break;

                                            case 2:

                                                if (frango > 0) {

                                                    frango--;
                                                    System.out.println("Marmita de frango pedida!");

                                                } else {

                                                    System.out.println("Sem estoque!");
                                                }

                                                break;

                                            case 3:

                                                if (peixe > 0) {

                                                    peixe--;
                                                    System.out.println("Marmita de peixe pedida!");

                                                } else {

                                                    System.out.println("Sem estoque!");
                                                }

                                                break;

                                            case 4:

                                                if (porco > 0) {

                                                    porco--;
                                                    System.out.println("Marmita de porco pedida!");

                                                } else {

                                                    System.out.println("Sem estoque!");
                                                }

                                                break;

                                            default:
                                                System.out.println("Opção inválida");
                                        }

                                        break;

                                    case 5:

                                        System.out.println("Saindo do restaurante...");
                                        break;

                                    default:

                                        System.out.println("Opção inválida");
                                }
                            }

                        } else {

                            tentativas--;

                            if (tentativas > 0) {

                                System.out.println("\nEmail ou senha inválidos!");
                                System.out.println("Tentativas restantes: " + tentativas);

                            } else {

                                System.out.println("\nAcesso bloqueado!");
                            }
                        }
                    }

                    break;

                case 2:

                    System.out.println("Encerrando sistema...");
                    break;

                default:

                    System.out.println("Opção inválida");
            }
        }

        sc.close();
    }
}