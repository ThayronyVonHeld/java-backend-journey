package AulaExtra_SistemaBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sair = 0;
        int Escolha;
        do{
           System.out.println("---------------------------------");
            System.out.println("Bem Vindo ao Nosso Banco");
            System.out.println("---------------------------------");
            System.out.println("Digite [1] para Abrir conta");
            System.out.println("Digite [2] para para Fechar conta");
            System.out.println("Digite [3] para fazer um deposito");
            System.out.println("Digite [4] para fazer um saque");
            System.out.println("Digite [5] para pagar a mensalidade");
            System.out.println("Digite [6] para sair");
            System.out.println("Digite sua escolha: ");

            Scanner teclado = new Scanner(System.in);
            Escolha = teclado.nextInt();

            if(Escolha == 1){
                ContaBanco pessoa = new ContaBanco();
                pessoa.abrirConta();
            }

        }while(sair != 6);

    }
}