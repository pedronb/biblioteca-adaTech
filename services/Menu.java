import java.util.Scanner;

public final class Menu {

  Scanner sc = new Scanner(System.in);

  public final int MenuPrincipal() {

    System.out.println();
    System.out.println("[1] - Listar livros");
    System.out.println("[2] - Adicionar livro");
    System.out.println("[3] - Listar livros");
    System.out.println("[4] - Listar livros");
    System.out.println("[5] - Listar livros");
    System.out.println("[6] - Encerrar programa");
    System.out.println();

    System.out.print("Escolha uma opcao: ");
    return sc.nextInt();
  }

  public final int MenuTipoLivro() {

    System.out.println();
    System.out.println("[1] - Livro Digital");
    System.out.println("[2] - Livro Fisico");
    System.out.println("[3] - Revista");
    System.out.println();

    System.out.print("Escolha uma opcao: ");
    return sc.nextInt();
  }

  public final void ClearConsole() {
    try {
      final String os = System.getProperty("os.name");

      if (os.contains("Windows")) {
        Runtime.getRuntime().exec("cls");
      } else {
        Runtime.getRuntime().exec("clear");
      }
    } catch (final Exception e) {
      System.out.println("IXXI, deu ruim!!!");
    }
  }
}
