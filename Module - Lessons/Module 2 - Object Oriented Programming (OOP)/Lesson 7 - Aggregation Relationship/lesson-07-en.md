Durante essas aulas, a gente trabalhou o relacionamento entre classes. Eu mostrei como dar uma aprimorada no exemplo do Ultra Emoji Combat. O que fizemos na aula teórica agora vamos aplicar diretamente na aula prática, utilizando como base a linguagem Java. Se você se lembra bem da última aula, eu mostrei como fazer a ligação entre as duas classes, Lutador e Luta, por meio de uma agregação.

Se você não sabe o que é relacionamento entre classes, o que é agregação e como tudo isso funciona, é porque você pulou a aula teórica ou não prestou atenção direito. Na aula passada, criamos objetos, instanciamos objetos de uma determinada classe e fizemos a ligação desses objetos com outra classe, que no nosso caso é a classe Luta. Temos dois objetos da classe Lutador e, na classe Luta, os atributos desafiado e desafiante, que são instâncias de Lutador. É assim que acontece a ligação entre as classes.

Se você assistiu à aula teórica, você já sabe disso. Caso ainda não saiba, assista à aula teórica na playlist do curso de Programação Orientada a Objetos na linguagem escolhida, seja Java ou PHP. Sem as aulas 07A, 07B e 08A, você não consegue dar prosseguimento, porque muitos dos códigos utilizados aqui foram feitos anteriormente. Não adianta pular etapas e depois dizer que programação orientada a objetos é difícil.

Basicamente, o código que criamos foi esse que está aparecendo ao lado. Instanciamos objetos da classe Lutador e criamos a classe Luta, que utiliza duas vezes a classe Lutador. Isso mostra claramente a relação entre elas. Agora vamos entrar no ambiente de desenvolvimento e abrir o mesmo projeto da aula passada para ver como tudo funciona na prática.

No NetBeans, abrimos o projeto Ultra Emoji Combat. Dentro do pacote, já temos a classe Lutador e a classe principal, onde cadastramos os lutadores em um vetor. Agora vamos criar uma nova classe chamada Luta. Nessa classe, começamos criando os atributos: desafiado e desafiante, ambos do tipo Lutador, além de rounds e um atributo lógico chamado aprovada.

Depois disso, criamos os métodos públicos marcarLuta e lutar. O código em Java fica muito parecido com o algoritmo visto anteriormente. Também criamos os métodos getters e setters automaticamente, inclusive para atributos do tipo abstrato, como Lutador. O Java lida muito bem com isso, e não precisamos nos preocupar.

Com os atributos e métodos criados, partimos para a implementação do método marcarLuta. Esse método recebe dois parâmetros do tipo Lutador e verifica se eles podem lutar. Primeiro, checamos se eles pertencem à mesma categoria e se não são o mesmo lutador. Como categoria é uma String, usamos o método equals em vez de “==”. Se as condições forem satisfeitas, a luta é aprovada e os lutadores são definidos como desafiado e desafiante. Caso contrário, a luta não é aprovada e os atributos são definidos como null.

Em seguida, implementamos o método lutar. Esse método não recebe parâmetros. Primeiro, verificamos se a luta está aprovada. Se não estiver, exibimos uma mensagem dizendo que a luta não pode acontecer. Se estiver aprovada, apresentamos o desafiado e o desafiante, e então geramos um resultado usando a classe Random do Java.

O resultado pode ser empate, vitória do desafiado ou vitória do desafiante. Usamos a estrutura switch para tratar cada caso. No empate, ambos os lutadores empatam a luta. Nos outros casos, um ganha e o outro perde, utilizando os métodos definidos na classe Lutador. Tudo isso atualiza automaticamente o histórico de vitórias, derrotas e empates.

Depois de implementar a classe Luta, voltamos ao código principal. Criamos um objeto da classe Luta e chamamos o método marcarLuta, passando dois lutadores como parâmetros. Em seguida, chamamos o método lutar. Ao executar o programa, os lutadores são apresentados, o resultado da luta é exibido e os dados são atualizados corretamente.

Também testamos situações inválidas, como tentar marcar uma luta entre o mesmo lutador ou entre lutadores de categorias diferentes. Em todos os casos, o sistema impediu corretamente que a luta acontecesse. Quando os lutadores pertencem à mesma categoria, a luta acontece sem problemas.

Por fim, o objetivo é te incentivar a criar classes melhores e mais completas. Durante a aula, não dá para criar algo muito complexo, mas você pode melhorar o sistema. Por exemplo, o resultado da luta poderia levar em conta peso, experiência, número de vitórias ou algo no estilo RPG. Use isso como exercício para treinar e aprofundar seus conhecimentos em programação orientada a objetos.
