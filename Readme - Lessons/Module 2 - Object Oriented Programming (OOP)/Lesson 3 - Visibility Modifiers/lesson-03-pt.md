# 📚 Aula 3 - Modificadores de Visibilidade

---

## 🎯 Objetivos da Aula
- Compreender o conceito de UML e diagramas de classes
- Aprender a representar classes usando diagramas UML
- Dominar os modificadores de visibilidade: public, private e protected
- Entender quando usar cada tipo de modificador
- Aplicar modificadores de visibilidade em código Java

---

## 🎨 UML - Unified Modeling Language

### O que é UML?
A **UML (Unified Modeling Language)** é uma linguagem de modelagem padronizada que permite visualizar, especificar, construir e documentar sistemas de software.

### Diagrama de Classes
O diagrama mais famoso da UML é o **diagrama de classes**, que simplifica a representação visual de uma classe.

---

## 📐 Representando uma Classe em UML

### Exemplo: Classe Caneta

```
    Caneta
-------------------
+ modelo: String
+ cor: String  
- carga: int
# ponta: float
# tampada: boolean
-------------------
+ escrever()
+ rabiscar()
+ pintar()
- tampar()
- destampar()
```

### 🔍 Legenda do Diagrama:
- **Retângulo** → Representa uma classe
- **Topo** → Nome da classe (Começa com maiúscula)
- **Seção do meio** → Atributos (começam com minúscula)
- **Seção inferior** → Métodos (com parênteses `()`)
- **Símbolos** → `+` público, `-` privado, `#` protegido

---

## 🔒 Modificadores de Visibilidade

### Os Três Níveis de Acesso:

| Símbolo | Modificador | Descrição |
|---------|-------------|-----------|
| `+` | **public** | Acesso total - qualquer classe pode acessar |
| `-` | **private** | Acesso restrito - somente a própria classe |
| `#` | **protected** | Acesso protegido - própria classe e subclasses |

---

## 📞 Analogia com Telefones

### ☎️ Public (`+`) - Telefone Público
- **Todos podem usar**
- Como os "orelhões" nas ruas
- **Qualquer pessoa** tem acesso

### 📱 Private (`-`) - Celular Pessoal
- **Uso exclusivo do dono**
- Precisa de senha para acessar
- **Ninguém mais** pode usar

### 🏢 Protected (`#`) - Telefone Empresarial
- **Funcionários da empresa** podem usar
- Não é público (qualquer um)
- Não é privado (apenas uma pessoa)
- **Grupo específico** tem acesso

---

## 🎮 Exemplo Prático: Controle Remoto

### Analisando um Controle Remoto:
- **Botões externos** → `public` (todos podem usar)
- **Componentes internos** → `private` (protegido do usuário)
- **LED infravermelho** → `protected` (só a TV recebe o sinal)

---

## 💻 Aplicação em Código Java

### Classe Caneta com Modificadores:

```java
package oop.Lesson3.Caneta;

public class Caneta {
    // ATRIBUTOS COM MODIFICADORES
    public String modelo;      // + Público
    public String cor;         // + Público  
    private Float ponta;       // - Privado
    protected int carga;       // # Protegido
    private boolean tampada;   // - Privado
    
    // MÉTODOS
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Error! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }
    
    private void tampar() {
        this.tampada = true;
    }
    
    private void destampar() {
        this.tampada = false;
    }
}
```

### Classe Principal (Main):

```java
package oop.Lesson3.Caneta;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        // ✅ ATRIBUTOS PÚBLICOS - Podemos acessar
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        
        // ❌ ATRIBUTO PRIVADO - Não podemos acessar diretamente
        // c1.ponta = 0.5f;  // ERRO! Atributo privado
        
        // ✅ ATRIBUTO PROTEGIDO - Podemos acessar (mesmo pacote)
        c1.carga = 50;
        
        // ❌ ATRIBUTO PRIVADO - Não podemos acessar diretamente
        // c1.tampada = false;  // ERRO! Atributo privado
        
        // ❌ MÉTODO PRIVADO - Não podemos chamar diretamente
        // c1.tampar();  // ERRO! Método privado
        
        c1.status();
        c1.rabiscar();
    }
}
```

---

## 🎯 O que é `this`?

### Explicando `this`:
- **`this`** refere-se ao **objeto atual** que está chamando o método
- **`this.modelo`** → o atributo `modelo` **deste objeto**
- Quando temos `c1.status()`, dentro do método `status()`, **`this`** é o objeto `c1`

### Exemplo:
```java
Caneta c1 = new Caneta();
Caneta c2 = new Caneta();

c1.modelo = "BIC";
c2.modelo = "Faber-Castell";

c1.status(); // this = c1 → mostra "BIC"
c2.status(); // this = c2 → mostra "Faber-Castell"
```

---

## 🚫 Restrições de Acesso na Prática

### O que podemos e não podemos fazer:

#### ✅ **PERMITIDO** (Atributos públicos):
```java
c1.modelo = "BIC Cristal";  // ✅ Público
c1.cor = "Azul";           // ✅ Público
```

#### ✅ **PERMITIDO** (Atributo protegido - mesmo pacote):
```java
c1.carga = 50;             // ✅ Protegido (mesmo pacote)
```

#### ❌ **NEGADO** (Atributos privados):
```java
// c1.ponta = 0.5f;       // ❌ Privado - ERRO!
// c1.tampada = true;     // ❌ Privado - ERRO!
```

#### ❌ **NEGADO** (Métodos privados):
```java
// c1.tampar();           // ❌ Método privado - ERRO!
// c1.destampar();        // ❌ Método privado - ERRO!
```

---

## 🛡️ Por que usar Modificadores?

### Vantagens dos Modificadores:

1. **Encapsulamento** → Protege dados sensíveis
2. **Controle de acesso** → Define quem pode modificar o quê
3. **Manutenibilidade** → Código mais organizado e seguro
4. **Prevenção de erros** → Evita modificações acidentais

### Exemplo do Mundo Real:
- **Carro**: Volante e pedais são `public` (todos usam)
- **Motor**: É `private` (só mecanicos especializados acessam)
- **Computador de bordo**: É `protected` (sistema do carro acessa)

---

## 📋 Tabela Resumo - Modificadores

| Modificador | Classe | Pacote | Subclasse | Todos |
|-------------|--------|--------|-----------|-------|
| **public** | ✅ | ✅ | ✅ | ✅ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| **default** | ✅ | ✅ | ❌ | ❌ |
| **private** | ✅ | ❌ | ❌ | ❌ |

> **Default**: Quando não especificamos nenhum modificador

---

## ✅ Checklist de Aprendizagem

- [ ] Compreendo o que é UML e diagramas de classes
- [ ] Sei representar uma classe usando diagrama UML
- [ ] Domino os três modificadores de visibilidade
- [ ] Entendo quando usar public, private e protected
- [ ] Compreendo o significado da palavra `this`
- [ ] Consigo aplicar modificadores em código Java
- [ ] Entendo as restrições de acesso de cada modificador

---

## 🚀 Exercícios Práticos

### Exercício 1: Diagrama UML
```java
// Crie um diagrama UML para a classe "Carro" com:
// Atributos: marca, modelo, ano, velocidadeAtual
// Métodos: acelerar(), frear(), ligar(), desligar()
// Defina a visibilidade de cada componente
```

### Exercício 2: Implementação em Java
```java
// Implemente a classe "Carro" em Java aplicando
// os modificadores de visibilidade apropriados
```

### Exercício 3: Análise de Acesso
```java
// Dada uma classe com atributos public, private e protected
// Identifique quais acessos serão permitidos e negados
// em diferentes contextos
```

---

## 🎉 Conclusão

Nesta aula aprendemos:
- ✅ **UML e diagramas de classes** para representação visual
- ✅ **Modificadores de visibilidade**: public, private, protected
- ✅ **Analogias práticas** para entender cada modificador
- ✅ **Aplicação em código Java** com restrições de acesso
- ✅ **Uso da palavra `this`** para referenciar o objeto atual

**Próxima aula: Encapsulamento e Métodos Acessores!**

---

> 💡 **Dica do Professor**: "Pense nos modificadores como níveis de segurança. Use `private` para o que é sensível, `protected` para o que é compartilhado na família, e `public` para o que todos precisam usar. Essa mentalidade ajuda a criar código mais seguro e organizado!"