Aula 5

Agora entraremos no JAVAFX (parte 2)


Evolução do Swing

awt -> swing -> Javafx

SWING cria apenas interfaces para janelas, Linux, Windows o que era visto como uma limitação. já O JAVA FX cria para diversas plataformas, exemplo celulares, computadores entre outras.


Assim criamos: A Plataforma JavaFX

Desta vez iremos usar o Intellij!

(passo a passo)





Agora com o projeto criado assim será sua visualização:

[imagem]



diferenças entre o swing e o javafx (aqui chat adapte para melhor entendimento).

swing:
package cursoemvideo.introduction_java;
public class MyFirstInterface extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MyFirstInterface.class.getName());

public MyFirstInterface() {
initComponents();
}
private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {

        lblMensagem.setText("Hello Wold JavaSwing");
    }   

public static void main(String args[]) {
java.awt.EventQueue.invokeLater(() -> new MyFirstInterface().setVisible(true));
}


    private javax.swing.JButton btnClick;
    private javax.swing.JLabel lblMensagem;


em Javafx

package JavaFXInterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
@Override
public void start(Stage stage) throws Exception {
FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
Scene scene = new Scene(fxmlLoader.load(), 400, 300);
stage.setTitle("JavaFX com FXML!");
stage.setScene(scene);
stage.show();
}

    public static void main(String[] args) {
        launch();
    }
}

Agora, já temos nossa aplicação, mas para executar precisaríamos de ide, "Mas eu quero enviar o "exe" para alguém ver meu projeto!",

Então... Ou seja iremos gerar o Bytecode para as pessoas executar!!

Mas a pessoa precisa da Jre para ter a jvm e assim executar o bytecode!

No NetBeans, basta ir no seu projeto, na aba superior (martelo com uma vassoura)

Clean and Build Project (Introduction_java)

ou simplesmente clicar (Shift+F11).



# Mini‑manual: JavaFX + FXML no IntelliJ (Windows)

> **Objetivo:** criar um projeto Java simples que usa **JavaFX + FXML** no IntelliJ IDEA, abrir o FXML no **Scene Builder** e rodar sem erros.

---

## 1) Pré‑requisitos

* **JDK** instalado (recomendo LTS: 17 ou 21; funciona também no 24).
* **JavaFX SDK** compatível com seu JDK (ex.: JDK 21 → JavaFX 21; JDK 24 → JavaFX 24). Descompacte em uma pasta, ex.: `C:\Users\seuUsuario\Documents\javafx-sdk-24.0.1`.
* **Scene Builder** instalado (Gluon).

> **Dica:** combine sempre versões compatíveis de JDK e JavaFX.

---

## 2) Criar o projeto no IntelliJ

1. **New Project** → **Java**.
2. Escolha o **Project SDK** (seu JDK).
3. Crie o projeto vazio.

---

## 3) Adicionar o JavaFX ao projeto (Libraries)

1. **File → Project Structure… (Ctrl+Alt+Shift+S)**.
2. **Libraries** → clique **+** → **Java**.
3. Aponte para a pasta **`lib`** do JavaFX (ex.: `…\javafx-sdk-24.0.1\lib`).
4. **Apply** e **OK**.

> Isso resolve os imports (`javafx.*`) na compilação.

---

## 4) Configurar a execução (VM Options)

1. **Run → Edit Configurations…**.
2. Selecione sua configuração (classe `Main`).
3. Em **VM Options**, adicione (ajuste o caminho para sua pasta `lib`):

```
--module-path "C:\\Users\\seuUsuario\\Documents\\javafx-sdk-24.0.1\\lib" --add-modules javafx.controls,javafx.fxml
```

> Sem isso, ao rodar aparece: *“JavaFX runtime components are missing…”*.

---

## 5) Estrutura e código base

Crie um **package** (ex.: `JavaFXInterface`) e dentro dele **três arquivos**:

**Main.java**

```java
package JavaFXInterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);
        stage.setTitle("JavaFX com FXML!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
```

**hello-view\.fxml**

```xml
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>

<VBox xmlns="http://javafx.com/javafx" xmlns:fx="http://javafx.com/fxml"
      fx:controller="JavaFXInterface.HelloController" spacing="10" alignment="CENTER">

    <Label fx:id="label" text="Olá, JavaFX com FXML!" />
    <Button text="Clique aqui" onAction="#onHelloButtonClick"/>
</VBox>
```

**HelloController.java**

```java
package JavaFXInterface;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label label;

    @FXML
    protected void onHelloButtonClick() {
        label.setText("Botão clicado!");
    }
}
```

---

## 6) Onde salvar o FXML (classpath)

Duas opções válidas:

* **Mesma pasta do package** (como acima). O `FXMLLoader` usa `Main.class.getResource("hello-view.fxml")`.
* **Pasta de resources**: crie `resources/` e marque como **Resources Root**. Acesse com `Main.class.getResource("/hello-view.fxml")`.

> Use **um** desses padrões e mantenha consistência.

---

## 7) Integrar com o Scene Builder

1. **Settings → Languages & Frameworks → JavaFX** → em **Path to Scene Builder**, aponte para o executável do Scene Builder.
2. Clique com o direito no `hello-view.fxml` → **Open in Scene Builder**.
3. No Scene Builder:

    * **Controller**: preencha **Controller class** com `JavaFXInterface.HelloController`.
    * Selecione o **Label** → **Code** → defina **fx\:id = label**.
    * Selecione o **Button** → **Code** → defina **On Action = onHelloButtonClick**.
4. Salve e volte ao IntelliJ.

---

## 8) Rodar

* Selecione a configuração que aponta para a classe **`JavaFXInterface.Main`**.
* Clique **Run**. A janela deve abrir e o botão atualizar o texto do Label.

---

## 9) Avisos (JDK 24)

É normal ver avisos como “restricted method” e “terminally deprecated” com JDK 24. Eles **não impedem** a execução.

Para reduzir avisos do native access, você pode adicionar às **VM Options**:

```
--enable-native-access=javafx.graphics
```

> Alguns avisos de depreciação podem permanecer. Alternativa: usar JDK LTS (21) + JavaFX correspondente.

---

## 10) Problemas comuns (e correção rápida)

* **Erro:** `JavaFX runtime components are missing…`

    * **Causa:** VM Options sem `--module-path`/`--add-modules`.
    * **Fix:** ver seção **4**.

* **Erro ao clicar no botão:** `NullPointerException` em `label.setText(...)`

    * **Causa:** faltou `fx:id="label"` no FXML ou o `Controller` errado.
    * **Fix:** ver seção **5/7**.

* **`java.lang.ClassNotFoundException` do Controller**

    * **Causa:** `fx:controller` com nome de pacote/classe errado.
    * **Fix:** conferir `fx:controller="seu.pacote.HelloController"`.

* **`Location is not set` ou `... not found` ao carregar FXML**

    * **Causa:** caminho do recurso incorreto.
    * **Fix:** se estiver no mesmo package, use `"hello-view.fxml"`; se estiver em `resources`, use `"/hello-view.fxml"`.

* **Scene Builder não abre pelo IntelliJ**

    * **Fix:** configure o caminho do executável do Scene Builder (seção 7.1).

---

## 11) Checklist final (funciona sempre)

* [ ] JavaFX adicionado em **Libraries**.
* [ ] VM Options com `--module-path …\lib` e `--add-modules javafx.controls,javafx.fxml`.
* [ ] `fx:controller` correto no FXML.
* [ ] `fx:id` definidos para os nós usados no controller.
* [ ] `onAction` mapeado para métodos `@FXML` públicos ou protegidos.
* [ ] `Main` certo na Run Configuration.

Pronto! Este é o fluxo mínimo e confiável para rodar **JavaFX + FXML + Scene Builder** no IntelliJ.
