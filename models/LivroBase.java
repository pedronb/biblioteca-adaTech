import interfaces.ILivros;

public abstract class LivroBase implements ILivros {
  public int Id;
  public String Titulo;
  // inicialmente vamos aceitar que existe apenas 1 Autor por Livro
  public Autor Autor;
  // inicialmente vamos aceitar que existe apenas 1 Categoria por Livro
  public Categoria Categoria;
  // inicialmente todo Livro cadastrado esta disponivel para emprestimo
  public boolean Emprestado = false;

  public LivroBase(int id, String titulo, Autor autor, Categoria categoria) {
    Id = id;
    Titulo = titulo;
    Autor = autor;
    Categoria = categoria;
    // sempre que adicionar um livro por padrao nao esta emprestado
    Emprestado = false;
  }

}
