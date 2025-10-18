# 📚 Aula 15 - Métodos

---

## 🎯 Objetivos da Aula
- Compreender o conceito de métodos em Java
- Diferenciar entre procedimentos e funções
- Dominar a sintaxe de criação e chamada de métodos
- Entender o modificador `static` e seu uso
- Aprender a trabalhar com métodos em diferentes classes
- Conhecer os modificadores de acesso: public, private, protected

---

## 🧩 Conceito de Métodos em Java

### O que são Métodos?
Em Java, **não existe distinção** entre funções e procedimentos como em outras linguagens. Tudo são **métodos**!

### Identificação pelo Tipo de Retorno:
- **Procedimento** → Não retorna valor → usa `void`
- **Função** → Retorna valor → usa tipo primitivo ou objeto

---

## 💡 Representação em Algoritmo

### Procedimento em Algoritmo:
```portugol
procedimento Soma(A, B: Inteiro)
var
    S: Inteiro
inicio
    S <- A + B
    Escreva(S)
fimProcedimento
```

**Chamada:** `Soma(5, 2)`

### Função em Algoritmo:
```portugol
função Soma(A, B: Inteiro): Inteiro
var
    S: Inteiro
inicio
    S <- A + B
    retorne S
fimFunção
```

**Chamada:** `sm <- Soma(5, 2)`

---

## 💻 Implementação em Java

### Procedimento em Java:
```java
void soma(int a, int b) {
    int s = a + b;
    System.out.println(s);
}
```

### Função em Java:
```java
int soma(int a, int b) {
    int s = a + b;
    return s;
}
```

---

## 🏗️ Estrutura de um Método

### Sintaxe Completa:
```java
[modificadores] tipo_retorno nome_metodo([parâmetros]) {
    // corpo do método
    return valor; // se não for void
}
```

### Exemplo Prático com Erro:
```java
public class TesteProcedimento {
    void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é: " + s);
    }

    public static void main(String[] args) {
        soma(5, 2); // ❌ ERRO! Não pode chamar método não-estático de estático
    }
}
```

---

## ⚡ O Modificador `static`

### O Problema:
O método `main` é `static` (estático), portanto só pode chamar outros métodos que também sejam `static`.

### Solução:
```java
public class TesteProcedimento {
    static void soma(int a, int b) { // ✅ Adiciona static
        int s = a + b;
        System.out.println("A soma é: " + s);
    }

    public static void main(String[] args) {
        soma(5, 2); // ✅ Agora funciona!
    }
}
```

### O que é `static`?
- **Método estático** → Pertence à **classe**, não às instâncias
- **Método não-estático** → Pertence às **instâncias** (objetos) da classe

---

## 🎯 Exemplos Práticos Completos

### Exemplo 1: Procedimento com Static
```java
public class ExemploProcedimento {
    static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo!");
    }

    static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println(a + " + " + b + " = " + resultado);
    }

    public static void main(String[] args) {
        saudacao("Maria");
        soma(10, 5);
        soma(7, 3);
    }
}
```

### Exemplo 2: Função com Static
```java
public class ExemploFuncao {
    static int soma(int a, int b) {
        return a + b;
    }

    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    static String verificarAprovacao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        int resultadoSoma = soma(5, 3);
        double media = calcularMedia(8.5, 7.0);
        String situacao = verificarAprovacao(media);
        
        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}
```

---

## 🔄 Entendendo o Método `main`

### Análise do Método Principal:
```java
public static void main(String[] args) {
    // código
}
```

- **`public`** → Método acessível de qualquer lugar
- **`static`** → Pertence à classe, não precisa de instância
- **`void`** → Não retorna valor
- **`main`** → Nome do método (ponto de entrada)
- **`String[] args`** → Parâmetro: vetor de Strings para argumentos

---

## 🏪 Trabalhando com Múltiplas Classes

### Classe Operacoes:
```java
package fundamentals.Lesson15.TestandoClasses;

public class Operacoes {
    public static String contador(int i, int f) {
        String s = "";
        for(int c = i; c <= f; c++) {
            s += c + " ";
        }
        return s;
    }
    
    public static int fatorial(int n) {
        int fat = 1;
        for(int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}
```

### Classe TesteFuncao (Principal):
```java
package fundamentals.Lesson15.TestandoClasses;

public class TesteFuncao {
    public static void main(String[] args) {
        System.out.println("Vai começar a contagem:");
        System.out.println(Operacoes.contador(1, 5));
        
        System.out.println("\nFatorial de 5:");
        System.out.println(Operacoes.fatorial(5));
    }
}
```

### 🔍 Saída Esperada:
```
Vai começar a contagem:
1 2 3 4 5 

Fatorial de 5:
120
```

---

## 🔒 Modificadores de Acesso

### Tabela de Modificadores:

| Modificador | Acesso | Descrição |
|-------------|---------|-----------|
| **`public`** | Público | Acessível de qualquer lugar |
| **`private`** | Privado | Acessível apenas na própria classe |
| **`protected`** | Protegido | Acessível na classe e subclasses |
| **(default)** | Pacote | Acessível apenas no mesmo pacote |

### Exemplo com Diferentes Modificadores:
```java
public class ExemploModificadores {
    public static void metodoPublico() {
        System.out.println("Método público - qualquer um pode acessar");
    }
    
    private static void metodoPrivado() {
        System.out.println("Método privado - só acessível nesta classe");
    }
    
    protected static void metodoProtegido() {
        System.out.println("Método protegido - acessível por herança");
    }
    
    static void metodoPadrao() {
        System.out.println("Método padrão - acessível no mesmo pacote");
    }
}
```

---

## 🎮 Exemplo Prático: Calculadora Completa

### Classe Calculadora:
```java
public class Calculadora {
    // Métodos públicos e estáticos
    public static double somar(double a, double b) {
        return a + b;
    }
    
    public static double subtrair(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
    }
    
    // Método privado - só usado internamente
    private static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
    
    public static String verificarParidade(int numero) {
        if (ehPar(numero)) {
            return numero + " é PAR";
        } else {
            return numero + " é ÍMPAR";
        }
    }
}
```

### Classe Principal:
```java
import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = teclado.nextDouble();
        
        // Usando métodos da classe Calculadora
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Soma: " + Calculadora.somar(num1, num2));
        System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + Calculadora.dividir(num1, num2));
        
        System.out.print("\nDigite um número inteiro: ");
        int numero = teclado.nextInt();
        System.out.println(Calculadora.verificarParidade(numero));
        
        teclado.close();
    }
}
```

---

## 📋 Resumo da Sintaxe

### Estrutura Completa:
```java
[public|private|protected] [static] [final] [synchronized] 
tipo_retorno nomeMetodo(tipo param1, tipo param2, ...) {
    // corpo do método
    
    if (tipo_retorno != void) {
        return valor;
    }
}
```

### Partes do Método:
1. **Modificadores de acesso** → `public`, `private`, `protected`
2. **Modificador static** → `static` (opcional)
3. **Tipo de retorno** → `void`, `int`, `String`, etc.
4. **Nome do método** → identificador
5. **Parâmetros** → entre parênteses
6. **Corpo** → entre chaves
7. **Return** → se não for `void`

---

## ✅ Checklist de Aprendizagem

- [ ] Compreendo o conceito de métodos em Java
- [ ] Sei diferenciar procedimentos (void) de funções (com retorno)
- [ ] Domino a sintaxe de criação e chamada de métodos
- [ ] Entendo o uso do modificador `static`
- [ ] Consigo criar métodos em classes separadas
- [ ] Conheço e aplico modificadores de acesso
- [ ] Sei trabalhar com parâmetros e valores de retorno
- [ ] Criei programas organizados com métodos

---

## 🚀 Exercícios Práticos

### Exercício 1: Conversor de Temperatura
```java
// Crie métodos para converter Celsius ↔ Fahrenheit
```

### Exercício 2: Validador de Dados
```java
// Crie métodos para validar email, CPF, idade, etc.
```

### Exercício 3: Calculadora Geométrica
```java
// Crie métodos para calcular área, perímetro, volume
```

### Exercício 4: Gerador de Relatórios
```java
// Crie métodos para gerar diferentes tipos de relatórios
```

---

## 🎉 Conclusão

Nesta aula aprendemos:
- ✅ **Conceito de métodos** em Java
- ✅ **Diferença entre procedimentos e funções**
- ✅ **Uso do modificador `static`**
- ✅ **Trabalho com múltiplas classes**
- ✅ **Modificadores de acesso**: public, private, protected
- ✅ **Organização de código** com métodos
- ✅ **Boas práticas** de programação modular

**Parabéns por completar o curso de fundamentos de Java! 🎊**

---

> 💡 **Dica Final**: "A prática é essencial para dominar métodos. Comece criando métodos pequenos e específicos. Use nomes descritivos que expliquem o que o método faz. Lembre-se: código bem organizado em métodos é mais fácil de manter, testar e entender. Continue praticando e explorando os conceitos de orientação a objetos que virão a seguir!"