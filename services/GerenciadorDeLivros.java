// Ainda nao sei como iremos usar essa classe.
//

import java.util.Scanner;

import com.sun.source.tree.ReturnTree;

import interfaces.IEmprestavel;
import interfaces.ILivros;

public class GerenciadorDeLivros implements IEmprestavel {

  Scanner sc = new Scanner(System.in);
  Menu menu = new Menu();

  @Override
  public void Emprestar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Emprestar'");
  }

  @Override
  public void DevolverEmprestimo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'DevolverEmprestimo'");
  }

  @Override
  public ILivros Adicionar(int idLivroAtual, int idCategoriaAtual, int idAutorAtual) {
    var opcao = menu.MenuTipoLivro();

    // TODO extrair para a classe menu criando funcoes
    System.out.println("Digite o titulo do livro: ");
    var titulo = sc.nextLine();

    System.out.println("Digite o Autor do livro: ");
    var autor = sc.nextLine();

    System.out.println("Digite a Categoria do livro: ");
    var categoria = sc.nextLine();

    switch (opcao) {
      case 1: // Digital
        System.out.println("Digite o ISBN do livro: ");
        var isbn = sc.nextLine();
        // TODO mudar as publicacoes
        var novoAutor = new Autor(idAutorAtual, autor, 1);
        var NovaCategoria = new Categoria(idCategoriaAtual, categoria);

        return new LivroDigital(idLivroAtual, titulo, novoAutor, NovaCategoria, isbn);
      case 2: // Fisico
        break;
      case 3: // Revista
        break;
      default: // Mais um burro usando o sistema :P
        System.out.println("DEIXA DE SER BURRO!!!");
    }

    // TODO nao devia retornar vazio mas coloquei so para resolver isso por enquanto
    return new ILivros() {
    };
  }

}
