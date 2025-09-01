# 📚 Aula 5 – Introdução ao Swing e JavaFX (Parte 1: Swing)

---

### Antes de começar…

O Java funciona através de **pacotes**.
Pense em um **carro popular**: ele vem com funções básicas, mas se quisermos adicionar algo como **vidro elétrico** ou **trava elétrica**, precisamos incluir esses itens separadamente.

Em Java, acontece o mesmo:

* Funções adicionais podem ser importadas como pacotes.
* Ex.: `import travaEletrica;` ou `import vidroEletrico;`.

Porém, assim como **faróis** já vêm de fábrica em qualquer carro, algumas bibliotecas em Java vêm incluídas por padrão, como o pacote **`java.lang`** (operações matemáticas, estruturas de repetição, etc.).

---

### Algumas bibliotecas importantes do Java

* **`java.applet`** → criação de pequenos aplicativos/applets.
* **`java.util`** → utilitários (listas, coleções, datas).
* **`java.net`** → programação de rede (URLs, sockets).
* **`javax.sound`** → manipulação de áudio.
* **`javax.swing`** → interfaces gráficas.

---

### O que é o Swing?

O **Swing** é uma biblioteca do Java para criar **interfaces gráficas de usuário (GUIs)** que funcionam em Windows, Mac e Linux.

#### História

* Antes do Swing, havia o **AWT (Abstract Window Toolkit)**.
* O AWT dependia muito do sistema operacional → simples, mas limitado.
* O Swing trouxe **mais componentes visuais**, independência da plataforma e maior flexibilidade.

Para usá-lo:

```java
import javax.swing.*;
```

---

### NetBeans x IntelliJ IDEA

🔹 **NetBeans**

* Possui um **GUI Builder (Matisse)** nativo.
* Permite arrastar e soltar botões, labels, painéis etc.
* Bom para começar, mas em grandes projetos o código gerado pode ficar **difícil de manter**.

🔹 **IntelliJ IDEA**

* Não tem GUI Builder nativo para Swing.
* Apostou no **JavaFX + Scene Builder** para interfaces modernas.
* Possui um plugin opcional (*GUI Designer*), mas é menos prático.

👉 Nesta aula, usaremos o **NetBeans** para aprender Swing.

---

### Criando nossa primeira interface no NetBeans

**Pré-requisitos**: JDK + NetBeans instalados.

#### Passo 1: Criar o projeto

* `File` → `New Project` ou **Ctrl + Shift + N**
* `Categories` → **Java With Maven – Projects**
* `Project type` → **Java Application**
* `Project name` → `MyFirstInterface`

#### Passo 2: Criar o JFrame

* Clique com o botão direito no pacote.
* `New` → **JFrame Form...**
* `Categories` → **Swing GUI Forms**
* `File Types` → **JFrame Form**
* Nome da classe → `SwingInterface`

#### Passo 3: Montando a interface

* Arraste um **Button** e um **Label** para a janela central.
* Configure o botão na aba de propriedades → altere o texto para **"Clique aqui"**.

![Editando botão.png](Image%20Readme/Editando%20bot%C3%A3o.png)
📷 *(Imagem: edição do botão)*

* Altere os nomes das variáveis (Right-click → **Change Variable Name**):

    * Label → `lblMensagem`
    * Button → `btnClick`

Agora execute o programa → a janela abrirá, mas nada acontecerá ao clicar no botão.

---

### Adicionando ação ao botão

* Clique com o **botão direito** no botão.
* Vá em `Events` → `Action` → `ActionPerformed`.
* O código abrirá automaticamente em `Source`.

Adicione dentro do método:

```java
private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {  
    lblMensagem.setText("Hello World JavaSwing");  
}
```

![Hello Wold!!.png](Image%20Readme/Hello%20Wold%21%21.png)
📷 *(Imagem: código rodando com botão)*
---

### Estrutura do código gerado

Trecho simplificado:

```java
// Variables declaration
private javax.swing.JButton btnClick;
private javax.swing.JLabel lblMensagem;
// End of variables declaration

public class TelaSwing extends javax.swing.JFrame {

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {
        lblMensagem.setText("Olá, Mundo!");
    }
}
```

---

### Conceitos envolvidos

Mesmo sendo simples, o código já traz alguns conceitos de **POO (Programação Orientada a Objetos)**:

* **extends** → Herança (a classe `TelaSwing` herda `javax.swing.JFrame`).
* **private/public** → Encapsulamento (controle de visibilidade de atributos e métodos).
* **Eventos** → Programação orientada a eventos: ações são disparadas quando o usuário interage (ex.: clique no botão).

---

### Resumo rápido

* O **Swing** é usado para criar GUIs em Java.
* O **NetBeans** facilita com o **GUI Builder**.
* Criamos um **JFrame** com um **Label** e um **Button**.
* Usamos **eventos** para mudar o texto do Label quando o botão é clicado.
* Já vimos na prática conceitos de **POO**: herança, encapsulamento e eventos.

---

👉 E com isso fechamos a **Parte 1 – Swing**.
Na sequência, veremos a **Parte 2 – JavaFX**, que traz uma forma mais moderna de criar interfaces gráficas.


