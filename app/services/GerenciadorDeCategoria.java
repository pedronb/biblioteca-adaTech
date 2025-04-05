package services;

import models.Categoria;

import java.util.Scanner;
// TODO utilizar o arrayList de categoria para reaproveitar as categoria

public class GerenciadorDeCategoria {

  Scanner sc = new Scanner(System.in);

  public Categoria Adicionar(int idCategoriaAtual) {
    System.out.println();
    System.out.println(" --- Adicionar Categoria ---");
    System.out.print("Digite o nome da categoria: ");
    var titulo = sc.nextLine();

    return new Categoria(idCategoriaAtual, titulo);
  }
}
