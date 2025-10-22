
# 💡 **Aula 2 – O que é um Objeto?**

---

## 🌎 Introdução

Faça essa pergunta para si mesmo: **o que é um objeto?**
Olhe ao seu redor e tente identificar quantos objetos você consegue ver.

Por exemplo: um **celular**, um **carro**, um **mouse** ou um **joystick**.
Todos esses são **objetos** — coisas que conseguimos **ver, tocar, usar e descrever**.

Mas e se eu te perguntar:

* O **horário no dentista** é um objeto?
* O **compromisso que você agendou**?
* E um **botão na tela do seu celular**?

A maioria das pessoas responderia que **só os quatro primeiros** (celular, carro, joystick e mouse) são objetos.
Mas será que os outros **não podem ser considerados objetos também**?

---

## 📘 Definição de Objeto

De acordo com a definição clássica de Programação Orientada a Objetos:

> **Um objeto é uma coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio de suas características, comportamentos e estado atual.**

Ou seja, um objeto pode ser algo **concreto** (como uma caneta) ou **abstrato** (como um compromisso).
O importante é que ele tenha:

* **Características**
* **Comportamentos**
* **Estado**

---

## ✏️ Exemplo 1 – Controle remoto

**Controle remoto** é um excelente exemplo de objeto:

* **Características** → tem botões, é da marca GoPro, modelo RM.
* **Comportamentos** → ligar, gravar, pausar, desligar.
* **Estado** → desligado, novo, sem bateria ou procurando uma rede.

Tudo o que tiver **características, comportamentos e estado**, é um **objeto**.

---

## 📅 Exemplo 2 – Compromisso

Agora pense no seu **compromisso marcado no dentista**.

* **Características** → data e hora, local, tipo (consulta, revisão, etc).
* **Comportamentos** → marcar, remarcar, cancelar.
* **Estado** → agendado, cancelado ou concluído.

Mesmo sendo **abstrato**, ele também possui essas três dimensões — logo, também é um **objeto**.

---

## 🖊️ Exemplo 3 – A Caneta

Vamos analisar uma **caneta**:

* É **material** (existe fisicamente).
* Pode ser **percebida pelos sentidos**.
* Pode ser **descrita** por meio de suas **características**, **comportamentos** e **estado atual**.

Então sim, **a caneta é um objeto**.

Mas existem **vários tipos de canetas**: esferográfica, hidrocor, tinteiro...
Todas têm formatos diferentes, mas seguem um mesmo **modelo**, um mesmo **molde**.

E esse molde, em Programação Orientada a Objetos, é o que chamamos de **classe**.

---

## 🧩 Classe e Objeto

Na POO:

* A **caneta em si** é um **objeto**.
* O **molde usado para criar a caneta** é a **classe**.

| Conceito   | Significado                                |
| ---------- | ------------------------------------------ |
| **Classe** | O molde ou modelo para criar objetos.      |
| **Objeto** | O produto final criado a partir da classe. |

---

## ❓ As Três Perguntas Fundamentais

Para entender uma classe, faça sempre três perguntas:

1. **O que eu tenho?** → Atributos
2. **O que eu faço?** → Métodos
3. **Como estou agora?** → Estado

Vamos aplicar isso à caneta:

| Pergunta          | Exemplo                            | Termo técnico |
| ----------------- | ---------------------------------- | ------------- |
| O que eu tenho?   | Modelo, cor, ponta, carga, tampada | **Atributos** |
| O que eu faço?    | Escrever, rabiscar, tampar         | **Métodos**   |
| Como estou agora? | Ponta fina, cor azul, destampada   | **Estado**    |

---

## 🧠 A Classe Caneta

Antes de criar uma caneta, precisamos do **molde**.
Na fábrica, esse molde é projetado com base nas **características** do produto final.

Na programação, fazemos o mesmo — criamos uma **classe Caneta**.

### Estrutura básica:

```algoritmo
classe Caneta
    // Atributos
    modelo : caractere
    cor : caractere
    ponta : real
    carga : inteiro
    tampada : lógico

    // Métodos
    método rabiscar()
    fim do método

    método tampar()
    fim do método
fim da classe
```

---

## 🧩 Métodos em ação

Dentro dos métodos, colocamos o comportamento da caneta.

### Exemplo – Método `rabiscar()`

```algoritmo
se tampada = verdadeiro então
    escreva("Erro: Caneta tampada")
senão
    escreva("Rabiscando...")
fim se
```

### Exemplo – Método `tampar()`

```algoritmo
tampada = verdadeiro
```

Os **métodos** podem modificar os **atributos** da classe.
Isso é o que torna os objetos **dinâmicos**.

---

## 🧪 Criando um objeto (instanciando)

O computador **não sabe o que é uma caneta** — você precisa ensiná-lo.

Para isso, criamos uma **classe** (molde) e depois **instanciamos** um objeto:

```algoritmo
C1 = nova Caneta
```

Agora temos uma caneta chamada `C1`.

Podemos configurar seus atributos:

```algoritmo
C1.cor = "Azul"
C1.ponta = 0.5
C1.tampada = falso
```

E usar seus métodos:

```algoritmo
C1.rabiscar()
```

Podemos também criar outro objeto:

```algoritmo
C2 = nova Caneta
C2.cor = "Vermelha"
C2.ponta = 1.0
C2.tampar()
```

Agora temos **duas canetas diferentes** (dois objetos), criadas a partir da **mesma classe**.

---

## 🧱 Classe × Objeto × Instância

| Termo          | Definição                                       |
| -------------- | ----------------------------------------------- |
| **Classe**     | Molde que define atributos e métodos.           |
| **Objeto**     | Instância (exemplar) criada a partir da classe. |
| **Instanciar** | Ação de gerar um objeto a partir de uma classe. |

Exemplo:

> “Classe Caneta” é o molde,
> “C1” e “C2” são objetos (instâncias) dessa classe.

---

## 🍪 Exemplo Alternativo – Forma de Biscoitos

Pense em uma **forma de biscoito**:

* A forma é a **classe**.
* Cada biscoito feito a partir dela é um **objeto**.

Todos têm o mesmo formato, mas podem ter **sabores e coberturas diferentes**.
Ou seja, **mesmos atributos**, mas **estados diferentes**.

---

## 🎯 Conceito de Abstração

Você é uma pessoa. Eu também sou.
Somos objetos da **classe Pessoa**.

Temos os mesmos **atributos** (nome, idade, peso...), mas **estados diferentes**.

A **abstração** serve para **focar apenas nos atributos relevantes** para o contexto.

Exemplo:

* Em um **cadastro de aluno**, a cor dos olhos é irrelevante.
* Em um **cadastro de modelo**, é essencial.

👉 Abstração é **ignorar o que não importa** para o problema e **manter o que importa**.

---

## 🧭 Resumo da Aula

| Conceito       | Explicação                                                |
| -------------- | --------------------------------------------------------- |
| **Objeto**     | Entidade que possui atributos, métodos e estado.          |
| **Classe**     | Molde usado para criar objetos.                           |
| **Atributos**  | Características do objeto.                                |
| **Métodos**    | Ações ou comportamentos.                                  |
| **Estado**     | Situação atual do objeto.                                 |
| **Instanciar** | Criar um objeto a partir de uma classe.                   |
| **Abstração**  | Selecionar apenas os detalhes relevantes para o contexto. |

---

## 🧩 Atividade Prática

### 1️⃣ Objetos Concretos

Olhe ao seu redor e escolha **dois objetos físicos** (ex: cadeira, mochila, garrafa).

Para cada um:

* Liste **atributos** (características),
* Liste **métodos** (ações),
* Descreva o **estado atual**.

📘 Exemplo:

**Cadeira**

* Atributos: cor, material, tem braços (sim/não), peso máximo.
* Métodos: sentar, empilhar, virar.
* Estado: está vazia, virada para frente, não empilhada.

---

### 2️⃣ Objetos Abstratos

Agora pense em **dois objetos abstratos** (ex: aula, tarefa, pedido).

Descreva:

* **Atributos**,
* **Métodos**,
* **Estado atual**.

📘 Exemplo:

**Tarefa**

* Atributos: título, prazo, prioridade.
* Métodos: iniciar, pausar, concluir.
* Estado: em andamento.

---
