package models.intefaces;

public interface IEmprestavel {

  public void Emprestar();

  public void DevolverEmprestimo();

  public ILivros Adicionar(int idLivroAtual, int idCategoriaAtual, int idAutorAtual);

}
