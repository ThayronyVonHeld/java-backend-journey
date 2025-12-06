
# 📚 Aula 5 – Pilares da POO: Encapsulamento - pt

---

## 🎯 Objetivos da Aula

* Entender o conceito de encapsulamento
* Compreender por que ele é considerado um dos pilares da POO
* Aplicar encapsulamento em UML e em Java
* Criar interfaces, classes encapsuladas e métodos públicos de controle
* Relacionar encapsulamento com segurança, padrões e modularidade

---

## 🧭 Introdução: Os Pilares da POO

A Programação Orientada a Objetos possui **três pilares principais** (no modelo reduzido mais moderno):

1. **Encapsulamento**
2. **Herança**
3. **Polimorfismo**

> “Mas meu professor disse que são quatro, incluindo abstração…”

Sim! Algumas bibliografias usam **quatro pilares**:

* Abstração
* Encapsulamento
* Herança
* Polimorfismo

Porém, no material que estamos seguindo, **abstração está contida dentro de encapsulamento**, pois abstrair significa **isolar apenas o que importa** e esconder o resto — exatamente a essência do encapsulamento.

---

## 🔒 O Encapsulamento

### 📦 Analogia: A Pilha (Bateria)

Pense em uma **pilha AA**:

* Ela possui **componentes químicos internos**
* Esses componentes poderiam ser perigosos
* Por isso ela precisa ser **encapsulada**
* Você **usa** a pilha sem ter acesso ao conteúdo interno
* Pilhas do mesmo tipo seguem um **padrão externo**
* O funcionamento interno pode ser totalmente diferente entre marcas

👉 **O usuário vê apenas a interface — não o funcionamento interno.**

### Encapsulamento em POO funciona da mesma maneira:

Um software encapsulado:

✔ Usa o mesmo padrão externo
✔ Protege o usuário do código e o código do usuário
✔ Fornece uma interface estável
✔ Esconde detalhes internos
✔ Permite mudança interna sem quebrar quem usa

---

## 🔐 O que significa encapsular?

Encapsular significa:

**➡️ Ocultar partes internas da implementação
➡️ Expor apenas o necessário
➡️ Garantir segurança, padronização e flexibilidade**

Assim como você não abre uma pilha para ver como ela funciona,
um programador não deve acessar diretamente os atributos de um objeto.

---

## 💬 Mensagens e Interfaces

Em POO, não interagimos diretamente com o objeto.
Nós enviamos **mensagens** → chamadas de métodos.

A **interface** é o conjunto de serviços que o objeto oferece ao mundo externo.

Exemplos de interfaces no mundo real:

* **Pilha** → apenas dois polos
* **Carro** → volante, acelerador, freio
* **Controle remoto** → botões

Você não precisa saber como internamente cada ação é executada.
A interface te protege dos detalhes internos.

---

## 🧱 Por que encapsular?

### 1. 🔄 Mudanças internas invisíveis

Você pode reescrever toda a lógica interna, desde que os métodos públicos permaneçam iguais.

### 2. ♻ Reutilização

Classes encapsuladas funcionam como “caixas pretas” reutilizáveis.

### 3. 🛡 Menos efeitos colaterais

O código externo não altera indevidamente o interno — e vice-versa.

---

## 🎮 Exemplo: O Controle Remoto

Antes da carcaça (a cápsula), você teria acesso a circuitos e fios.
Isso seria perigoso e frágil.

Depois da carcaça, você vê apenas a **interface**:

* Ligar
* Desligar
* Menu
* Mudo
* Volume + / –
* Play
* Pause

Você não sabe (e nem precisa saber) **como** cada botão funciona internamente.

---

# 🧩 Encapsulamento em UML e em Java

Vamos agora representar isso usando:

* Interface (UML e código)
* Classe que implementa a interface
* Encapsulamento com atributos privados

---

## 🧭 A Interface (UML)

Uma **interface** é a descrição dos métodos que uma classe deve implementar.

No UML:

```
<<interface>> Controlador
-------------------------
+ ligar()
+ desligar()
+ abrirMenu()
+ fecharMenu()
+ maisVolume()
+ menosVolume()
+ ligarMudo()
+ desligarMudo()
+ play()
+ pause()
```

Nenhum desses métodos tem implementação.
A interface apenas **define o contrato**.

---

## 💻 Interface em Java

```java
public interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
```

---

## 🏗️ A Classe que Implementa a Interface

A classe **ControleRemoto** terá:

### 🔐 Atributos privados:

* volume
* ligado
* tocando

### ⚙️ Métodos especiais:

* construtor
* getters
* setters

### 🎮 Métodos públicos obrigatórios (da interface):

Implementação de todos os métodos como ligar(), desligar(), etc.

---

## 💻 Classe ControleRemoto (estrutura base)

```java
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // CONSTRUTOR
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // GETTERS e SETTERS
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // MÉTODOS DA INTERFACE
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Tocando: " + this.getTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
```

---

# 🧠 Resumo Final

| Conceito           | Significado                                          |
| ------------------ | ---------------------------------------------------- |
| Encapsulamento     | Esconder partes internas e expor apenas a interface  |
| Interface          | Lista de métodos que uma classe deve implementar     |
| Atributos privados | Protegem o estado interno do objeto                  |
| Getters/Setters    | Controlam o acesso ao interior da cápsula            |
| Vantagens          | Segurança, organização, flexibilidade e reutilização |

---

# 🚀 Exercícios Práticos

## 1. Crie uma interface chamada **Player** com métodos:

* play
* pause
* stop
* aumentarVolume
* diminuirVolume

## 2. Implemente a classe **MusicPlayer**:

* volume privado
* tocando privado
* construtor
* getters/setters privados
* implementação total da interface

## 3. Adapte o ControleRemoto:

* Adicione um método “mudarCanal(int canal)”
* Permita canais apenas entre 1 e 99
* Encapsule o atributo canal

---