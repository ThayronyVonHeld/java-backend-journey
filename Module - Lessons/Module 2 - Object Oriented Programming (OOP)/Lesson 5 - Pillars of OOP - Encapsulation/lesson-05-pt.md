

## **TEXTO ORGANIZADO**

Agora falaremos sobre um conceito muito importante, que é o encapsulamento. Na nossa sequência lógica já falamos sobre objeto, construção de objetos, classes, atributos, métodos, vimos alguns exemplos, visibilidade, e agora vamos começar a falar sobre os pilares da Programação Orientada a Objetos.

A Programação Orientada a Objetos possui três pilares que vamos reconhecer: encapsulamento, herança e polimorfismo. O “E” é de encapsulamento, o “H” é de herança e o “P” é de polimorfismo.

Você pode estar se perguntando: “Mas o meu professor disse que são quatro pilares, incluindo abstração”. Sim, há bibliografias que consideram quatro pilares: abstração, encapsulamento, herança e polimorfismo. Porém, na bibliografia que estamos estudando, consideramos apenas três, pois a abstração está dentro do encapsulamento. Abstrair é selecionar apenas o que importa. Por exemplo: um ser humano possui inúmeras características, mas se eu quero tratá-lo como cliente, só preciso de nome, CPF e endereço. O resto não importa naquele contexto.

Vamos trabalhar então com o modelo de três pilares: encapsulamento, herança e polimorfismo. Começaremos pelo primeiro: o encapsulamento.

### **O Encapsulamento**

Encapsulamento é como colocar algo dentro de uma cápsula. Pense em uma pilha: ela é uma cápsula. Já se perguntou por que a pilha precisa ser encapsulada? Dentro dela há componentes químicos responsáveis por gerar energia. Esses componentes podem danificar a pele ou mucosas, então a cápsula protege você da pilha e a pilha de você — é uma proteção de mão dupla.

Além disso, a cápsula cria um padrão. Pilhas do mesmo tipo possuem sempre o mesmo formato e podem ser usadas em aparelhos diferentes. O importante é o padrão externo; o funcionamento interno não importa desde que a energia fornecida seja a mesma. Uma pilha comum, uma alcalina ou recarregável funcionam internamente de formas diferentes, mas se a cápsula e a voltagem são compatíveis, elas podem ser usadas no mesmo aparelho.

Esse é exatamente o conceito de encapsulamento em programação. Um software encapsulado:

* segue um mesmo padrão;
* protege o usuário (programador) do código e o código do usuário;
* oferece uma interface externa, e o funcionamento interno não importa — desde que o resultado seja o mesmo.

Encapsular é **ocultar partes independentes da implementação**, criando partes invisíveis ao mundo exterior. Assim como você não precisa saber o processo químico da pilha para usá-la, o programador que usa um objeto não deve precisar conhecer seus detalhes internos.

### **Mensagem e Interface**

Na POO, a comunicação entre o mundo externo e o objeto acontece via **mensagens**: você envia uma mensagem (chama um método) e a cápsula responde. Você não entra na cápsula; apenas utiliza sua interface.

A interface é a lista de serviços que o objeto disponibiliza ao mundo externo. É o que pode ser feito com o objeto — nada mais.

Assim como a pilha possui dois polos como interface, um objeto encapsulado possui métodos públicos que permitem interação sem expor sua estrutura interna.

### **Encapsulamento não é obrigatório, mas é uma boa prática**

Sem encapsulamento é possível programar orientado a objetos, mas o código fica frágil. Encapsular produz classes mais eficientes.

As três grandes vantagens do encapsulamento são:

1. **Tornar mudanças internas invisíveis**
   Você pode modificar a implementação interna desde que a interface permaneça a mesma.

2. **Facilitar a reutilização**
   Uma classe encapsulada pode ser usada em vários projetos.

3. **Reduzir efeitos colaterais**
   O código externo não prejudica o interno e vice-versa.

---

## **O Controle Remoto como Exemplo**

Vamos encapsular um objeto real: um controle remoto. Antes da cápsula (a carcaça), você teria contato direto com circuitos, fios e bateria, correndo risco de danificar o aparelho. Com a cápsula, você tem apenas botões: menu, ligar, desligar, mudo, volume, play, pause. Estes botões formam a **interface** do objeto.

Você não precisa saber como cada ação é implementada internamente. Isso é encapsulamento.

Outro exemplo é o carro: você usa volante, pedais e alavancas, sem precisar saber o funcionamento interno do motor. Os controles são a interface; o motor e seus mecanismos estão encapsulados.

---

## **Como Encapsular na Prática (UML e Código)**

### **A Interface**

No UML, interface é representada como uma classe sem atributos, apenas métodos. Ela lista o que pode ser feito, mas **não implementa** o que acontece.

Criamos a interface **Controlador**, contendo métodos como:

* ligar
* desligar
* abrirMenu
* fecharMenu
* maisVolume
* menosVolume
* ligarMudo
* desligarMudo
* play
* pause

Esses são **métodos abstratos**: previstos, mas não implementados.

Na prática, em código, criamos algo como:

```
interface Controlador {
    public abstract function ligar();
    public abstract function desligar();
    ...
}
```

### **A Classe**

A classe ControleRemoto terá atributos:

* volume
* ligado
* tocando

Todos privados.

A classe implementará a interface:

```
class ControleRemoto implements Controlador {
    ...
}
```

Ao implementar a interface, a classe é obrigada a implementar todos os métodos abstratos.

Também criamos:

* **Construtor**
* **Getters e Setters** (métodos especiais)

Na prática:

* ligar() chama setLigado(true)
* desligar() chama setLigado(false)
* abrirMenu() mostra estado do volume, ligado e tocando
* maisVolume() só funciona se estiver ligado
* menosVolume() idem
* ligarMudo() coloca volume em 0
* desligarMudo() restaura volume
* play() funciona se estiver ligado e não tocando
* pause() funciona se estiver tocando

---
