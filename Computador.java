import java.util.Scanner;

public class Computador {
  private String usuario = "Usuario1";
  private String senha = "Computador1";

  public void entrar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o Usuário");
    String entradaUsuario = scanner.nextLine();

    System.out.println("Digite a senha");
    String entradaSenha = scanner.nextLine();

    while (!entradaUsuario.equals(usuario) || !entradaSenha.equals(senha)) {
      System.out.println("Usuário ou senha incorretos. Tente novamente.");

      System.out.println("Digite o Usuário");
      entradaUsuario = scanner.nextLine();

      System.out.println("Digite a senha");
      entradaSenha = scanner.nextLine();
    }

    System.out.println("Bem-vindo, " + usuario);
    System.out.println("Computador iniciando");

    scanner.close();
  }
}

