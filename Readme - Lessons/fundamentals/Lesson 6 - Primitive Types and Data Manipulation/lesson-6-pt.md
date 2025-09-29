Comentários em Código
Vou mostrar para vocês como é que se comenta um código. Sabe aqueles códigos que você pega que estão bem comentadinhos, que são fáceis de entender? Pois é, o programador que criou eles provavelmente pensou que alguém poderia mexer no código depois e comentou toda a estrutura do programa, para que que serve um módulo, para que que serve uma determinada classe. Então, ele deixou tudo comentadinho.

Como é que você vai fazer isso? Existem várias maneiras no Java. Você tem comentários de linha, você tem comentários de múltiplas linhas, como em toda linguagem de programação, e a gente também tem a opção de fazer comentários para documentação.

Se você quiser comentar uma linha específica, você vai utilizar o barra barra (//). Tudo que estiver depois dele vai ser comentário. Você pode colocar um comando antes, logo depois do comando, depois do ponto e vírgula, botar um barra barra e comentar esse comando, ou então você pode transformar uma linha inteira como comentário utilizando barra barra como os primeiros caracteres.

Uma outra forma de comentar é utilizando múltiplas linhas. Quando você tem muitas linhas para comentar, você vai utilizar um formato que vem do C, que é o barra asterisco e asterisco barra (/* ... */). Todas essas três linhas que estão aí seriam comentários no Java. E aí, por questões estéticas, alguns programadores fazem isso daqui, colocam pequenos asteriscos em cada linha só para tornar a coisa mais bonitinha. Isso não é obrigatório, mas é uma tradição entre programadores fazer desse tipo. Se você ver isso, significa que esses asteriscos estão em linhas isoladas, eles não fazem parte do comentário, é só uma questão estética.

E como eu disse, existe uma terceira forma de comentar, que são comentários para a documentação. Dá uma olhada nesse comentário aí, tá vendo? Ele parece muito com o de cima, só que no lugar de um asterisco na abertura do comentário, ele tem dois (/** ... */). Todo comentário de múltiplas linhas com dois asteriscos no início serão utilizados para documentação, e você pode utilizar marcas específicas. Por exemplo, nesse código eu estou dizendo quem é o autor, qual é a versão do software e qual foi a primeira versão criada. E como esse é um curso de caráter introdutório, eu não vou me apegar a essas diretivas de documentação dos comentários em Java. Caso você queira maiores informações, faça uma busca no Google por Javadoc, e aí você vai aprender como fazer esse tipo de coisa. Nosso objetivo aqui é criar programas simples, mas quando você se tornar um gafanhoto experiente, dá uma olhada nisso, porque isso é importantíssimo para gerar documentação do seu sistema.

Tipos Primitivos (Revisão e Java)
Vamos passar então para os tipos primitivos, fazendo uma ligeira revisão do curso de algoritmos. Você deve se lembrar no curso de algoritmos que a gente tinha a declaração de tipos e inicialização de variáveis. Por exemplo, no meu algoritmo eu tinha a área de variáveis e a área do corpo do programa. Na área de variáveis eu poderia declarar, por exemplo, a variável idade do tipo inteiro. Mais tarde no programa eu poderia atribuir uma idade, por exemplo, idade recebe 3.

Eu poderia também criar uma variável do tipo real, por exemplo, salário é real. Números reais são aqueles que têm ponto flutuante ou a vírgula. Por exemplo, salário recebe 1825.54. Lembrando que o ponto decimal no caso do algoritmo e também no caso do Java é o ponto e não a vírgula.

Um outro tipo de variável que eu posso utilizar é o tipo caracter, por exemplo, a variável letra é do tipo caractere. Para fazer essa atribuição eu poderia fazer letra recebe 'G', sendo que os caracteres em algoritmo ficam entre aspas.

O último tipo que a gente tinha em algoritmo era o tipo lógico, por exemplo, uma variável casado do tipo lógico. Quero saber se uma pessoa é casada ou não. Eu posso fazer casado recebe falso. Isso é, a pessoa não é casada.

E como eu falei, isso é uma breve revisão. No curso de algoritmos eu vi cada um desses tipos, vi vários exemplos. Então, se você não lembra desses quatro, volta ao curso de algoritmo. Você volta lá, é uma playlist aqui, você vai ter acesso a todas essas informações sobre os quatro tipos primitivos que, volto a dizer, viram quatro famílias no Java.

E por falar em Java, você deve estar se perguntando aí na sua cabecinha gafanhota: "Mas Guanabara, como é que eu faço para fazer essas quatro declarações pro início dentro de um código JAVA?". Eu te respondo: existem três maneiras básicas. Existem mais de três, mas três são básicas. Eu vou te mostrar cada uma delas.

Veja com atenção. Vamos, por exemplo, fazer a atribuição da variável idade recebe 3 que você está vendo aí do lado esquerdo da tela. Existem três maneiras de fazer.

A maneira mais simples é assim: int idade recebe 3. Simples. Eu boto int, que é uma referência a integer ou inteiro, idade, que é o nome da variável, recebe 3. Isso é, eu já faço a declaração e a atribuição no Java. Molezinha, né? Essa é a primeira maneira.

Uma coisa que eu gostaria de deixar registrada aqui é o seguinte: o Java é uma linguagem que a gente diz como fortemente tipada. Isso é, o tipo é muito importante e caso você queira fazer tramitações entre tipos, na maioria das vezes você tem que fazer conversões ou especificações. Por exemplo, você pode dizer que esse valor 3 pode ser real (3.0) ou inteiro (como 3). Então, o valor 3 ele é inteiro e real ao mesmo tempo. Tem como eu especificar isso? Tem, e vou te mostrar agora.

Uma técnica muito comum para especificar tipos de valores específicos é utilizando o Typecast. Então, a segunda forma de declarar essa variável idade que eu acabei de mostrar para vocês aí é dessa maneira: int idade recebe (int) 3. Note que todos os ints que eu escrevi até agora são em letras minúsculas. Isso deve ser seguido no Java. Esse tipo entre parênteses antes do 3 quer dizer o seguinte: considere esse 3 como inteiro. O nome que se dá a isso é Typecast. E se você se lembra muito bem e você fez o curso de PHP, deve recordar que também existem Typecast em PHP.

A terceira e última maneira é utilizando Classes, e apenas relembrando, classes em Java começam com a primeira letra maiúscula. Então eu posso fazer o seguinte: Integer idade recebe new Integer(3).

Eu acabei de te dar três formas de fazer a declaração da mesma variável, sendo que nas duas primeiras elas são variáveis e na terceira opção ela é um objeto. Ah, Guanabara, qual é a diferença entre uma variável e um objeto? A gente vai ver isso mais para a frente. Mas o fato é o seguinte: sempre que eu utilizar a palavra new (novo) dentro de uma declaração, esse new automaticamente está criando um objeto. Então eu tenho que ter uma classe referenciando ele. Por exemplo, aqui no meu caso, o Integer. Vamos olhar o código, olha do lado esquerdo: Integer idade. Você vai falar: "Ah, idade é do tipo integer". Não! Integer não é um tipo, é uma classe. A palavra new logo depois do identificador idade indica que idade não é uma variável e sim um objeto. E o último 3 lá quer dizer que o valor 3 vai ser considerado como um valor inteiro e colocado dentro do objeto idade. O nome que se dá a essa classe é Wrapper Class. Wrapper não é bem rapper, é Wrapper, que quer dizer invólucro.

Vamos fazer as outras declarações. Por exemplo, a variável sal que é real para guardar o salário. Real, como eu falei anteriormente, você deve se lembrar, é ponto flutuante. Então, no caso do Java, seria considerado como float.

Então, float sal recebe 1825.54f. Percebe ali no final que tem um pequeno f minúsculo? Isso indica que o número é float, que o número é real. Para esse tipo de declaração, se eu não colocar o f no final, o próprio Java vai dar erro.

E se esse f está te incomodando, você pode fazer com que o 1825.54 seja considerado float da seguinte maneira: float sal recebe (float) 1825.54. Você está dizendo que esse valor é para ser considerado como float.

A terceira maneira, utilizando classes Wrapper, é usando a linha Float sal recebe new Float(1825.54).

A maneira de declarar variáveis caracteres são o seguinte: eu vou botar char letra recebe 'G'. Percebe aí que o G no algoritmo tem aspas duplas, e o G no caso do Java tem aspas simples. E o Java tem uma coisa meio incômoda que, quando a gente está começando a aprender Java, ela incomoda um pouquinho. O tipo char ele só ocupa uma letra, ele só permite armazenar uma letra. Você vai falar: "Puxa, mas não tem nenhum tipo que aceita mais uma letra?". Não, não tem no Java. Só que você tem uma classe para isso, já já a gente vai ver. Calma aí!

Para declarar utilizando Typecast, eu vou usar: char letra recebe (char) 'G'. Mais uma vez, eu estou dizendo que esse G deve ser considerado como sendo do tipo char. Pode parecer que para você, logo no início, essa declaração com Typecast não seja tão importante, mas ainda nessa aula você vai entender melhor porque eu estou ensinando essa maneira logo de cara.

A terceira maneira para usar char é utilizando a classe Wrapper, que não é char, é Character: Character letra recebe new Character('G').

Por fim, o tipo Lógico, que também é conhecido como Booleano, vai ser declarado da seguinte maneira: boolean casado recebe false.

Se eu quiser utilizar Typecast: boolean casado recebe (boolean) false.

Se eu quiser utilizar classes invólucro, eu vou utilizar: Boolean casado recebe new Boolean(false).

Pode parecer um pouco confuso no início, porque eu estou mostrando três formas, mas você vai esclarecer isso ainda nessa aula. Pode confiar em mim.

Então você falou assim: "Ah, beleza, você declarou essas quatro. Mas você disse, Guanabara, que os quatro tipos não são quatro tipos, são quatro famílias". E é aí que a gente entra. Existe uma tabela bem grande que a gente vai ver a partir de agora com cada um dos tipos suportados pelo Java, inclusive com as suas classes invólucro, porque é o seguinte: sempre que você vai fazer uma declaração, o importante é você saber qual é o tipo para você saber como é que se utiliza a declaração simples e a declaração com Typecast, e também tem que entender quais são as classes invólucro, porque você vai precisar delas mais cedo ou mais tarde, ainda nessa aula.

Então, o que eu vou fazer aqui é criar uma tabela com: Família, Tipo Primitivo, Classe Invólucro, o Tamanho que ocupa na memória cada um dos tipos e um Exemplo de Atribuição para cada um deles.

A primeira família que a gente vai ver é a família mais simples, que é a família de Lógicos. Ela só tem um tipo relacionado que a gente já viu, e é o boolean. A classe invólucro para boolean é Boolean (com B maiúsculo). Uma variável do tipo boolean ela ocupa apenas um bit de memória, isso é, zero ou um. E um exemplo é true. Esse valor será convertido para um valor de um bit.

A segunda família é a classe dos Literais, que tem um tipo primitivo, mas tem duas classes invólucro. O primeiro tipo primitivo é o char que a gente acabou de ver. O tipo char ele tem classe invólucro Character e ocupa na memória um byte. Isso porque ele ocupa uma letra. Então, são oito bits para armazenar uma letra. Um exemplo é a letra 'A'. Todo tipo char é colocado entre aspas simples. É importante que você lembre disso. Como eu disse, o literal só tem um tipo, então não existe mais nenhum tipo primitivo.

Mas existe uma classe invólucro que a gente vai usar bastante, que é a classe invólucro String. E é aí que eu respondo a sua primeira pergunta. Lembra quando eu acabei de falar assim que o tipo char ele aceita apenas uma letra, e você às vezes fica: "Caramba, mas só uma letra? Como é que eu vou guardar um nome?". Você não vai utilizar o tipo char, você vai utilizar a classe invólucro String. Não existe o tipo string no Java. Existe sim uma classe invólucro, e isso sim faz toda a diferença. Os objetos da classe invólucro String eles ocupam um byte para cada letra. Por exemplo, a string "Java" (note, entre aspas duplas) ocupa quatro bytes na memória porque ela tem quatro letras.

A terceira família que a gente vai ver é a família de Números Inteiros. Essa é a maior de todas, porque ela possui quatro tipos relacionados.

O primeiro tipo é o tipo byte, que é o menor de todos os números inteiros. Sua classe invólucro é Byte, e o tamanho é um byte (sacou, o tipo byte ocupa um byte). Por ocupar um byte, ele não aceita números muito grandes. O maior número guardado dentro de um número inteiro é 127.

E aí você pode perguntar: "Mas Guanabara, se eu quiser um número inteiro um pouco maior?". Você pode utilizar o tipo short, que tem classe invólucro Short. Note que as classes invólucro sempre têm a primeira letra maiúscula. Isso faz toda a diferença. Ele ocupa dois bytes. Isso é, ele tem o dobro do tamanho e ele aceita valores até 32.767.

"Ah, mas Guanabara, se eu quiser passar um pouco de 32.000?". Tem como. Eu vou utilizar o tipo int ou a invólucro Integer. O tipo int ele vai ocupar quatro bytes da memória, mas ele aceita valores até 2.147.483.647.

Se você ainda é megalomaníaco e precisa de um número inteiro maior do que isso, você pode utilizar o tipo long, que tem a classe invólucro Long. Ocupa oito bytes na memória e aceita valores inteiros gigantes até 2
63
. É um número muito grande, da ordem dos quintilhões.

E você deve estar perguntando: "Mas Guanabara, por que que o Java tem essa 'frescura'? Por que que o Java tem tantos números inteiros?". Presta atenção, pequeno gafanhoto. Você deve se lembrar que eu falei que a linguagem Java ela foi feita para rodar em qualquer coisa, inclusive num pequeno relógio, por exemplo. Um relógio concorda comigo que ele tem pouca memória? Então, você tem que economizar essa memória. Não adianta então eu ter um tipo int que ocupa 4 bytes para guardar um número. Pode ser que a memória do meu dispositivo seja pequena, e eu não precise guardar um número tão grande. Então, essa é a necessidade de tantos tipos primitivos. Você tem que saber economizar memória para criar um bom aplicativo em Java.

A última família que a gente vai ver é a família dos Números Reais, que existem dois tipos.

O primeiro é o tipo float, que tem a classe invólucro Float. Ocupa quatro bytes na memória e armazena valores da ordem de 3.4×10
+38
.

Se você precisar de um número maior, você pode utilizar o dobro de memória. Você vai utilizar o tipo double, que tem classe invólucro Double. Ocupa oito bytes de memória, que é o dobro do tipo float, e guarda valores até 1.8×10
+308
.

Então, esses são os tipos primitivos do Java. Não existe mais nada além disso: os tipos primitivos e as classes invólucros para tratar esses tipos primitivos. E você já sabe o exemplo de cada um. Guarde essa tabela no seu pequeno coração.

Saídas e Entradas de Dados em Java
Vamos dar continuidade ao nosso aprendizado e vamos fazer os testes desses tipos primitivos, também aprendendo saídas de dados em Java. Saída de dado é quando eu pego um dado que está na memória do computador e mostro de alguma maneira para você. Nós já utilizamos os comandos System.out.print() e System.out.println(). Vamos aprender alguns outros e também a manipular os tipos primitivos utilizando os comandos de saída.

Vamos dar um exemplo aqui. Vou criar uma variável float nota recebe 8.5f. Note que como eu não utilizei Typecast, eu tenho que colocar aquele f lá no final.

Para escrever essa nota na tela, eu posso usar:

System.out.print("Sua nota é " + nota) (esse + pode ser soma ou concatenação)

Ou você pode utilizar o System.out.println("Sua nota é " + nota). Na verdade, esse ln (de line) vai fazer a diferença somente do salto de linha.

System.out.printf e Format
O próximo é o System.out.printf(). Esse f é de formatado. É uma impressão formatada. E aí você vai olhar: System.out.printf("Sua nota é %.2f", nota). Confundiu muito? É fácil, preste atenção que você vai entender.

Basicamente, como funciona: eu vou transformar isso aqui para um printf. Então ele é um print formatado. Eu vou fazer o seguinte: vou deixar só aspas, vou botar "a nota é " e depois eu quero escrever um número real (real ou float), então por %f. Basicamente, o que eu vou querer é o seguinte: escreva "a nota é %f", e nesse %f eu vou colocar a nota. Então, vírgula nota. Basicamente, essa nota vai se encaixar nesse %f.

Se eu quiser formatar esse %f para ter, por exemplo, duas casas decimais, então eu boto entre o por cento e o f .2 (ponto dois).

O println faz a quebra de linha automaticamente. No printf ou format, para quebrar a linha, você vai colocar \n (contra barra n minúsculo) para cada quebra de linha.

Exemplo usando dois valores:

Java

String nome = "Gustavo";
float nota = 8.5f;
System.out.printf("A nota de %s é %.4f\n", nome, nota);
O %s é para string e o %.4f para float/real com 4 casas decimais. Então, eu tenho duas coisas a substituir, primeiro uma string, depois um número real. Então, tenho que colocar primeiro a string (nome), depois o número real (nota).

Além de utilizar o printf, eu posso usar essa mesma sintaxe com um outro método. No lugar de utilizar printf, eu posso utilizar o System.out.format(). A sintaxe é exatamente a mesma.

Entrada de Dados em Java
A gente já viu a saída de dados, agora a gente vai aprender como fazer a entrada de dados. Entrada de dados é todo dado que está fora e eu quero colocar ele para dentro do computador, normalmente utilizando o teclado.

E aí eu preciso te lembrar de um pequeno detalhe: o Java é uma linguagem, como se fosse um carro popular, ele não tem nada, ele vem "pelado". Inclusive, ele já vem com os comandos de saída de dados, mas não vem com nenhum comando de entrada de dados. Se você se lembra muito bem, a gente tinha o Java, e o Java ele já vem com o conjunto de bibliotecas que é o java.lang (prévia). Acontece que o java.lang ele não tem um comando específico para entrada de dados.

Então, eu vou ter que utilizar uma outra classe, que é a classe Scanner do pacote java.util.Scanner.

Eu vou utilizar o comando Scanner. Vou colocar um nome de um objeto qualquer, vou chamar de teclado, por exemplo, recebe new Scanner(System.in). Entre parênteses eu vou passar o que ele vai escanear, o que ele vai ficar monitorando. Se o System.out é a saída do meu dispositivo, o System.in é a entrada dele.

Lendo Tipos com Scanner
Para ler o nome, por exemplo, eu faria:

Java

String nome = teclado.nextLine();
Para a nota, se for um float:

Java

float nota = teclado.nextFloat();
Existem vários métodos para você ler valores de tipos diferentes. Por exemplo, se você quiser utilizar esse objeto teclado que a gente acabou de criar para ler um número inteiro, você vai botar:

int idade = teclado.nextInt()

Nós podemos utilizar:

nextFloat() para números reais (float)

nextDouble() também para números reais (double)

A gente tem o nextShort()

O nextByte()

A gente tem todos os tipos. Para ler String você vai utilizar a classe invólucro String e utilizando o método nextLine(), como a gente fez anteriormente.

Uma dica: vai aí no teu NetBeans, que eu tenho certeza que você está digitando. Bota aí teclado (bota o nome do objeto que você colocou) .next e espera. Vai aparecer uma lista de todos os métodos disponíveis para leitura de todos os tipos primitivos.

E uma das coisas que pode estar te incomodando agora é o seguinte: "Pô, Guanabara, está no terminal, está feio, né? Você prometeu para mim que ia ficar bonitinho". Calma, porque no Gafanhoto vamos fazer ficar bonitinho ainda nessa aula.

Antes de partir para o Swing, eu preciso mostrar mais uma coisa para vocês. Como eu falei anteriormente, a linguagem Java é fortemente tipada e às vezes, se você não souber trabalhar direito com isso, os tipos começam a brigar entre eles, começa a ter uma pequena incompatibilidade entre valores numéricos e valores String. A gente vai aprender como resolver isso.

Lidando com Incompatibilidade de Tipos (String e Numéricos)
Agora sim, pequeno gafanhoto. Existe uma grande briga aí entre tipos no Java. Existe uma compatibilidade muito grande entre números e String. Vamos ver um exemplo prático disso. Basicamente, vamos considerar a seguinte atribuição: int idade recebe 30. Acabei de criar uma variável idade que é do tipo inteiro e ela vai receber 30. Vamos criar agora um objeto String: String valor recebe idade. Isso é, eu tentando fazer com que idade, que é um número inteiro, entre no String. Na maioria das linguagens isso é possível.

No Java, ao tentar fazer isso, você verá que ele já dará uma incompatibilidade: "tipos incompatíveis, int não pode ser convertido para String". E aí você, como um gafanhoto esperto, vai falar: "Mas Guanabara, usa Typecast!". Vamos tentar usar Typecast. Como eu disse anteriormente, se eu quiser que essa idade seja considerada como String, eu poderia colocar (String) idade. Não funcionou. Posso colocar um Typecast int? Também não funcionou.

Basicamente, minhas tentativas foram frustradas. Eu não consigo fazer essa atribuição, e eu também não consigo fazer essa atribuição, até porque String não é um Typecast, ele é uma classe invólucro.

A maneira correta de fazer isso é utilizando classes invólucro, mas não como Typecast. A maneira correta é fazendo isso aqui: String valor recebe Integer.toString(idade). A classe invólucro Integer, como toda classe, tem métodos. Eu tenho um método chamado toString(), isso é, converter um número inteiro para String. Você perceberá que agora ele não deu problema nenhum. Posso, inclusive, mandar escrever na tela o valor, ele vai me mostrar 30. Tudo graças à minha classe invólucro e o método toString(). Viu como é que a gente resolve uma briga? O tipo inteiro e o tipo String não se falavam, agora eles se falam graças à nossa classe invólucro. Viu como as Wrapper Classes são importantes?

Fazendo a Conversão Inversa (String para Numérico)
Você pode estar se perguntando: como é que eu faço o contrário? Será que dá problema? Vamos ver. O contrário seria fazer o seguinte: eu tenho uma variável String valor recebendo "30" num String, e eu tento fazer com que, criando uma variável idade, esse valor seja colocado dentro dela.

Ao tentar int idade recebe valor, o problema ocorre novamente: "tipos incompatíveis". Essa atribuição é inválida. E aí você pode estar pensando: "Guanabara, usa Typecast, porque agora int é um Typecast". Vamos ver então. Vamos fazer com que esse valor aqui seja considerado (int). Ainda deu problema, porque os tipos não podem ser convertidos. Por quê? Porque eles brigam, não esquece disso. Então a nossa segunda maneira também é frustrada porque eu não consigo fazer.

E adivinha quem vai ajudar a gente mais uma vez? Classes invólucro!

Vamos fazer a atribuição dessa maneira: idade recebe Integer.parseInt(valor). Parse é converter, então eu vou fazer com que um valor seja convertido, seja parseado para inteiro.

Java

int idade = Integer.parseInt(valor);
Note que agora, sem problema nenhum, eu consigo inclusive escrever na tela a idade, e ele vai me mostrar 30.

Tudo isso que eu fiz para os valores inteiros também podem ser feitos para valores reais. Vamos ver somente um exemplo: se o valor for "30.5", e eu quiser converter utilizando a variável float, eu vou ter que esse valor vai ser convertido pela classe invólucro Float.parseFloat(valor). Note que ele não deu problema nenhum.

Isso funciona para todas as classes. Se você está com alguma dúvida, volte naquela tabela que eu falei para você tirar um print. Dê uma olhada em todas as classes invólucro. Todas elas possuem métodos específicos. É só você fazer seus próprios exemplos.

Usando Interface Gráfica com Swing (Soma)
Agora que nós resolvemos todas as brigas entre tipos numéricos e String, vamos ver como fazer isso utilizando interface gráfica. Chegou a hora. Nós vamos fazer tudo isso utilizando o Swing.

Basicamente, eu preparei o seguinte exercício: nós vamos ter uma interface onde eu tenho duas caixas de texto, um símbolo de mais para somar elas duas e um botão de igual. No final, um zero. O valor que eu digitar na primeira caixa e o valor que eu digitar na segunda caixa, quando eu clicar no botão igual, vão ser somados e será mostrada a soma no valor final que está à direita.

Definindo Nomes dos Objetos
Antes da gente partir para o NetBeans, eu quero decidir uma coisa com vocês aqui. Vamos colocar alguns nomes nos objetos que eu vou utilizar:

Primeira caixa: vou chamar ela de txtN1 e vou deixar o text dela vazio.

Segunda caixa: ela vai se chamar txtN2 e o text também vazio.

O botão: eu vou dar o nome dele de btnSoma e o text dele vai ser =.

Por fim, o Label com o valor zero: ele vai se chamar lblResultado e o text vai ser 0.

É importante que a gente decida os nomes antes para a gente poder trabalhar. Se você fizer com um nome diferente do meu, o teu programa não vai funcionar.

Programando o Evento de Soma
No NetBeans, depois de desenhar a interface e configurar os nomes, o que eu tenho que fazer agora é criar o meu evento. O usuário do meu programa vai digitar o primeiro valor na primeira caixa, o segundo valor na segunda e vai clicar em igual. Quando eu clicar em igual, eu vou performar o evento de soma dos dois valores. Então, o que eu tenho que programar é o botão, não as caixas de texto.

Vou clicar com o botão direito no botão (btnSoma), que é quem vai receber o evento, vou escolher Evento, vou para Action e ActionPerformed (que é ação performada, que é a ação executada). Ele vai criar o método btnSomaActionPerformed.

Basicamente, o que eu vou querer é o seguinte: eu vou ter uma variável int para o N1 e int para o N2. Então, eu quero que o N1 venha para cá, o N2 venha para cá. E aí surge uma dúvida: como é que eu tiro o dado de dentro de uma caixa de texto?

Métodos Acessores (Getter e Setter)
É simples. Vamos tomar como base aquele meu lblResultado. Você deve lembrar que a gente modificou a propriedade text dela. Existem os métodos acessores.

Nós temos, por exemplo, a propriedade text. Então eu tenho dois métodos acessores:

O método getter é pegar o valor que está dentro: objeto.getText() (pegue o texto).

O método setter é colocar um valor lá dentro: objeto.setText() (mude o texto).

Implementação da Soma
Meu N1: como eu quero pegar o texto de txtN1, então eu vou botar txtN1.getText(). Você vai perceber que ele deu um pequeno problema: "tipos incompatíveis, String não pode ser convertido para inteiro". Isso porque a variável é inteira e o que eu estou pegando de texto é String.

Basicamente, o que eu tenho que fazer é converter esse valor String para inteiro, como? Utilizando nossas queridas classes invólucro.

Java

int n1 = Integer.parseInt(txtN1.getText());
Para resolver esse erro, basta que eu coloque o getText() entre parênteses e antes dos parênteses eu coloque Integer.parseInt(). Pronto, resolvido.

Faço a mesma coisa para N2:

Java

int n2 = Integer.parseInt(txtN2.getText());
Vou criar uma variável inteira s para somar: int s = n1 + n2.

Vamos agora mostrar o s na tela. O meu lblResultado.setText() (o getText pega, agora eu quero mudar o texto, então setText). lblResultado.setText(s). Ele me deu um erro, passando o mouse em cima: "tipos incompatíveis, inteiro convertido para String". Você já sabe que é briga, né?

Vamos converter utilizando Integer.toString(s):

Java

lblResultado.setText(Integer.toString(s));
Com isso, a gente termina o nosso código. Caso você não tenha digitado, pause o programa agora, digite o seu código do evento para a gente poder continuar.

Por fim, vamos apertar o Play. Meu programa foi executado. Vamos fazer: 6 com 9 deu 15.

Gostou? Faça seus testes, faça suas modificações no seu código e pratique. A prática vai te levar à perfeição.

Essa aula foi bem grande. Na próxima aula a gente vai ver operadores: como é que a gente vai trabalhar esses cálculos. A gente fez só uma soma simples aqui. Como é que a gente faz mais cálculos? Que tipo de operadores? Quem é feito primeiro, quem é feito depois? Isso só na próxima aula, pequeno gafanhoto.