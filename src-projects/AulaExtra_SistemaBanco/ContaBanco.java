package AulaExtra_SistemaBanco;

import javafx.scene.Parent;

import java.util.Scanner;

public class ContaBanco {

    public int NumConta;
    protected String Tipo;
    private String Dono;
    private double saldo;
    private boolean Status;

    public void abrirConta(){
    Status = true;
    }

    public void fecharConta(){
        if(saldo == 0){
        Status = false;
            System.out.println("Sua Conta foi Fechada");
        }
       else if (saldo < 0){
            System.out.println("Sua conta Posui saldo negativo, para fechar, deposite o valor restante");
        }
        else{
            System.out.println("Saque todo o valor da sua conta para fechar");
        }
    }
    public double depositar(){
        double deposito = 0;
        System.out.println("Digite o valor que deseja depositar: ");
        Scanner teclado = new Scanner(System.in);
        deposito = teclado.nextDouble();
        return deposito;
    }
public double sacar(){
    double saque = 0;
        if(saldo > 0) {
            System.out.println("Digite o valor que deseja sacar: ");
            Scanner teclado = new Scanner(System.in);
            saque = teclado.nextDouble();
        }
        else {
            System.out.println("Sem saldo Disponivel para sacar ");
        }
    return saque;
    }


}
