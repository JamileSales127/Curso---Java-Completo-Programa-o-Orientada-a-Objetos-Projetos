# Exercicio de fixação

## Descrição
**Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta.**

---
### Classe Account:
```java
public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance = balance + amount;
    }

    public void withdraw(Double amount){
            validateWithdraw(amount);
            balance = balance - amount;
    }

    public void validateWithdraw(Double amount){
        if (amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if(amount > balance){
            throw new DomainException("Not enough balance");
        }
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
```
---
### Classe Main:
```java
public class Main {
    public static void main(String[] args) {
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.println("Number: ");
            ac.setNumber(sc.nextInt());
            System.out.println("Holder: ");
            ac.setHolder(sc.next());
            System.out.println("Initial balance: ");
            ac.setBalance(sc.nextDouble());
            System.out.println("Withdraw limit:");
            ac.setWithdrawLimit(sc.nextDouble());

            System.out.println("Enter amount for withdraw");
            ac.withdraw(sc.nextDouble());
            System.out.println("New balance: " + ac.getBalance());
        }catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }
}
```