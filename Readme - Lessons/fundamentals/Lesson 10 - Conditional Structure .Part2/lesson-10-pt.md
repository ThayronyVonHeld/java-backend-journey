Aula 10 -

Vamos dar prosseguimento a aula 9 Estruturas Condicionais, logo essa aula será a parte 2!

Com isso iremos falar sobre:

Estruturas Condicionais compostas encadeada
ou Condição Composta Encadeada

Chamamos de estruturas de decisão encadeadas, quando uma estrutura de decisão está localizada dentro do lado falso da outra. Este tipo de estrutura também é conhecida como seleção “aninhada” ou seleção “encaixada”.

Utilizando um exemplo parecido da aula anterior, sobre idade, porém agora utilizando estruturas aninhadas:

```mermaid
flowchart TD
    A[INÍCIO] --> B[Digite o ano em que nasceu]
    B --> C[Ler ano]
    [idade = 2025 - ano] 
    C --> D{idade >= 18?}
    D -->|SIM| E[Maior de idade]
    D -->|NÃO| F[Menor de idade]
    E --> G[FIM]
    F --> G
```
em portugol 

```portugol
algoritmo "VerificaMaioridade"
var
    idade: inteiro, ano
inicio
    Escreva("Digite o ano em que nasceu: ")
    Leia(ano)
    idade = 2025 - ano
    escreva("Voce tem: " + ano "anos")
    Se ((idade >= 18) && (idade < 65)) então
        Escreva("Seu voto é obrigatorio")
    Senão Se ((idade => 16) && (idade < 18)) 
        Escreva("Você é menor de idade, seu voto é opcional")
        Senão se (idade < 16)
        Escreva("Você é menor de idade, ainda não pode votar!")
        Senão se (idade > 65)
        Escreva("Você é maior de idade e não precisa mais votar")
    FimSe
fimalgoritmo
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o ano em que nasceu: ");
        int ano = teclado.nextInt();
        int idade = 2025 - ano;
        
        System.out.println("Sua idade é: " + idade);

        if ((idade >= 18) && (idade < 65)) {
            System.out.println("Você é maior de idade, seu voto é obrigatorio");
        } else if ((idade >= 16) && (idade < 18)){
            System.out.println("Você é menor de idade, seu voto é opcional");
        }
        else if(idade < 16) {
            System.out.println("Você é menor de idade, não pode votar ainda");
        }
        else if (idade > 65){
            System.out.println("Você é maior de idade, seu voto é opcional");
        }
    }
}
```

Essa são as estruturas condicionais aninhadas!
