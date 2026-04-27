import java.util.ArrayList;
import java.util.Scanner;

public class HistoricoDeRegistrosSenha {

  private ArrayList<String> senhas = new ArrayList<>();

  public void carregar() {

    senhas.add("1234a");
    senhas.add("1234b");
    senhas.add("1234c");
    senhas.add("1234d");
    senhas.add("1234e");
  }

  public void exibir() {

    for (String senha : senhas) {
      System.out.println("senha " + senha);
    }
  }

  public void adicionar() {

    Scanner sc = new Scanner(System.in);

    System.out.println("adicione nova senha: ");

    String novoSenha = sc.next();
    senhas.add(novoSenha);

    sc.close();
  }

  public String concatenar() {
    String concatenado = String.join(",", senhas);
    
    return concatenado;
  }
}
