package ex24_simpleMultiplicationTable;

import java.util.Scanner;

public class tab {
    public static void main(String[] args) {

        int n1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a tabuada que deseja consultar: ");
        n1 = teclado.nextInt();

        for (int i = 0; i <= n1; i++){
            System.out.println(i);
        }


    }
}
