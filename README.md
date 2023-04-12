# Calendário em Java

Este projeto é uma implementação simples de um calendário em Java feita como parte de uma atividade na disciplina de Validação, Verificação e Teste de Software do curso de Engenharia de Software - UFMS.

**O objetivo da atividade era criar casos de teste para os métodos da classe Cal utilizando o framework de testes JUnit.**

## Como funciona?

A classe `Cal` tem vários métodos úteis para trabalhar com calendários, incluindo:

- `firstOfMonth(int month, int year)`: retorna o dia da semana (0 = domingo, 1 = segunda-feira, etc.) do primeiro dia de um determinado mês e ano.
- `numberOfDays(int month, int year)`: retorna o número de dias em um determinado mês e ano.
- `isLeap(int year)`: verifica se um determinado ano é bissexto ou não.
- `cal(int month, int year)`: gera e retorna uma representação em String do calendário completo de um determinado mês e ano.
- `jan1(int year)`: retorna o dia da semana (0 = domingo, 1 = segunda-feira, etc.) do primeiro dia de janeiro de um determinado ano.

## Testes com JUnit

Os testes foram desenvolvidos utilizando o JUnit. A classe de teste `CalTest` inclui testes para cada um dos métodos da classe `Cal`, bem como alguns casos de erro e exceções.

Para executar os testes, basta rodar o seguinte comando Maven na raiz do projeto:

```bash
mvn test
```
Isso irá compilar o projeto e executar todos os testes definidos na classe `CalTest`. Os resultados dos testes serão exibidos no terminal.

Se você não tiver o Maven instalado em sua máquina, pode compilar e executar os testes manualmente utilizando os seguintes comandos na raiz do projeto:

```bash
javac -cp .:junit-platform-console-standalone-1.6.2.jar com/cal/CalTest.java com/cal/Cal.java
java -jar junit-platform-console-standalone-1.6.2.jar --class-path . --scan-class-path
```
Isso irá compilar a classe de teste e a classe que está sendo testada e executar todos os testes definidos na classe `CalTest`.

## Requisitos

Para compilar e executar este projeto, você precisa ter o Java JDK instalado na sua máquina, bem como o Apache Maven para executar os testes automaticamente.

## Como executar o projeto

Para executar o projeto, basta rodar o seguinte comando Maven na raiz do projeto:

```bash
mvn exec:java -Dexec.mainClass="com.cal.App"
```

Isso irá compilar o projeto e executar o método principal da classe `App`, que inclui um exemplo simples de uso da classe `Cal`. O resultado será exibido no terminal.

Você também pode compilar e executar o projeto manualmente utilizando os seguintes comandos na raiz do projeto:

```bash
javac com/cal/App.java com/cal/Cal.java
java com.cal.App
```