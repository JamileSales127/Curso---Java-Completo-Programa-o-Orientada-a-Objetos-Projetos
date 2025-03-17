# Data e Hora em Java

## 1 - Introdução

### 1.1 Conceitos importantes

- **Data - [hora] local:**
  - ano-mês-dia[hora] sem fuso horário
  - [hora] opcional
- **Data-hora global:**
  - ano-mês-dia-hora com fuso horário
- **Duração:**
  - tempo decorrido entre duas datas-horas

### 1.2 Quando usar?

- **Data - [hora] local:**
  - Quando o momento exato NÃO interessa a pessoas de outro fuso horário.
  - Uso comum: sistemas de região única, Excel (cadastro de uma pessoa).
- **Data-hora global:**
  - Quando o momento exato interessa a pessoas de outro fuso horário.
  - Uso comum: sistemas multi-região, web.

### 1.3 Padrão ISO 8601:

- **Data-[hora] local:**
  - 2022-07-21
  - 2022-07-21T14:52
  - 2022-07-22T14:52:09
  - 2022-07-22T14:52:09.4073

- **Data-hora global:**
  - 2022-07-23T14:52:09Z
  - 2022-07-23T14:52:09.254935Z
  - 2022-07-23T14:52:09-03:00

## 2 - Instanciando data-hora

### 2.1 Principais tipos

- **Data-hora local**
  - `LocalDate`
  - `LocalDateTime`
- **Data-hora global**
  - `Instant`
- **Duração**
  - `Duration`
- **Outros**
  - `ZoneId`
  - `ChronoUnit`

### 2.2 Instanciação

```java
public class Main {

  public static void main(String[] args) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    LocalDate data1 = LocalDate.now();
    LocalDateTime data2 = LocalDateTime.parse("2021-08-01T00:00:00");
    Instant data3 = Instant.parse("2021-08-01T00:00:00Z");
    Instant data4 = Instant.parse("2021-08-01T00:00:26-03:00");

    LocalDate data5 = LocalDate.parse("2021-08-01", formatter);

    System.out.println("Data1: " + data1);
    System.out.println("Data2: " + data2);
    System.out.println("Data3: " + data3);
    System.out.println("Data4: " + data4);
    System.out.println("Data5: " + data5);

    System.out.println(data1);
  }
}
```
###  2.3 Formatação - convertendo data-hora para texto
```java
public class Main {

  public static void main(String[] args) {

    LocalDate data1 = LocalDate.parse("2021-08-01");
    LocalDateTime data2 = LocalDateTime.parse("2021-08-01T00:00:00");
    Instant data3 = Instant.parse("2021-08-01T00:00:00Z");

    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withZone(ZoneId.systemDefault()); // formata a data global para a data da máquina local
    DateTimeFormatter formatter4 = DateTimeFormatter.ISO_DATE_TIME;

    System.out.println("Data1: " + data1.format(formatter1));
    System.out.println("Data2: " + data2.format(formatter2));
    System.out.println("Data2: " + data2.format(formatter4));
    System.out.println("Data3: " + formatter3.format(data3));
  }
}
```

