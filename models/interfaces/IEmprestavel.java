package interfaces;

public interface IEmprestavel {

  public void Emprestar();

  public void DevolverEmprestimo();

  public ILivros Adicionar(int idLivroAtual, int idCategoriaAtual, int idAutorAtual);

}
