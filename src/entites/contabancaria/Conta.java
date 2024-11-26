package entites.contabancaria;

public class Conta {
  private String nome;
  private Long numeroConta;
  private Double saldo;
  private String i;

  private Double valor;

  public Conta() {
  }


  public Conta(String nome, Long numeroConta) {
    this.nome = nome;
    this.numeroConta = numeroConta;
  }

  public void sacar(Double valor) {
    this.saldo = this.saldo - valor - 5.0;
  }
  public void depositar(Double valor) {
    this.saldo += valor;
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Long getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(Long numeroConta) {
    this.numeroConta = numeroConta;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }
  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

}
