import java.util.Scanner;

public class SistemaRestaurante {
    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        int carne = 0;
        int frango = 0;
        int porco = 0;
        int peixe = 0;
        int opcao = 0;
        int entregadores = 20;
        //As semanas estão definidas prontas só para mostrar como funciona
        int semana1 = 26;
        int semana2 = 15;
        int semana3 = 12;
        int semana4 = 38;
        int semana5 = 0;

        while (opcao != 4) {

        System.out.println("Escolha uma opção ");
        System.out.println("1 - Pedidos ");
        System.out.println("2 - Disponibilidade de entregadores ");
        System.out.println("3 - Checar marmitas doadas na semana ");
        System.out.println("4 - Sair");

        opcao = sc.nextInt();

        //Referente a opção 1
        switch (opcao) {
            case 1:
    //Mostra o status atual dos pedidos
    System.out.println("Pedidos atuais:");
    System.out.println("Carne: " + carne);
    System.out.println("Frango: " + frango);
    System.out.println("Peixe: " + peixe);
    System.out.println("Porco: " + porco);
    
    //Pergunta se deseja adicionar mais
    System.out.println("Deseja adicionar mais uma marmita? (1 - Sim / 2 - Não)");
    int adicionar = sc.nextInt();
    
    if (adicionar == 1) {
        //Pergunta o tipo de marmita
        System.out.println("Qual tipo deseja adicionar? (1 - Carne / 2 - Frango / 3 - Peixe / 4 - Porco)");
        int tipoMarmita = sc.nextInt();
        
        //Pergunta quantas dessa marmita
        System.out.println("Quantas unidades deseja adicionar?");
        int quantidade = sc.nextInt();
        
        //Atualiza o sistema
        switch (tipoMarmita) {
            case 1:
                carne += quantidade;
                System.out.println(quantidade + " marmita(s) de Carne adicionada(s)!");
                break;
            case 2:
                frango += quantidade;
                System.out.println(quantidade + " marmita(s) de Frango adicionada(s)!");
                break;
            case 3:
                peixe += quantidade;
                System.out.println(quantidade + " marmita(s) de Peixe adicionada(s)!");
                break;
            case 4:
                porco += quantidade;
                System.out.println(quantidade + " marmita(s) de Porco adicionada(s)!");
                break;
            default:
                System.out.println("Opção de marmita inválida.");
                break;
        }
    } else {
        System.out.println("Voltando ao menu principal...");
    }
    
    break;

            //Referente a opção 2
            case 2:
                System.out.println("Entregadores disponíveis: " + entregadores); //Mostra quantos entregadores temos disponíveis
            break;

        //Referente a opção 3
         case 3:
            System.out.println("Doações semanais:");
            System.out.println("Semana 1: " + semana1);
            System.out.println("Semana 2: " + semana2);
            System.out.println("Semana 3: " + semana3);
            System.out.println("Semana 4: " + semana4);
            System.out.println("Semana Atual: " + semana5);

            break;

    //Saída do programa
    case 4:
        System.out.println("Saindo...");
        break;

    default:
        System.out.println("Opção inválida");
            }
        }  
        sc.close(); 
    }
}