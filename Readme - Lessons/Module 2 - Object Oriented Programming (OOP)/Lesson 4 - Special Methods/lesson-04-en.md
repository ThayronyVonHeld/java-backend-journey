
---

# 📚 Aula 4 – Métodos Especiais (Getters, Setters e Construtores)

---

## 🎯 Objetivos da Aula

* Entender o conceito de **métodos especiais** em POO
* Compreender a função dos **getters** e **setters**
* Aprender o papel do **método construtor**
* Aplicar esses métodos em um exemplo prático em Java

---

## 🧭 Introdução

Em programação orientada a objetos, **métodos especiais** são funções que possuem **propósitos específicos e padronizados** dentro das classes.

Eles não são obrigatórios, mas são **amplamente utilizados** por convenção, porque tornam o código mais **seguro, legível e organizado**.

Nesta aula, veremos os três principais tipos de métodos especiais:

1. **Getters** → métodos acessores
2. **Setters** → métodos modificadores
3. **Construtores** → métodos que inicializam o objeto

---

## 🧱 Conceito de Métodos Especiais

Toda linguagem orientada a objeto permite criar métodos livremente, mas existem **nomes e padrões** universalmente reconhecidos — os métodos “especiais”.

Esses métodos garantem **acesso controlado aos atributos** de um objeto e **automatizam sua criação**.

Vamos entender isso com um exemplo simples.

---

## 🗄️ Exemplo Conceitual: A Estante

Imagine que você tem um objeto chamado `Estante`.

### 🔹 Atributos possíveis:

* Tamanho
* Cor
* Quantidade de prateleiras
* Modelo
* Fabricante

### 🔹 Métodos possíveis:

* `colocarDocumento()`
* `retirarDocumento()`
* `contarDocumentos()`

Agora, pense no seguinte:
Se várias pessoas usam a mesma estante, **você deixaria qualquer uma mexer diretamente nos documentos de todas as outras?**

Provavelmente não.
Na vida real, criamos **mecanismos de proteção** — e em POO isso também acontece.

---

## 🔑 Métodos Acessores (Getters)

Os **getters** são métodos que **acessam um atributo de forma segura**.

Eles permitem **consultar informações** de um objeto **sem alterar seu estado interno**.

📘 *Em inglês, “get” significa “pegar” ou “obter”.*

### 📦 Analogia:

Pense em um **caixa eletrônico**.
Você não abre o cofre do banco para ver seu saldo — você **pede a informação** através de uma interface segura.

---

### 💡 Exemplo Conceitual:

A estante tem um atributo `totDoc` (total de documentos).
Quer saber quantos documentos há?

Em vez de acessar diretamente `e.totDoc`, você usa o método:

```java
e.getTotDoc();
```

Assim, **você consulta o valor de forma controlada**, sem modificar nada indevidamente.

---

## 🛠️ Métodos Modificadores (Setters)

Os **setters** servem para **modificar um atributo com segurança**.
Eles controlam *como* e *quando* o valor de um atributo é alterado.

📘 *Em inglês, “set” significa “definir” ou “atribuir”.*

### 📦 Analogia:

No mesmo exemplo da estante, você quer **adicionar um documento**.
Você **não vai lá e coloca direto** — entrega o documento ao funcionário responsável.

Esse “funcionário” é o **setter**.

---

### 💡 Exemplo Conceitual:

```java
e.setTotDoc(6);
```

Aqui, `setTotDoc` recebe um **parâmetro** (6) e **atualiza** o valor do atributo internamente.

Dessa forma, você garante que **nenhum atributo seja modificado de forma direta ou incorreta.**

---

## 🧩 Resumo: Getters e Setters

| Tipo        | Nome                 | Função                      | Recebe Parâmetro? |
| ----------- | -------------------- | --------------------------- | ----------------- |
| Acessor     | `getAtributo()`      | Retorna o valor do atributo | ❌ Não             |
| Modificador | `setAtributo(valor)` | Altera o valor do atributo  | ✅ Sim             |

---

## 💡 Exemplo com a Classe Caneta

Vamos simplificar nossa classe `Caneta` para dois atributos:
`modelo` (público) e `ponta` (privado).

```
+---------------------+
|       Caneta        |
+---------------------+
| + modelo            |
| - ponta             |
+---------------------+
| + getModelo()       |
| + setModelo(m)      |
| + getPonta()        |
| + setPonta(p)       |
+---------------------+
```

---

## 🧩 Pseudocódigo

```algoritmo
classe Caneta
  publico modelo : caractere
  privado ponta : real

  publico método getModelo()
    retorne modelo
  fim método

  publico método setModelo(m : caractere)
    modelo = m
  fim método

  publico método getPonta()
    retorne ponta
  fim método

  publico método setPonta(p : real)
    ponta = p
  fim método
fim classe
```

---

## 💻 Código Java Completo

### Classe Caneta

```java
package oop.Lesson4.Caneta;

public class Caneta {
    public String modelo;   // Público
    private float ponta;    // Privado

    // GETTER do modelo
    public String getModelo() {
        return this.modelo;
    }

    // SETTER do modelo
    public void setModelo(String m) {
        this.modelo = m;
    }

    // GETTER da ponta
    public float getPonta() {
        return this.ponta;
    }

    // SETTER da ponta
    public void setPonta(float p) {
        this.ponta = p;
    }
}
```

---

### Classe Principal (Main)

```java
package oop.Lesson4.Caneta;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.setModelo("Bic Cristal");
        c1.setPonta(0.5f);

        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ponta: " + c1.getPonta());
    }
}
```

🧠 **Saída esperada:**

```
Modelo: Bic Cristal
Ponta: 0.5
```

---

## 🏗️ Método Construtor

O **construtor** é um método especial que é **executado automaticamente** sempre que um novo objeto é criado.

📘 *Em inglês, “constructor” vem de “construir” — ele monta o objeto inicial.*

---

### ⚙️ Função do Construtor

1. **Inicializa os atributos automaticamente**
2. **Define valores padrão**
3. **Pode receber parâmetros para personalização**

---

### 💡 Exemplo 1 – Construtor Simples

Toda caneta criada começa **tampada** e **azul**:

```java
public Caneta() {
    this.cor = "Azul";
    this.tampar();
}
```

---

### 💡 Exemplo 2 – Construtor com Parâmetros

```java
public Caneta(String m, String c, float p) {
    this.setModelo(m);
    this.setCor(c);
    this.setPonta(p);
    this.tampar();
}
```

Agora podemos criar canetas diferentes com uma única linha:

```java
Caneta c1 = new Caneta("Bic", "Azul", 0.5f);
Caneta c2 = new Caneta("Faber-Castell", "Vermelha", 0.7f);
```

---

## 🧠 Resumo Final

| Tipo de Método | Nome                 | Função                     | Executado Automaticamente? |
| -------------- | -------------------- | -------------------------- | -------------------------- |
| Getter         | `getAtributo()`      | Retorna valor do atributo  | ❌                          |
| Setter         | `setAtributo(valor)` | Modifica valor do atributo | ❌                          |
| Construtor     | `Classe()`           | Inicializa o objeto        | ✅                          |

---

## 🧩 Diagrama UML Final

```
+---------------------+
|      Caneta         |
+---------------------+
| + modelo : String   |
| - ponta : float     |
+---------------------+
| + getModelo()       |
| + setModelo(m)      |
| + getPonta()        |
| + setPonta(p)       |
| + Caneta()          |
+---------------------+
```

---

## 🚀 Exercícios Práticos

### 🧠 Exercício 1 – Criando Getters e Setters

```java
// Crie uma classe "Livro" com os atributos:
// título, autor e número de páginas.
// Gere os métodos getters e setters para cada atributo.
```

### 🧩 Exercício 2 – Construtor com Parâmetros

```java
// Modifique a classe "Livro" para ter um construtor
// que receba título, autor e número de páginas.
// Depois, crie 2 objetos diferentes usando esse construtor.
```

### 🧱 Exercício 3 – Acesso Seguro

```java
// Teste o acesso direto aos atributos privados
// e compare com o uso dos métodos getters e setters.
```

---

> 💡 **Dica:** “Pense nos getters e setters como os seguranças do seu código.
> O getter te deixa *ver* o que há dentro; o setter te deixa *mudar*, mas só da forma certa.
> E o construtor? Ele é o *porteiro*, que garante que todo objeto entre já configurado e pronto pra uso.”

---
