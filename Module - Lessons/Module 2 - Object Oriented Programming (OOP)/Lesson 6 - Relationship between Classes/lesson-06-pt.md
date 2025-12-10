aula 6 parte 1:

Nessa aula a gente vai tratar um assunto novo, que é o relacionamento entre as classes. Até o momento, a gente só falou de uma classe por vez; a partir de agora vamos começar a programar mais de uma classe ao mesmo tempo e fazer essas classes “conversarem”. Isso é muito importante para que você possa entender a estrutura de um objeto, e é importante também compreender que não vamos tratar esse assunto em uma aula só. Teremos a teoria inicial agora, sobre relacionamento entre classes. Preciso criar uma classe razoavelmente grande com vocês, mas mais para frente a gente vai poder criar outra classe e fazer com que elas se relacionem. Para isso, vou precisar da aula sete e da aula oito.

Antes de começar a aula sete, o exercício que eu planejei é o Ultra Emoji Combat. Nós vamos colocar esses emojis para lutar e, durante as próximas aulas, vamos construir melhor esse exercício que inicia a partir de agora. Basicamente, nesta aula, o que vamos fazer é criar o perfil de um lutador. Para o nosso exercício, eu coloquei algumas características que um lutador precisa ter para participar do Ultra Emoji Combat: nome, nacionalidade, idade, altura, peso, categoria, número de vitórias, derrotas e empates. Tudo isso precisará ser registrado para cada um dos lutadores.

A gente já começa a pensar: “Na aula anterior você disse que todos os dados que compõem um objeto são seus atributos, suas características, suas variáveis internas". Exatamente: tudo isso será cadastrado durante o exercício. Vamos transformar essa lista de características em um diagrama de classes: teremos a classe Lutador com seus atributos e, logo abaixo, os seus métodos.

Os atributos serão os mesmos que definimos anteriormente: nome, nacionalidade, idade, altura, peso, categoria, vitórias, derrotas e empates. Também vamos definir a visibilidade de todos esses atributos. Na aula anterior, colocamos tudo como privado, e isso faz parte do encapsulamento — o primeiro pilar da programação orientada a objetos — que impede que outros mexam diretamente nos atributos.

E se você pulou essas partes porque queria ver logo o relacionamento entre classes, vai acabar se confundindo depois. O curso é sequencial: teoria e prática, dependendo da linguagem que você escolheu. Não pule etapas para não criar dificuldades desnecessárias lá na frente.

Para completar o diagrama de classes, temos a parte dos métodos: apresentar o lutador, mostrar status, ganhar luta, perder luta e empatar luta. “Apresentar” é aquela entrada com o apresentador dizendo nome, peso, país etc. O “status” mostra informações resumidas que aparecem durante a luta. E claro, temos os métodos de vitória, derrota e empate.

Você pode pensar: “Mas um lutador também treina, corre, toma suplementos...”. Sim, mas para este exercício vamos trabalhar apenas o que importa agora. Isso se chama abstração: considerar somente as partes relevantes para o problema. Se você quiser adicionar atributos ou métodos extras, fique à vontade.

No diagrama eu não coloquei os getters, setters e o construtor, porque iria ficar muito grande. Mas você já sabe o que são esses métodos especiais se está acompanhando tudo direitinho.

Agora vou apresentar os lutadores que vão fazer parte do exercício. Temos um atributo chamado categoria, e para o exercício criei três categorias: peso leve, peso médio e peso pesado. Coloquei dois lutadores em cada categoria.

O primeiro lutador é o Pretty Boy, de nacionalidade francesa, 31 anos, 1,75 m, 68,9 kg — portanto peso leve. Ele tem 11 vitórias, 2 derrotas e 1 empate.

O segundo é o Script, brasileiro, 29 anos, 1,68 m, 57,8 kg (peso leve), com 14 vitórias, 2 derrotas e 3 empates.

O terceiro é o Snap Shadow, dos EUA, 35 anos, 1,65 m, 80,9 kg (peso médio), 12 vitórias, 2 derrotas e 1 empate.

O quarto é o Dead Cold, australiano, 28 anos, 1,93 m, 81,6 kg (peso médio), 13 vitórias, nenhuma derrota e 2 empates.

O quinto é o Uf Cobol, brasileiro, 37 anos, 1,70 m, 99,3 kg (peso pesado), 5 vitórias, 4 derrotas e 3 empates.

O sexto é o Ner Dart, dos EUA, 30 anos, 1,81 m, 105,7 kg (peso pesado), 12 vitórias, 2 derrotas e 4 empates.

Esse é nosso exercício: cadastrar todos esses lutadores. Se quiser pausar o vídeo e montar a classe, ótimo. Pode fazer em Algoritmo, PHP, Java ou outra linguagem da sua preferência. O ideal é tentar fazer antes de ver a aula prática, caso ainda esteja se enrolando.

O diagrama de classes já está pronto, e agora vamos criar o código. Começamos pelo cabeçalho e final da classe ("classe Lutador" e "fim da classe"). Em seguida, declaramos os atributos: nome e nacionalidade (caracter), idade (inteiro), altura e peso (real), categoria (caracter), vitórias, derrotas e empates (inteiros). Todos privados, pois a classe está encapsulada.

Depois criamos os métodos: apresentar, status, ganhar luta, perder luta e empatar luta. Todos públicos, como mostrado no diagrama. Também precisamos dos métodos especiais, como o construtor. Nele, vamos receber os parâmetros necessários (nome, nacionalidade, idade, altura, peso, vitórias, derrotas e empates). A categoria não será passada: o sistema vai calcular automaticamente com base no peso.

Para o peso, em vez de atribuir diretamente, vamos chamar o método setter, pois sempre que o peso mudar a categoria será recalculada automaticamente. Isso é feito dentro do método setPeso: atribuiremos o valor e, em seguida, chamaremos setCategoria.

O método setCategoria verifica a faixa de peso e atribui a categoria correspondente: inválido, leve, médio ou pesado. O método será privado, porque somente a classe deve mudar a categoria.

Depois criamos os getters e setters dos outros atributos. Os métodos ganharLuta, perderLuta e empatarLuta incrementam as vitórias, derrotas e empates, respectivamente.

O método apresentar imprime uma introdução completa do lutador: nome, país, idade, altura, peso e número de lutas. O método status mostra um resumo mais simples: nome, categoria, vitórias, derrotas e empates.

No programa principal, vamos criar seis objetos. Para não ter variáveis separadas (l1, l2, l3...), vamos criar um vetor de seis posições e instanciar cada lutador usando o construtor.

Depois disso, podemos usar os métodos: apresentar, status, getCategoria, ganharLuta, empatarLuta etc.

Terminamos assim a classe Lutador. Mais à frente, você pode estar pensando: “Cadê o relacionamento entre classes?”. Calma: é aí que entra a classe Luta, que terá os atributos desafiado, desafiante (ambos do tipo Lutador), número de rounds e se a luta está aprovada.

Os métodos serão: marcarLuta e lutar. Tudo encapsulado, e os métodos da interface serão públicos. A relação entre Lutador e Luta é uma agregação: uma luta depende de lutadores, mas lutadores existem independentemente da luta. Isso veremos na próxima aula teórica, juntamente com o diagrama UML.

---
