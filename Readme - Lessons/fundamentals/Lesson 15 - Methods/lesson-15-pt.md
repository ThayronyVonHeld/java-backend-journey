
# 🧩 Aula 15 – Métodos

No Java, **não existe uma palavra reservada específica** para *funções* ou *procedimentos*, como em outras linguagens.
Em Java, **tudo é chamado de método**.

A diferença entre uma função e um procedimento está no **tipo de retorno**:

* Se o método **retorna um valor**, ele é uma **função**.
* Se **não retorna nada**, ele é um **procedimento**, e usamos a palavra **`void`**.

---

## 🔹 Revisando com Algoritmo

Em pseudocódigo, um **procedimento** seria algo assim:

```text
procedimento Soma(A, B: Inteiro)
var
    S: Inteiro
inicio
    S <- A + B
    Escreva(S)
fimProcedimento
```

Chamando o procedimento:

```text
Soma(5, 2)
```

Nesse caso, **o procedimento não retorna valor**, apenas executa uma ação.

---

## 🔹 Traduzindo para Java

Em Java, o mesmo procedimento ficaria assim:

```java
void soma(int a, int b) {
    int s = a + b;
    System.out.print(s);
}

soma(5, 2); // chama o procedimento
```

Simples, certo?

---

## 🔹 Entendendo o `main`

Todo programa Java começa executando o método `main`:

```java
public static void main(String[] args) {
```

O `main` é um **método** que:

* é **público** (`public`);
* é **estático** (`static`);
* **não retorna valor** (`void`);
* recebe um **vetor de Strings** como parâmetro (`String[] args`).

Ou seja, o método `main` é o ponto de partida do programa.

---

## 🔹 Exemplo prático

```java
public class TesteProcedimento {

    void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é: " + s);
    }

    public static void main(String[] args) {
        soma(5, 2);
    }
}
```

⚠️ Esse código gera **erro**, pois o método `soma` **não é estático**, enquanto o `main` **é**.
Um método `static` pertence à **classe**, e não a uma **instância (objeto)**.

---

## 🔹 Corrigindo com `static`

```java
public class TesteProcedimento {

    static void soma(int a, int b) { // adicionamos 'static'
        int s = a + b;
        System.out.println("A soma é: " + s);
    }

    public static void main(String[] args) {
        soma(5, 2);
    }
}
```

Quando colocamos `static`, o método passa a ser acessível **sem precisar criar um objeto da classe**.

> 💡 O método `main` sempre é executado primeiro — ele é o ponto de entrada do programa.

---

## 🔹 Agora, as Funções!

Em pseudocódigo:

```text
funcao Soma(A, B: Inteiro): Inteiro
var
    S: Inteiro
inicio
    S <- A + B
    retorne S
fimFuncao

sm <- Soma(5, 2)
```

Aqui temos um **retorno** (`retorne S`) e o tipo de retorno é `Inteiro`.

---

## 🔹 Traduzindo para Java

```java
int soma(int a, int b) {
    int s = a + b;
    return s;
}

int sm = soma(5, 2);
```

A diferença é simples:

* Se usa `void` → não há retorno.
* Se usa um tipo (`int`, `String`, `double`, etc.) → há retorno.

---

## 🔹 Exemplo prático

```java
public class TesteFuncao {

    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        int sm = soma(5, 2);
        System.out.println("A soma vale: " + sm);
    }
}
```

O `static` ainda é necessário porque estamos chamando a função dentro do `main`, que também é `static`.

> 🔸 Em outros contextos, o `static` pode não ser necessário, dependendo da estrutura do programa.

---

## 🔹 Usando Métodos em Outras Classes

Podemos criar um método em uma classe separada e chamá-lo em outra.

### Classe `Operacoes.java`

```java
package fundamentals.Lesson15.TestandoClasses;

public class Operacoes {
    public static String contador(int i, int f) {
        String s = "";
        for (int c = i; c <= f; c++) {
            s += c + " ";
        }
        return s;
    }
}
```

### Classe `TesteFuncao.java`

```java
package fundamentals.Lesson15.TestandoClasses;

public class TesteFuncao {
    public static void main(String[] args) {
        System.out.println("Vai começar a contagem...");
        System.out.println(Operacoes.contador(1, 5));
    }
}
```

Repare que usamos:

```java
Operacoes.contador(1, 5);
```

Ou seja, **nome da classe + ponto + nome do método**.

---

## 🔹 Modificadores de Acesso

* `public` → o método pode ser acessado por qualquer classe.
* `private` → o método só pode ser acessado dentro da própria classe.
* `protected` → o método pode ser acessado por classes filhas (herança).

Se o método `contador` fosse `private`, ele **não poderia ser usado fora da classe `Operacoes`**.

---

## ✅ Conclusão

Agora sabemos que:

| Palavra-chave     | Significado                                     |
| ----------------- | ----------------------------------------------- |
| **public**        | Torna o método acessível de qualquer lugar      |
| **static**        | Permite usar o método sem criar um objeto       |
| **void**          | Indica que o método não retorna valor           |
| **String[] args** | Parâmetro do método `main`, um vetor de Strings |

---
