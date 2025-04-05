package models;

public class Revista extends LivroBase {

  // TODO colocar tudo privado e criar get and set para as propriedades

  // código para publicações seriadas
  public String ISSN;

  // TODO: remover autor porque revista nao tem autor
  public Revista(int id, String titulo, Autor autor, Categoria categoria, String issn) {
    super(id, titulo, autor, categoria);

    this.ISSN = issn;
  }

  // TODO: incompleto apenas para ver o que aparece
  @Override
  public String toString() {
    return "Livro {"
        + " id=" + this.Id
        + ", issn=" + this.ISSN
        + ", titulo=" + this.Titulo
        + " }";
  }

}
