package entites.ExercicioConversorDolar;

public  class Conversor {
  double valor;
  double cotacao;

  public double converter(double valor, double cotacao) {
    return valor * cotacao;
  }

  public double getCotacao() {
    return cotacao;
  }

  public double getValor() {
    return valor;
  }

  public void setCotacao(double cotacao) {
    this.cotacao = cotacao;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}