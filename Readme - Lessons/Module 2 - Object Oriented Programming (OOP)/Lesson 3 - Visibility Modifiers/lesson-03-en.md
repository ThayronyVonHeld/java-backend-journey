
---

# 📚 Aula 3 – Modificadores de Visibilidade

---

## 🎯 Objetivos da Aula

* Compreender o conceito de visibilidade em POO
* Identificar os tipos de modificadores de acesso
* Entender como eles protegem os dados de uma classe
* Relacionar os conceitos de visibilidade com exemplos práticos
* Aplicar os modificadores em código Java

---

## 🧭 Introdução

A **visibilidade** é uma das grandes essências da Programação Orientada a Objetos.
Ela define **quem pode acessar** os atributos e métodos de uma classe, garantindo **segurança e organização** no código.

Antes de falarmos sobre os modificadores de visibilidade, vamos entender rapidamente um recurso muito usado na modelagem de sistemas: a **UML (Unified Modeling Language)**.

---

## 🧩 UML – Linguagem de Modelagem Unificada

A **UML** é uma linguagem padronizada usada para **visualizar, especificar, construir e documentar** sistemas de software.

Entre seus vários diagramas, o mais famoso (e o que nos interessa agora) é o **diagrama de classes**.

---

## 🏗️ Diagrama de Classes

O **diagrama de classes** é uma forma simples de **representar visualmente uma classe e seus elementos**.

Por exemplo, se pegarmos a classe `Caneta` (vista na aula anterior), podemos representá-la assim:

```
+---------------------+
|      Caneta         |   ← Nome da Classe
+---------------------+
| modelo              |   ← Atributos
| cor                 |
| carga               |
| ponta               |
| tampada             |
+---------------------+
| escrever()          |   ← Métodos
| rabiscar()          |
| pintar()            |
| tampar()            |
| destampar()         |
+---------------------+
```

Perceba que:

* A **classe** é o título no topo, iniciando com **letra maiúscula**.
* Os **atributos** e **métodos** começam com **letra minúscula**.
* Os **métodos** possuem **parênteses `()`**, indicando ações.

Esse diagrama ajuda a **visualizar rapidamente** o que uma classe possui e o que ela pode fazer.

---

## 🔒 O que são Modificadores de Visibilidade?

Os **modificadores de visibilidade** indicam **quem pode acessar** os **atributos e métodos** de uma classe.
Eles servem para **proteger os dados** e **controlar o acesso** a determinadas partes do código.

Na **UML**, usamos os seguintes símbolos:

| Símbolo | Modificador   | Descrição                                   |
| ------- | ------------- | ------------------------------------------- |
| `+`     | **public**    | Acesso livre (qualquer classe pode acessar) |
| `-`     | **private**   | Acesso restrito à própria classe            |
| `#`     | **protected** | Acesso permitido à classe e suas subclasses |

---

## ☎️ Analogias Simples

Vamos entender cada tipo com exemplos do mundo real:

### **Public (+)**

Pense em um **telefone público** (“orelhão”).
Qualquer pessoa pode usá-lo — ele é **acessível a todos**.

➡️ Em POO: **qualquer classe** pode acessar esse atributo ou método.

---

### **Private (-)**

Agora pense em um **celular pessoal**.
Apenas o dono pode usá-lo — e ainda coloca senha para garantir a privacidade.

➡️ Em POO: **somente a própria classe** pode acessar ou modificar.

---

### **Protected (#)**

Imagine um **telefone corporativo**.
Somente os **funcionários da empresa** podem usar — não é público, mas também não é exclusivo de uma pessoa.

➡️ Em POO: **a classe e suas subclasses** podem acessar.

---

## 🎮 Exemplo Prático: Controle Remoto

Pense em um **controle remoto**:

* Os **botões externos** (ligar, volume, canal) → **públicos**, pois o usuário precisa usá-los.
* Os **circuitos internos** → **privados**, protegidos pela carcaça.
* O **LED infravermelho** → **protegido**, pois se comunica com a TV, mas não está acessível a qualquer pessoa.

Essa “**cápsula de proteção**” que separa o que é público do que é privado é chamada de **encapsulamento** (veremos mais sobre isso na próxima aula).

---

## 💡 Relembrando

| Modificador | Quem pode acessar?    | Exemplo             |
| ----------- | --------------------- | ------------------- |
| `public`    | Qualquer classe       | Telefone público    |
| `private`   | Apenas a classe atual | Celular pessoal     |
| `protected` | Classe + Subclasses   | Telefone da empresa |

---

## 🧱 Exemplo em UML

```
+---------------------+
|      Caneta         |
+---------------------+
| + modelo            |
| + cor               |
| - carga             |
| # ponta             |
| # tampada           |
+---------------------+
| + escrever()        |
| + rabiscar()        |
| + pintar()          |
| - tampar()          |
| - destampar()       |
+---------------------+
```

---

## 🧩 Exemplo em Pseudocódigo

```algoritmo
classe Caneta
  publico modelo : caractere
  publico cor : caractere
  protegido ponta : real
  privado carga : inteiro
  protegido tampada : lógico

  publico método escrever()
  fim método

  publico método rabiscar()
  fim método

  publico método pintar()
  fim método

  privado método tampar()
  fim método

  privado método destampar()
  fim método
fim classe
```

---

## ⚙️ Criando um Objeto

```algoritmo
c1 = nova Caneta
c1.modelo = "BIC Cristal"   // OK → público
c1.cor = "Azul"             // OK → público
c1.ponta = 0.5              // ❌ ERRO → protegido
c1.carga = 50               // ❌ ERRO → privado
c1.tampada = verdadeiro     // ❌ ERRO → protegido

c1.escrever()   // OK → público
c1.rabiscar()   // OK → público
c1.tampar()     // ❌ ERRO → método privado
```

---

## 💻 Aplicando em Java

### Classe `Caneta.java`

```java
package oop.lesson3.caneta;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro! Não posso rabiscar.");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
```

---

### Classe Principal `Main.java`

```java
package oop.lesson3.caneta;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;  // ❌ ERRO: atributo privado
        c1.carga = 50;       // OK: atributo protegido (mesmo pacote)
        // c1.tampada = false; // ❌ ERRO: atributo privado
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
```

---

## 🧠 Conclusão

Os **modificadores de visibilidade** são fundamentais para proteger os dados de uma classe e **controlar o acesso externo**.
Eles fazem parte do conceito de **encapsulamento**, que veremos com mais profundidade na **Aula 4**.

> 💬 “Definir a visibilidade corretamente é o primeiro passo para escrever código seguro, organizado e fácil de manter.”

---