import entites.ExercicioConversorDolar.Conversor;
import entites.Funcionario;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Conversor conversor = new Conversor();

    System.out.println("What is the dollar price?");
    conversor.setCotacao(sc.nextDouble());

    System.out.println("How many dollars will be bought?");
    conversor.setValor(sc.nextDouble());

    System.out.println("Amount to be paid in reais = " + conversor.converter(conversor.getValor(), conversor.getCotacao()));
    sc.close();
  }
}