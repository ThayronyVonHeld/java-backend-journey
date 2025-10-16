
# 📚 Aula 14 – Vetores (Arrays)

---

## 🎯 Objetivos da Aula

* Entender o que são vetores (arrays)
* Declarar, inicializar e percorrer vetores em Java
* Usar propriedades e métodos úteis (`length`, `sort`, `fill`, `binarySearch`)
* Aprender o laço **for-each** para simplificar o uso de vetores

---

## 🔍 O que é um Vetor?

Um **vetor** é uma **variável composta unidimensional**, capaz de armazenar **vários valores do mesmo tipo** em posições diferentes da memória.

📦 **Analogia:**
Pense em um vetor como uma **gaveteira**, onde cada gaveta tem uma **posição (índice)** e guarda um **valor**.

---

## 💡 Declaração em Pseudocódigo

```portugol
var
    n: vetor [0..3] de inteiro

inicio
    n[0] <- 3
    n[1] <- 5
    n[2] <- 8
    n[3] <- 2
fimalgoritmo
```

🔹 Estrutura visual:

```
n → [3][5][8][2]
     0  1  2  3
```

Cada número à direita representa o **índice** (posição) do vetor.
Ou seja: `n[0] = 3`, `n[1] = 5` e assim por diante.

---

## 💻 Criando Vetores em Java

### ✅ Forma Completa

```java
int n[] = new int[4];
n[0] = 3;
n[1] = 5;
n[2] = 8;
n[3] = 2;
```

➡️ Em Java, o vetor é um **objeto**, por isso usamos `new`.

### ✅ Forma Simplificada

Se já souber os valores:

```java
int n[] = {3, 5, 8, 2};
```

---

## 🧩 Exemplo Prático

```java
public class Vetor01 {
    public static void main(String[] args) {
        int n[] = {3, 2, 8, 7, 5, 4};

        for (int i = 0; i <= 5; i++) {
            System.out.println("Na posição " + i + " temos o valor " + n[i]);
        }
    }
}
```

### 🧠 Saída Esperada

```
Na posição 0 temos o valor 3
Na posição 1 temos o valor 2
Na posição 2 temos o valor 8
Na posição 3 temos o valor 7
Na posição 4 temos o valor 5
Na posição 5 temos o valor 4
```

---

## 📏 Propriedade `.length`

Todo vetor em Java tem um **atributo de tamanho** chamado `.length`.

```java
public class Vetor01 {
    public static void main(String[] args) {
        int n[] = {3, 2, 8, 7, 5, 4};
        System.out.println("Total de casas de N: " + n.length);

        for (int i = 0; i < n.length; i++) {
            System.out.println("Na posição " + i + " temos o valor " + n[i]);
        }
    }
}
```

### 🧠 Saída

```
Total de casas de N: 6
Na posição 0 temos o valor 3
Na posição 1 temos o valor 2
Na posição 2 temos o valor 8
Na posição 3 temos o valor 7
Na posição 4 temos o valor 5
Na posição 5 temos o valor 4
```

---

## ⚙️ Laço For-Each (ou “Para Cada”)

O **for-each** simplifica a leitura dos vetores, percorrendo automaticamente todos os elementos.

### 🆚 Comparando

**Forma comum:**

```java
int num[] = {3, 5, 8, 4};

for (int i = 0; i <= 3; i++) {
    System.out.print(num[i] + " ");
}
```

**Forma com For-Each:**

```java
int num[] = {3, 5, 8, 4};

for (int valor : num) {
    System.out.print(valor + " ");
}
```

### 💻 Exemplo com Números Decimais

```java
public class Vetor01 {
    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};
        for (double valor : v) {
            System.out.print(valor + " ");
        }
    }
}
```

🧠 Saída:

```
3.5 2.75 9.0 -4.5
```

---

## 🧮 Ordenando Vetores

Java possui a classe `Arrays`, que contém diversos **métodos utilitários**.

### 🧩 Exemplo – Ordenação

```java
import java.util.Arrays;

public class Vetor01 {
    public static void main(String[] args) {
        int num[] = {3, 5, 8, 4};
        Arrays.sort(num);

        for (int valor : num) {
            System.out.print(valor + "  ");
        }
    }
}
```

### 🧠 Saída:

```
3  4  5  8
```

---

## 🔎 Buscando Valores (Binary Search)

Podemos procurar um valor específico dentro de um vetor com o método `Arrays.binarySearch()`.

```java
import java.util.Arrays;

public class Vetor01 {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v : vet) {
            System.out.print(v + "  ");
        }

        System.out.println();
        Arrays.sort(vet); // Importante ordenar antes da busca

        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posição " + p);
    }
}
```

---

## 🧱 Preenchendo Vetores com `fill()`

Podemos preencher **automaticamente** um vetor com um valor fixo usando `Arrays.fill()`.

```java
import java.util.Arrays;

public class Vetor01 {
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 0);

        for (int valor : v) {
            System.out.print(valor + " ");
        }
    }
}
```

🧠 Saída:

```
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
```

---

## ✅ Conclusão

Nesta aula aprendemos:

✅ O que são vetores e como declará-los
✅ Como acessar seus elementos por índice
✅ Como usar o atributo `.length`
✅ Como simplificar com o **for-each**
✅ Como **ordenar, buscar e preencher** vetores usando a classe `Arrays`

---

> 💡 **Dica:** Vetores são a base para trabalhar com **estruturas de dados mais avançadas**, como **matrizes, listas, filas e coleções**.

---
