package fundamentals.Lesson10.SistemaDeVotacao;

import java.util.Scanner;

public class TRE {
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