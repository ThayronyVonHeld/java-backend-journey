
Chegamos à aula 8A, e nessa aula vamos continuar o exercício que estávamos fazendo na aula anterior, que é o relacionamento entre classes. Vamos dar continuidade ao exercício do "Ultra Emoj Combat". Lembra que fizemos isso na aula passada? Então, é muito importante que eu te diga o seguinte: não adianta assistir à aula 8 sem assistir à aula 7. Eu sempre vou falar isso durante o curso, mas, especialmente nessa aula 8, é a continuação do exercício da aula 7. Então, se você ainda não fez os códigos da aula anterior, não vai conseguir acompanhar o conteúdo. A gente vai continuar de onde paramos na aula 7, então você precisa daquelas linhas de código para o algoritmo e para a linguagem que escolheu para acompanhar o curso.

Vamos dar uma recapitulada em como estava a nossa classe na aula anterior. Se você lembra, criamos a classe “Lutador”. Nessa classe, todos os atributos eram privados, porque começamos a usar o conceito de encapsulamento. Os métodos públicos estavam representados ali, e ainda tínhamos o método construtor, os métodos getters e setters. Tudo isso foi construído na aula anterior para a classe “Lutador”. Os atributos eram: nome, nacionalidade, idade, altura, peso, categoria, quantidade de vitórias, quantidade de derrotas e quantidade de empates.

Os métodos principais que criamos foram: “apresentar”, “mostrar status”, “ganhar”, “perder” e “empatar” uma luta. Também fizemos os métodos setters e getters, como o “setNome”, “getNome”, “setNacionalidade”, “getNacionalidade” e outros. Na aula anterior, conseguimos criar objetos da classe “Lutador”. Eu mostrei como construir um único objeto, mas você pode criar quantos objetos quiser.

É importante que você entenda que objetos são instâncias de classes. Para ter objetos, preciso ter uma classe que defina a estrutura deles. Isso tudo tem que estar claro na sua cabeça, e a prática é fundamental. Por isso, cada aula é um exercício diferente, para que não fiquem sequenciais e você não fique preso se não entender uma aula anterior.

Na aula de hoje, vamos aprender como relacionar uma classe com outra. Uma classe já é poderosa porque ela encapsula dados e funcionalidades. Ela é ainda mais poderosa porque pode ser relacionada com outras classes. Existem vários tipos de relacionamentos, e o que vamos ver hoje é um tipo específico, chamado **agregação**.

Deixe-me explicar melhor: você está vendo dois objetos “Lutador” do lado. Ambos são instâncias da mesma classe e têm estados diferentes, mas compartilham os mesmos atributos e métodos. Agora, vou criar uma classe para fazer com que eles possam lutar entre si. Vou criar a classe “Luta”. Vou representar a classe “Luta” com dois quadrados: um para os atributos e outro para os métodos. Os atributos dessa classe serão: desafiado, desafiante, quantidade de rounds e se a luta está aprovada ou não.

Os atributos desafiado e desafiante não são caracteres, mas são instâncias da classe “Lutador”. Isso é o que chamamos de tipo abstrato de dados. Ou seja, os dois são objetos de outra classe. Além disso, a classe “Luta” terá dois métodos principais: “marcarLuta” e “lutar”. Esses métodos vão fazer a luta acontecer. Claro que você pode criar uma classe de luta mais avançada, com mais funcionalidades, mas aqui estamos simplificando para dar foco à aprendizagem.

A agregação é um tipo de relacionamento que representa algo como "tem um". Então, se uma classe A tem um atributo que é da classe B, esse relacionamento é uma agregação. Vamos usar esse conceito na prática e criar o diagrama de classes. A linha sólida com um losango branco na ponta é a representação de agregação. Nesse caso, a relação é: "um lutador disputa uma luta", o que se chama de **multiplicidade**. Cada lutador pode participar de várias lutas, e cada luta pode ser disputada por vários lutadores.

No método “marcarLuta”, vamos passar os parâmetros dos dois lutadores, verificar se eles têm a mesma categoria e se são lutadores diferentes. Se tudo estiver certo, a luta é aprovada e podemos seguir para o método “lutar”, que vai decidir o vencedor da luta aleatoriamente.

O método “lutar” verifica se a luta está aprovada. Se estiver, ele apresenta os lutadores e gera um número aleatório para decidir o vencedor. Se o vencedor for o desafiado, ele recebe uma vitória e o desafiante uma derrota. Se o vencedor for o desafiante, ele recebe a vitória e o desafiado perde. Se for empate, ambos recebem um empate no cartel.

A classe “Luta” e a classe “Lutador” estão relacionadas por agregação. Ou seja, um lutador “tem” uma luta. Você pode criar quantas lutas e lutadores quiser, e o código vai funcionar de forma mais simples e organizada, graças à programação orientada a objetos.


