public abstract class Livro extends LivroBase {
  public String ISBN;

  public Livro(int id, String titulo, Autor autor, Categoria categoria, String isbn) {
    super(id, titulo, autor, categoria);

    this.ISBN = isbn;
  }

  // incompleto apenas para ver o que aparece
  @Override
  public String toString() {
    return "Livro {"
        + " id=" + this.Id
        + ", isbn=" + this.ISBN
        + ", titulo=" + this.Titulo
        + ", emprestado=" + this.Emprestado
        + " }";
  }

}
