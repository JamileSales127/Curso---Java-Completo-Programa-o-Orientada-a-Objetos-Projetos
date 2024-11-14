package entites;

public class Funcionario {

  public String nome;
  public Double salario;
  public Double tax;

  public Double salarioLiquido() {
    return salario - tax;
  }


}
