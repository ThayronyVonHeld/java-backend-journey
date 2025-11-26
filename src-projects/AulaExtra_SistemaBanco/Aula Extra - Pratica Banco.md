Aqui iremos xecutar um Exercicio Proposto pelo Curso Em Video

Conta de Banco

O exercicio proposto é abrir uma conta corrente(pessoa 1) e uma conta poupança(pessoa 2), depos qualquer uma das duas pessoas
podem sacar seu dinheiro!

Então para começar precisamos pensar o que precisamos para criar objetos, como vimos anteriormente, todo objeto é composto 
de um conjunto de propriedades, seu conjunto de metodos e seu estado atual. Na hora de idealizar uma nva classe, vamos pensar
tudo em forma de seus atributos e metodos

atributos - são dados que o objeto tem dentro
metodos - são procedimentos, funções, "pequenos programas que existem dentro dos objetos"

Classe banco:

atributos
+numConta 
#tipo // só pode aceitar dois valores, conta poupança(cc) e conta corrente(cp), 
-dono // Pessoa responsavel pela conta
-saldo
-bolean status // Para verificar se a conta está aberta ou não

metodos
+abrirConta() // mudar o status para verdadeiro
+fecharConta() // para fechar não pode ter dinheiro em conta(precisasacr), e não pode fechar se tiver debito (vai precisar depositar)
+depositar() // Para fazer deposito a conta precisa estar aberta (status verdadeiro)
+sacar() // a conta precisa estar aberta e precisa ter saldo também! A classe não pode permitir que saque um valor maior que o que você tem disponivel
+pagarMensal() // Cobrada automaticamente quando chamar o metodo pagarMensal(para cc paga 12 reais, para cp paga 20reais)


**Bonus de 50 reais para quem abrir conta corrente** 
se for conta poupança ganha 150 reais

vamos usar get e set para todos os atributos!
getnumConta()
setnumConta()
getTipo()
setTipo()

e por ai vai para cada um atributo

E teremos um metodo construtor! Sempre que uma nova conta for criada, seu status será definido como falso ou seja a conta está fechado e o saldo 0 