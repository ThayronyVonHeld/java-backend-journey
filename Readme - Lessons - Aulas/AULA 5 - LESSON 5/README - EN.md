Aqui está um resumo dos meus estudos de Java (tal como historia, conceitos e etc..)

1990 sun microsystem

james gosling - Chefe
criar tecnologia para dispositivos se comunicar
c++
complicações do C++

The Green Project
Nova linguagem!
GreenTalk

1991 - Novo Nome! "Oak""Carvalho"

Star Seven - novo projeto! um controlador portátil direcionado ao entretenimento doméstico (setup box)

Duke - "Assistente" lexa do passado

1992 - Projeto engavetado por falta de incentivo

1994 - Tim Bernes lee (criando HTML buscava criar uma linguagem interativa para web)

"interativade" - palavra chave entre o projeto Oak e o HMTL

Surge o projeto Web Runner

problemas com o nome da linguagem Oak
patente já utilizada.

Java Coffe - Jargão para caffe forte!

Novo nome JAVA!!!!!

Projeto Web Runner passou a se chamar HotJava

Jogada interatividade, interligar dispositivos externos e internos.

2004 NASA
Comunicação do robô em martes rodando em JAVA

Popularização

2006
java passa a ser código aberto! gpl 3
software livre - Linux
código aberto
Firefox
Chrome
Wordpress
PHP
Blender

2009 - Sun deixa de existir e é vendida para Oracle!!

gosling deixa a empresa em 2010

Funcionalidades Java
Chips de Cartão de credito são lidos em interface criada em java

Sistema Android, Programas criados em JAVA

Bluray - controlado por java
Kindle - Java


Como Funciona JAVA?

Código Java

Aquivo fonte -> JavaC (Compilador) -> ByteCode -> JVM (Java Virtual Machine) -> Qualquer Sistema Operacioal excecuta o programa/arquivo.

"Sopa de letrinha Java" (Suas Abreviações)

Dois momentos em Java

Programador x Usuário

separados por JDK(Java Development kit) desenvolvimento / JRE(Java Runner Environment) execução Respectivamente


JRE composto por duas partes -> JVM E Bibliotecas

JVM
-Loader/verificador
-interpretador/gerenciador
-compilador JIT (JUST IN TIME)

JDK Composto por:
-JRE
-JAVALang
-JAVATOOLS
Javac
debugger
ApIS

IDE -> Ambiente de desenvolvimento JAVA

RAD
Qual jdk instalar?

SE Standard Edition
Desenvolver uma aplicação Para janelas ou ambientes ou interfaces graficas/programas simples

EE- Enterprise Edition
Para desenvolver aplicativos mais complexos em janelas, porém com uma estrutura maior, com banco de dados e acessos remotos

ME - Micro Edition
Desenvolver edições portáteis, por exemplo para dispositivos celulares.

Como instalar IDE INTELLIJ (chat nessa parte deixo contigo, faça passo a passo)
Como instalar JDK 24 (O QUE EU TENHO)

Para mais informações, acessa a documentação em: https://docs.oracle.com/en/java/javase/24/index.html

Aula 4 - primeiro programa EM JAVA!

todo programa em Java pode ser composto de Pacotes

package primeiroprograma; \\ opcional
public class PrimeiroPrograma { // chaves são blocos e as classes são esses blocos
public static void main(String[] args){ // método principal
System.out.print("Olá Mundo");

Nessa configuração temos;
o método principal "public static void main(String[] args){ " dentro da classe primeiro programa "public class PrimeiroPrograma {" que está dentro do pacote "package primeiroprograma;" e a instrução do método que ira escrever olá mundo na tela System.out.print("Olá Mundo");
}

Cuidado!! Existe diferença Em letras Maiúsculas e minúsculas em Java!!!

Mas Calma Não se desespere, no inicio você pode gravas apenas as siglas (Utilizando uma IDE por exemplo o Intellij) o auto complete veja:

ao digitar psvm e apertar o tab, o intellij por exemplo irá auto completar para public static void main(String[] args){
}
ou
sout -> System.out.print()


Java é case sensetive
Método Camelo ou CamelCase!

o camelo possui corcovas em seu corpo, o CamelCase funciona da seguinte forma: Sempre que a estiver em uma corcova ou inicio, Irá usar letra maiúscula (Explica melhor chat?)


Regras!
A primeira letra maiúscula e as outras camelcase indica ou uma classe ou uma interface!
ex: SejaBemVindo!!

Se a primeira letra for minúscula e as outras em CamelCase, ela pode ser um atributo,uma variável ou parametro ou um método
ex: meuAtributo -> nomeAluno
ex: minhaVáriavel -> mediaPrimeiroBimestre
ex: meuMétodo -> lancarNotaAluno


Se encontrar palavras apenas em minúsculos, será um pacote
ex: alunoscursoemvideo

Você pode também encontrar todas as letras maiúsculas, essas serão constantes:
ex: MINHA_CONSTANTE -> VALOR_DE_PI



Aula 5

Agora entraremos no JAVAFX (parte 2)


Evolução do Swing

awt -> swing -> Javafx

SWING cria apenas interfaces para janelas, Linux, Windows o que era visto como uma limitação. já O JAVA FX cria para diversas plataformas, exemplo celulares, computadores entre outras.


Assim criamos: A Plataforma JavaFX

para começar, ainda usaremos o NetBeans

antes de tudo precisamos do JDK e o JavaFX Scene Builder (Muito importante) e ele você pode baixar direto do site da oracle

Com udo pronto e configurado, No net beans iremos iniciar um novo projeto

ctrl + alt + m

categories -> java With maven
projects -> FXML JavaFX Maven archetype

Project name -> JavaFXInterface
group Id -> com.cursoemvideo


Agora com o projeto criado assim será sua visualização:

[imagem]

iremos clicar no

primary.fxml

abrirá essa tela:

[imagem]

e aqui está nossa interface de configuração, se parece com o swing, mas a diferença crucial é que essa interface cria para diversos dispositivos. 

 











 






