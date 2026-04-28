import java.util.ArrayList;
import java.util.Scanner;

public class HistoricoDeRegistrosNome {

  private ArrayList<String> emails = new ArrayList<>();

  public void carregar() {

    emails.add("Ana.xxx@gmail");
    emails.add("Bruno.xxx@gmail");
    emails.add("Carla.xxx@gmail");
    emails.add("Danilo.xxx@gmail");
    emails.add("Arthur.xxx@gmail");
  }

  public void exibir() {

    for (String email : emails) {
      System.out.println("email " + email);
    }
  }

  public void adicionar() {

    Scanner sc = new Scanner(System.in);

    System.out.println("adicione novo email: ");

    String novoEmail = sc.next();
    emails.add(novoEmail);

    sc.close();
  }

  public String concatenar() {
    String concatenado = String.join(",", emails);
    
    return concatenado;
  }

  public ArrayList<String> getEmails() {
    return emails;
  }
}
