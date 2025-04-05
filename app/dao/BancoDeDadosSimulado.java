package dao;

import models.Autor;
import models.intefaces.ILivros;

import java.util.ArrayList;


public class BancoDeDadosSimulado {
  public ArrayList<ILivros> biblioteca = new ArrayList<>();

  // nao sei se usaremos isso ou faremos direto mesmo
  public ArrayList<Autor> Autores = new ArrayList<>();
}
