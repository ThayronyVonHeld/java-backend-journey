# 📚 Aula 4 – Métodos Especiais

---

## 🎯 Objetivos da Aula
- Compreender o conceito de métodos especiais em POO
- Identificar e implementar métodos getters e setters
- Aplicar métodos construtores em classes
- Relacionar encapsulamento com métodos de acesso
- Implementar os conceitos em código Java

---

## 🧭 Introdução

Na programação orientada a objetos, existem **métodos especiais** que seguem uma padronização reconhecida por todos os programadores. Estes métodos facilitam a **organização, segurança e manutenção** do código.

Vamos entender esses conceitos através de exemplos práticos!

---

## 🏗️ Analogia do Banco

Imagine que você queira **depositar R$ 1,00** na sua conta bancária. Você:

- ❌ **NÃO** entra atrás do balcão e abre o caixa
- ✅ **SIM** entrega o dinheiro a um **funcionário autorizado**

Isso gera **segurança**! Na POO, fazemos o mesmo com os **métodos acessores**.

---

## 🔍 Métodos Acessores (Getters)

### O que são?
São métodos que **permitem consultar** o valor de atributos **sem acesso direto**.

### Analogia da Estante
```java
// ❌ Acesso direto (perigoso)
e.totDoc = 5;

// ✅ Acesso seguro via getter
e.getTotDoc(); // Retorna 5
```

### Características:
- Nome começam com **"get"** + nome do atributo
- **Não recebem parâmetros**
- **Retornam** o valor do atributo
- São **públicos**

---

## ✏️ Métodos Modificadores (Setters)

### O que são?
São métodos que **permitem alterar** o valor de atributos **com controle**.

### Analogia da Estante
```java
// ❌ Modificação direta (perigosa)
e.totDoc = e.totDoc + 1;

// ✅ Modificação segura via setter
e.setTotDoc(novoDocumento);
```

### Características:
- Nome começam com **"set"** + nome do atributo
- **Recebem parâmetros** (novo valor)
- **Não retornam** valores (void)
- São **públicos**

---

## 🛡️ Por que usar Getters e Setters?

### Vantagens:
1. **Encapsulamento** → Protege dados sensíveis
2. **Validação** → Pode verificar dados antes de modificar
3. **Controle** → Logs e auditoria de alterações
4. **Flexibilidade** → Pode mudar implementação interna sem afetar quem usa

---

## 🎯 Exemplo Prático: Caneta

### Classe Caneta com Getters/Setters:

```java
public class Caneta {
    // ATRIBUTOS
    public String modelo;      // Público
    private Float ponta;       // Privado
    
    // MÉTODOS ESPECIAIS
    
    // GETTER para modelo
    public String getModelo() {
        return this.modelo;
    }
    
    // SETTER para modelo
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    // GETTER para ponta
    public Float getPonta() {
        return this.ponta;
    }
    
    // SETTER para ponta  
    public void setPonta(Float p) {
        this.ponta = p;
    }
}
```

### Usando a Classe:

```java
public class Main {
    public static void main(String[] args) {
        // Criando objeto
        Caneta c1 = new Caneta();
        
        // ✅ Usando SETTERS (modificação segura)
        c1.setModelo("BIC Cristal");
        c1.setPonta(0.5f);
        
        // ✅ Usando GETTERS (consulta segura)
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ponta: " + c1.getPonta());
        
        // ❌ Acesso direto a atributo privado (ERRO!)
        // c1.ponta = 0.7f; // ERRO de compilação
    }
}
```

**Saída:**
```
Modelo: BIC Cristal
Ponta: 0.5
```

---

## 🏗️ Método Construtor (Constructor)

### O que é?
É um método **executado automaticamente** quando um objeto é criado.

### Características:
- Nome **igual ao da classe**
- **Não tem tipo de retorno** (nem void)
- Pode **receber parâmetros**
- Inicializa atributos

---

## 🎯 Exemplo: Construtor da Caneta

### Classe Caneta com Construtor:

```java
public class Caneta {
    // ATRIBUTOS
    private String modelo;
    private String cor;
    private Float ponta;
    private boolean tampada;
    
    // ✅ CONSTRUTOR
    public Caneta(String m, String c, Float p) {
        this.setModelo(m);  // Usando setter
        this.setCor(c);     // Usando setter  
        this.setPonta(p);   // Usando setter
        this.tampar();      // Já começa tampada
    }
    
    // GETTERS E SETTERS
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String c) {
        this.cor = c;
    }
    
    public Float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(Float p) {
        this.ponta = p;
    }
    
    public boolean getTampada() {
        return this.tampada;
    }
    
    // MÉTODOS NORMAIS
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("=== SOBRE A CANETA ===");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada: " + this.getTampada());
    }
}
```

### Usando o Construtor:

```java
public class Main {
    public static void main(String[] args) {
        // ✅ Criando caneta com construtor
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
        Caneta c2 = new Caneta("Faber-Castell", "Vermelha", 1.0f);
        
        // Status automático
        c1.status();
        c2.status();
    }
}
```

**Saída:**
```
=== SOBRE A CANETA ===
Modelo: BIC
Cor: Azul
Ponta: 0.5
Tampada: true

=== SOBRE A CANETA ===
Modelo: Faber-Castell
Cor: Vermelha
Ponta: 1.0
Tampada: true
```

---

## 🔄 Fluxo do Construtor

```
new Caneta("BIC", "Azul", 0.5f)
         ↓
Construtor executa:
   setModelo("BIC")     → modelo = "BIC"
   setCor("Azul")       → cor = "Azul"  
   setPonta(0.5f)       → ponta = 0.5
   tampar()             → tampada = true
         ↓
Caneta pronta para uso!
```

---

## 🎯 Resumo dos Métodos Especiais

| Tipo | Nome | Função | Exemplo |
|------|------|--------|---------|
| **Getter** | `getAtributo()` | Consultar valor | `getModelo()` |
| **Setter** | `setAtributo()` | Modificar valor | `setModelo("BIC")` |
| **Construtor** | `NomeClasse()` | Inicializar objeto | `Caneta("BIC", "Azul", 0.5f)` |

---

## 💡 Boas Práticas

### 1. **Sempre use getters/setters** para atributos privados
### 2. **Mantenha atributos privados** quando possível
### 3. **Use o construtor** para valores iniciais
### 4. **Valide dados** nos setters

```java
public void setPonta(Float p) {
    // ✅ Validação antes de modificar
    if (p > 0 && p <= 2.0) {
        this.ponta = p;
    } else {
        System.out.println("Ponta inválida!");
    }
}
```

---

## 🚀 Exercícios Práticos

### Exercício 1: Classe Carro
```java
// Crie uma classe Carro com:
// Atributos: marca, modelo, ano, velocidade (privados)
// Métodos: getters/setters, construtor, acelerar(), frear()
```

### Exercício 2: Validação em Setters
```java
// Modifique os setters para validar:
// - Ano não pode ser futuro
// - Velocidade não pode ser negativa
// - Marca não pode ser vazia
```

### Exercício 3: Classe Conta Bancária
```java
// Crie uma classe Conta com:
// Atributos: numero, saldo, titular (privados)
// Métodos: depositar(), sacar(), getSaldo()
// Regra: saldo não pode ficar negativo
```

---

## 📋 Template para Implementação

```java
public class NomeClasse {
    // ATRIBUTOS (geralmente privados)
    private String atributo1;
    private int atributo2;
    
    // CONSTRUTOR
    public NomeClasse(String param1, int param2) {
        this.setAtributo1(param1);
        this.setAtributo2(param2);
    }
    
    // GETTERS
    public String getAtributo1() {
        return this.atributo1;
    }
    
    public int getAtributo2() {
        return this.atributo2;
    }
    
    // SETTERS
    public void setAtributo1(String valor) {
        this.atributo1 = valor;
    }
    
    public void setAtributo2(int valor) {
        this.atributo2 = valor;
    }
}
```

---

> 💡 **Dica**: "Pense nos getters/setters como funcionários do banco: eles controlam o acesso ao 'caixa' (seus atributos). O construtor é como receber um produto novo já configurado. Essa mentalidade ajuda a criar código mais seguro e profissional!"

---

**🎉 Parabéns!** Agora você domina os métodos especiais que são fundamentais para programação orientada a objetos profissional!