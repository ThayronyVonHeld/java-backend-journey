Aula 03 -  Modificadores de Visibilidade 

A visibilidade é uma grande essencia da programação orientada a objeto.

Antes de aprofundarmos sobre visibilidade, veremos brevemente sobre a Linguagem de modelagem Unificade, ou UML

A UML (Unified Modeling Language) é uma linguagem de modelagem padronizada que permite visualizar, 
especificar, construir e documentar sistemas de software. 

O importante para nós nesse momento é somente abordar sobre o diagrama mais famoso da uml, que é o diagrama de classes.

O diagrama de classes serve para simplificar o modelo de uma classe, vejamos o exemplo da classe caneta anterior:

Sabemos que a caneta é um objeto, e o molde da caneta é uma classe, antes quando falamos dessa classe, você imagina uma representação
visual de literalmente um molde de uma caneta. Aqui no diagrama de classes, vamos representar por um retangulo, toda clase é um retangulo.

Isso simplifica pois, uma caneta é facil fazermos essa "vizualização", basta criarmos molde de caneta. Mas na aula anterior, vimos que
um compromisso no dentista também pode ser um objeto. Como vamos representar isso? É ai que entra esse diagrama!

Teremos um retangulo

no topo do retangulo terá uma classe que já definimos "caneta"
depois iremos traçar duas linhas, uma para separar o cabeçalho, e a outra para separar a parte do meio e a parte de baixo

Caneta - nome da classe
---------------------   |
 modelo                 | -> todos os atributos, caracteristicas da classe
 cor
carga
ponta
tampada                 |
---------------------   |
escrever()
rabiscr()
pintar()                -> Esses são os metodos!
tampar()
destampar()


Observação! Esse diagrama simplifica tudo, percebe que os metodos estão com os paranteses depois
Isso já explica que queles são metodos. Assim como, a classe no topo começando com letra Maiúscula, os atributos e metodos começando com minuscula, diferenciamos os atributos e metodos com o parenteses() que os metodos possuem!

Como podemos perceber, identificamos de forma simples, o que é classe, atributo e metodo

Agora iremos abordar os modificadores de visibilidade!
