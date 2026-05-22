import java.util.Scanner;



public class SistemaMarmitas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int carne = 10;
        int frango = 10;
        int porco = 10;
        int peixe = 10;
        int opcao = 0;
       

    while (opcao != 2) {
    System.out.println("\rEscolha uma Opção\r");
    System.out.println("1 - Restaurante ");
    System.out.println("2 - Doação ");

      opcao = sc.nextInt();

    switch (opcao){

        case 1: 

       LoginBase R = new ListaR();
        R.carregar();
        int tentativas = 4;
        boolean acessoPermitido = false;

        
        System.out.println("\n=== Login ===\n");

        while (tentativas > 0 && !acessoPermitido) {

            System.out.print("\nDigite o Email: " );
            String emailDigitado = sc.next();

            System.out.print("\nDigite a Senha: " );
            String senhaDigitada = sc.next();
           
            for(Usuario U : R.LoginBase01){
            if ( U.email.equals(emailDigitado) &&  U.senha.equals(senhaDigitada)) {
                acessoPermitido = true;
                System.out.println("\n Confirmação bem sucedida, acesso autorizado.\n");

                if(true){

                    while (opcao != 5) {

                    System.out.println("Escolha uma opção ");
                    System.out.println("1 - Armazém de marmitas ");
                    System.out.println("2 - Saíram para a distribuidora ");
                    System.out.println("3 - Cardápio ");
                    System.out.println("4 - Pedir marmita para a distribuidora");
                    System.out.println("5 - Sair");

                    opcao = sc.nextInt();

                    //Referente a opção 1
                    switch (opcao) {
                        case 1:
                            System.out.println("Estoque atual:");
                            System.out.println("Carne: " +carne);
                            System.out.println("Frango: " + frango);
                            System.out.println("Peixe: " + peixe);
                            System.out.println("Porco: " + porco);
                    break;

                        //Referente a opção 2
                        case 2:
                            System.out.println("Qual marmita saiu?");
                            System.out.println("1 - Carne (" + carne + ")");
                            System.out.println("2 - Frango (" + frango + ")");
                            System.out.println("3 - Peixe (" + peixe + ")");
                            System.out.println("4 - Porco (" + porco + ")");

                            int tipo = sc.nextInt();

                            System.out.println("Quantas marmitas saíram?");
                            int saiu = sc.nextInt();

                        switch (tipo) {
                            case 1:
                            if (saiu <= carne) {
                                carne -= saiu;
                                System.out.println("Saída registrada!");
                                } else {
                                System.out.println("Estoque insuficiente de carne!");
                                }
                                break;

                            case 2:
                            if (saiu <= frango) {
                                frango -= saiu;
                                System.out.println("Saída registrada!");
                            } else {
                                System.out.println("Estoque insuficiente de frango!");
                            }
                            break;

                            case 3:
                            if (saiu <= peixe) {
                                peixe -= saiu;
                                System.out.println("Saída registrada!");
                            } else {
                                System.out.println("Estoque insuficiente de peixe!");
                            }
                            break;

                            case 4:
                            if (saiu <= porco) {
                                porco -= saiu;
                                System.out.println("Saída registrada!");
                            } else {
                                System.out.println("Estoque insuficiente de porco!");
                                }
                                break;

                            default:
                            System.out.println("Tipo inválido");
                        }
                    break;

                    //Referente a opção 2
                    case 3:
                        System.out.println("Cardápio:");
                        System.out.println("Carne ("+carne + ")");
                        System.out.println("Frango ("+frango + ")");
                        System.out.println("Peixe("+peixe + ")");
                        System.out.println("Porco("+porco + ")");
                    break;
                    //Referente a opção 4
                    case 4:
                        System.out.println("Escolha a marmita:");
                        System.out.println("1 - Carne");
                        System.out.println("2 - Frango");
                        System.out.println("3 - Peixe");
                        System.out.println("4 - Porco");
                                
                                int Escolha = sc.nextInt();
                                switch (Escolha) {
                                    case 1:
                                        if (carne > 0){
                                        carne--;
                                        System.out.println("Marmita de carne pedida!");
                                        } else{
                                            System.out.println("Sem marmita de carne");
                                        }
                                        break;
                                    case 2:
                                        if (frango > 0) {
                                            frango--;
                                            System.out.println("Marmita de frango pedida!");
                                        } else {
                                            System.out.println("Sem estoque de frango!");
                                        }
                                        break;
                                    case 3: 
                                        if (peixe > 0) {
                                            peixe--;
                                            System.out.println("Marmita de peixe pedida!");
                                        } else {
                                            System.out.println("Sem estoque de peixe!");
                                        }
                                        break;
                                    case 4:
                                        if (porco > 0) {
                                            porco--;
                                            System.out.println("Marmita de porco pedida!");
                                        } else {
                                            System.out.println("Sem estoque de porco!");
                                        }
                                        break;

                                    default: 
                                    System.out.println("Opção inválida");
                                }
                                    break;
                            //Saída do programa
                            case 5:
                            System.out.println("Saindo...");
                            break;
                            default:
                            System.out.println("Opção inválida");
                            sc.close();
                    }

                
                }

                            }

                        } else {
                            tentativas--;
                            if (tentativas > 0) {
                                System.out.println("\nSenha ou email invalidos! Tentativas restantes:\n " + tentativas);
                            } else {
                                System.out.println("\nAcesso bloqueado! Numero maximo de tentativas excedidas.\n");
                                sc.close();
                            }
                            
                        }
                         
                        } 
                    }



        

     break;

    case 2: 

    System.out.println("em desenvolvimento");
    break;
     default:
    System.out.println("Opção inválida");
    sc.close();        
    }


}
     
}

}