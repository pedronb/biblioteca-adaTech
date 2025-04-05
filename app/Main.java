//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// TODO acentuar as palavras porque nao configurei meu teclado :P
import dao.BancoDeDadosSimulado;
import services.GerenciadorDeLivros;
import services.Menu;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // TODO adicionar try catch
    //
    Scanner scanner = new Scanner(System.in);
    var bibliotecaCompleta = new BancoDeDadosSimulado();
    var gerenciadorLivros = new GerenciadorDeLivros();

    int idLivrosAtual = 1;
    int idCategoriaAtual = 1;
    int idAutorAtual = 1;
    boolean parar = false;
    Menu menus = new Menu();

    do {
      // TODO pensar melhor em limpar o console:
      // se ele mostra os livros e depois limpa o console nao vai mostrar nada!!! (QUE
      // BURRO, Da zero pra ele...)
      // menus.ClearConsole();

      var escolha = menus.MenuPrincipal();

      switch (escolha) {
        case 1: // Listar livros
          for (var livro : bibliotecaCompleta.biblioteca) {
            System.out.println(livro.toString());
          }
          break;

        case 2: // Adicionar Livros
          bibliotecaCompleta.biblioteca.add(gerenciadorLivros.Adicionar(idLivrosAtual, idAutorAtual, idCategoriaAtual));
          break;

        case 3:
          break;

        case 4:
          break;

        case 5:
          break;

        case 6: // Encerrar o sistema
          parar = true;
          System.out.println("Encerrando o sistema...");
          break;
        default:
          System.out.println("Opcao invalida");
      }
    } while (!parar);

    System.out.println("Sistema encerrado com sucesso.");
  }
}
