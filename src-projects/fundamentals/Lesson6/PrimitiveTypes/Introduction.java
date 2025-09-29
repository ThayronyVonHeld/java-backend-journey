package tiposprimitivos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String name = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float note = teclado.nextFloat();
        System.out.printf("%s note is: %.2f\n", name, note);
    }
}