package ex34_login;


import java.util.Scanner;

public class sistemaLogin {
    public static void main(String[] args) {
        String username = "ThayronyVonHeld";
        String passoword = "@123456";
        String user = "";
        String pin = "";

        Scanner teclado = new Scanner(System.in);


        do{

            System.out.println("Digite o seu usuario: ");
            user = teclado.next();
            System.out.println("Digite sua senha: ");
            pin = teclado.next();

        }while(!username.equals(user) && (!passoword.equals(pin)));




    }
}
