import java.util.Scanner;

public class SistemaRestaurante {

    private int carne = 0;
    private int frango = 0;
    private int porco = 0;
    private int peixe = 0;
    private int entregadores = 20;
    private int semana1 = 26;
    private int semana2 = 15;
    private int semana3 = 12;
    private int semana4 = 38;
    private int semana5 = 0;

    public void iniciar() {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\nEscolha uma opção");
            System.out.println("1 - Pedidos");
            System.out.println("2 - Disponibilidade de entregadores");
            System.out.println("3 - Checar marmitas doadas na semana");
            System.out.println("4 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nPedidos atuais:");
                    System.out.println("Carne: " + carne);
                    System.out.println("Frango: " + frango);
                    System.out.println("Peixe: " + peixe);
                    System.out.println("Porco: " + porco);

                    System.out.println("\nDeseja adicionar mais uma marmita?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");

                    int adicionar = sc.nextInt();

                    if (adicionar == 1) {

                        if (entregadores <= 0) {
                            System.out.println("Não há entregadores disponíveis para novos pedidos.");
                            break; 
                        }

                        System.out.println("\nQual tipo deseja adicionar?");
                        System.out.println("1 - Carne");
                        System.out.println("2 - Frango");
                        System.out.println("3 - Peixe");
                        System.out.println("4 - Porco");

                        int tipoMarmita = sc.nextInt();

                        System.out.println("Quantas unidades deseja adicionar?");
                        int quantidade = sc.nextInt();

                    
                        if (quantidade > entregadores) {
                            System.out.println("Erro! Você pediu " + quantidade + " marmita(s), mas só temos " + entregadores + " entregador(es) disponível(is).");
                            break; // Cancela a operação e volta ao menu do restaurante
                        }

                        switch (tipoMarmita) {

                            case 1:
                                carne += quantidade;
                                entregadores -= quantidade; // Subtrai a quantidade real pedida
                                System.out.println(quantidade + " marmita(s) de Carne adicionada(s)!");
                                break;

                            case 2:
                                frango += quantidade;
                                entregadores -= quantidade; // Subtrai a quantidade real pedida
                                System.out.println(quantidade + " marmita(s) de Frango adicionada(s)!");
                                break;

                            case 3:
                                peixe += quantidade;
                                entregadores -= quantidade; // Subtrai a quantidade real pedida
                                System.out.println(quantidade + " marmita(s) de Peixe adicionada(s)!");
                                break;

                            case 4:
                                porco += quantidade;
                                entregadores -= quantidade; // Subtrai a quantidade real pedida
                                System.out.println(quantidade + " marmita(s) de Porco adicionada(s)!");
                                break;

                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }

                        System.out.println("Entregador(es) enviado(s) para a entrega.");
                        System.out.println("Entregadores restantes: " + entregadores);

                    } else {
                        System.out.println("Voltando ao menu principal do restaurante...");
                    }
                    break;

                case 2:
                    System.out.println("\nEntregadores disponíveis: " + entregadores);
                    break;

                case 3:
                    System.out.println("\nDoações semanais:");
                    System.out.println("Semana 1: " + semana1);
                    System.out.println("Semana 2: " + semana2);
                    System.out.println("Semana 3: " + semana3);
                    System.out.println("Semana 4: " + semana4);
                    System.out.println("Semana Atual: " + semana5);
                    break;

                case 4:
                    System.out.println("Saindo do menu do restaurante...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}