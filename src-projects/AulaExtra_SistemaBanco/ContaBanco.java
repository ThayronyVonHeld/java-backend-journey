package AulaExtra_SistemaBanco;

import javafx.scene.Parent;

import java.util.Scanner;

public class ContaBanco {

    public int NumConta;
    protected String Tipo;
    private String Dono;
    private double saldo;
    private boolean Status;

    public ContaBanco(){
    
    }


    public void abrirConta(){
    Status = true;
        int Valor = 0;
        System.out.println("Bem Vindo ao Nosso Banco");
        System.out.println("Digite seu nome: ");
        Scanner teclado = new Scanner(System.in);
        Dono = teclado.nextLine();
        System.out.println("Digite o Tipo de conta:");
        System.out.println("Digite [1] para Conta Corrente ou Digite [2] para Conta Poupança: ");
        Valor = teclado.nextInt();
        if(Valor == 1){
            Tipo = "CC";
        }
        else if(Valor == 2){
            Tipo = "CP";
        }
        else{
            System.out.println("Resposta incorreta! Selecione [1] ou [2]!");
        }


    }

    public void setFecharConta(){
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
    public double setDepositar(){
        System.out.println("Digite o valor que deseja depositar: ");
        Scanner teclado = new Scanner(System.in);
        saldo += teclado.nextDouble();
        return saldo;
    }
public double SetSacar(){
        if(saldo > 0) {
            System.out.println("Digite o valor que deseja sacar: ");
            Scanner teclado = new Scanner(System.in);
            saldo -= teclado.nextDouble();
        }
        else {
            System.out.println("Sem saldo Disponivel para sacar ");
        }
    return saldo;
    }

    public double SetPagarMensal(){
        if(Tipo.equals("CC")){
            saldo = saldo - 12;
        }
        else{
            saldo = saldo - 20;
        }
        return saldo;
    }

    public int getNumConta() {
        return NumConta;
    }
}
