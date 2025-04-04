public class Autor {

  // TODO colocar tudo privado e criar get and set para as propriedades

  public int Id;
  public String Nome;
  // todo livro acrescentado na biblioteca do autor acrescentamos 1
  public int Publicacoes;

  public Autor(int id, String nome, int publicacoes) {
    Id = id;
    Nome = nome;
    Publicacoes = publicacoes;
  }

}
