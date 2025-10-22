# 📚 Aula 2 - O que é um Objeto?

---

## 🎯 Objetivos da Aula
- Compreender o conceito de objetos na Programação Orientada a Objetos
- Diferenciar entre objetos concretos e abstratos
- Identificar atributos, métodos e estados de objetos
- Entender a relação entre classes e objetos
- Aplicar o conceito de abstração na modelagem de objetos

---

## 🧐 O que é um Objeto?

### Observe ao seu redor...
Quantos objetos você consegue identificar?
- 📱 Celular
- 🚗 Carro
- 🖱️ Mouse
- 🎮 Joystick

**Mas e quanto a...**
- 📅 Horário no dentista?
- 📝 Compromisso agendado?
- 👨‍🎓 Aluno?
- 🔘 Botão na tela?

### Definição Formal de Objeto:
> **"Um objeto é uma coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio de suas características, comportamentos e estado atual."**

---

## 🔍 Analisando um Objeto: Controle Remoto

### Exemplo Prático - Controle Remoto GoPro:
```java
// CARACTERÍSTICAS (O que tem?)
String marca = "GoPro";
String modelo = "RM";
int quantidadeBotoes = 2;

// COMPORTAMENTOS (O que faz?)
void ligar() { /* código */ }
void gravar() { /* código */ }
void pausar() { /* código */ }

// ESTADO (Como está agora?)
boolean ligado = false;
int nivelBateria = 75;
boolean conectado = true;
```

---

## ✨ Os Três Pilares de Todo Objeto

### 1. **O que eu tenho?** → **Atributos**
- Características físicas ou descritivas
- Propriedades que definem o objeto

### 2. **O que eu faço?** → **Métodos**
- Ações que o objeto pode realizar
- Comportamentos e funcionalidades

### 3. **Como estou agora?** → **Estado**
- Situação atual do objeto
- Valores específicos em um momento

---

## 🖊️ Exemplo Detalhado: Caneta

### Análise da Caneta como Objeto:

#### **ATRIBUTOS** (O que a caneta tem?)
```java
String modelo;
String cor; 
double ponta;    // 0.5, 0.7, 1.0
int carga;       // porcentagem
boolean tampada;
```

#### **MÉTODOS** (O que a caneta faz?)
```java
void rabiscar() { /* código */ }
void tampar() { /* código */ }
void destampar() { /* código */ }
boolean podeEscrever() { /* código */ }
```

#### **ESTADO** (Como está agora?)
```java
modelo = "Bic Cristal";
cor = "Azul";
ponta = 0.5;
carga = 90;
tampada = false;  // ↴ ESTADO ATUAL: Destampada, com 90% de carga, escrevendo
```

---

## 🏭 Classe vs Objeto

### Analogia da Fábrica:
| Conceito | Analogia | Definição |
|----------|----------|-----------|
| **Classe** | **Molde** da caneta | Projeto, planejamento, definição |
| **Objeto** | **Caneta** específica | Instância concreta criada a partir da classe |

### 📝 Exemplo em Código:

#### **CLASSE** (Molde)
```java
public class Caneta {
    // ATRIBUTOS
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    
    // MÉTODOS
    void rabiscar() {
        if (tampada) {
            System.out.println("Erro! Caneta tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    
    void tampar() {
        tampada = true;
    }
}
```

#### **OBJETOS** (Instâncias)
```java
// Criando objetos a partir da classe
Caneta c1 = new Caneta();  // ↴ INSTANCIAÇÃO
Caneta c2 = new Caneta();

// Configurando objetos diferentes
c1.cor = "Azul";
c1.ponta = 0.5;
c1.tampada = false;

c2.cor = "Vermelha"; 
c2.ponta = 1.0;
c2.tampada = true;
```

---

## 🔄 Instanciamento

### O que é Instanciar?
> **Instanciar** é o processo de criar um objeto específico a partir de uma classe.

### Sintaxe:
```java
// nomeObjeto = new Classe();
Caneta minhaCaneta = new Caneta();
ControleRemoto meuControle = new ControleRemoto();
Aluno aluno1 = new Aluno();
```

### 📌 Pontos Importantes:
- Uma **classe** pode gerar **múltiplos objetos**
- Cada objeto tem **seus próprios valores** nos atributos
- Objetos da mesma classe são **independentes**

---

## 🧠 Abstração: O Primeiro Pilar da POO

### O que é Abstração?
> **Focar apenas nos aspectos relevantes** de um objeto para um determinado contexto, **ignorando detalhes desnecessários**.

### Exemplos de Abstração:

#### Contexto: Cadastro de Aluno
```java
public class Aluno {
    // ATRIBUTOS RELEVANTES
    String nome;
    String matricula;
    String curso;
    
    // IGNORADOS (não relevantes neste contexto)
    // - Cor dos olhos
    // - Peso
    // - Altura
    // - Time de futebol preferido
}
```

#### Contexto: Cadastro de Modelo
```java
public class Modelo {
    // ATRIBUTOS RELEVANTES  
    double altura;
    double peso;
    String corOlhos;
    String corCabelo;
    
    // IGNORADOS (não relevantes neste contexto)
    // - Matrícula
    // - Curso
    // - Notas
}
```

---

## 🎯 Aplicação Prática: Modelando Objetos

### Exemplo 1: Objeto Concreto - Cadeira
```java
public class Cadeira {
    // ATRIBUTOS
    String cor;
    String material;
    boolean temBraco;
    double pesoMaximo;
    
    // MÉTODOS
    void sentar() {
        System.out.println("Alguém sentou na cadeira");
    }
    
    void empilhar() {
        System.out.println("Cadeira empilhada");
    }
    
    // ESTADO ATUAL
    boolean ocupada = false;
    boolean empilhada = false;
    String orientacao = "frente";
}
```

### Exemplo 2: Objeto Abstrato - Compromisso
```java
public class Compromisso {
    // ATRIBUTOS
    Date data;
    String horario;
    String local;
    String descricao;
    
    // MÉTODOS  
    void marcar() {
        System.out.println("Compromisso marcado");
    }
    
    void cancelar() {
        System.out.println("Compromisso cancelado");
    }
    
    void adiar() {
        System.out.println("Compromisso adiado");
    }
    
    // ESTADO ATUAL
    String status = "agendado"; // agendado, cancelado, realizado
}
```

---

## 📋 Tabela de Comparação: Classe vs Objeto

| Aspecto | Classe | Objeto |
|---------|--------|--------|
| **Natureza** | Abstrata | Concreta |
| **Definição** | Molde, projeto | Instância, exemplar |
| **Tempo** | Existe durante o design | Existe durante a execução |
| **Quantidade** | Uma por conceito | Múltiplos por classe |
| **Analogia** | Projeto da casa | Casa construída |

---

## 🎮 Atividade Prática

### 🔍 Exercício 1: Objetos Concretos
**Escolha DOIS objetos concretos ao seu redor e analise:**

#### Objeto: [Seu Objeto Aqui]
- **Atributos**:
- **Métodos**:
- **Estado Atual**:

#### Objeto: [Seu Objeto Aqui]
- **Atributos**:
- **Métodos**:
- **Estado Atual**:

### 💭 Exercício 2: Objetos Abstratos
**Escolha DOIS objetos abstratos do seu dia a dia:**

#### Objeto: [Exemplo: Aula]
- **Atributos**: horário, disciplina, professor, alunos
- **Métodos**: iniciar(), terminar(), adiar()
- **Estado Atual**: "aguardando início"

#### Objeto: [Seu Objeto Abstrato]
- **Atributos**:
- **Métodos**:
- **Estado Atual**:

---

## ✅ Checklist de Aprendizagem

- [ ] Compreendo o conceito de objetos na POO
- [ ] Sei diferenciar objetos concretos e abstratos
- [ ] Consigo identificar atributos, métodos e estados
- [ ] Entendo a diferença entre classe e objeto
- [ ] Compreendo o processo de instanciação
- [ ] Aplico o conceito de abstração na modelagem
- [ ] Consigo analisar objetos do mundo real

---

## 🚀 Próximos Passos

Na próxima aula exploraremos:
- **Como criar classes em Java**
- **Modificadores de acesso** (public, private)
- **Construtores** e inicialização de objetos
- **Encapsulamento** - segundo pilar da POO

---

> 💡 **Dica do Professor**: "Pratique identificando objetos no seu dia a dia. Pergunte sempre: 'O que ele tem? O que ele faz? Como está agora?' Essa mentalidade é fundamental para se tornar um bom programador orientado a objetos. A abstração é sua aliada - foque no que é importante para o problema que você está resolvendo!"

**Continue observando o mundo através das lentes da POO! 👓**