package AulaExtra_SistemaBanco;

import java.util.Scanner;

public class ContaBanco {

    public int NumConta;
    protected String Tipo;
    private String Dono;
    private double saldo;
    private boolean Status;

    public ContaBanco(){
    Status = false;
    saldo = 0;
    }


    public void abrirConta(){
    Status = true;
        int Valor = 0;

        System.out.println("Digite o Numero desejado da conta: ");
        Scanner teclado = new Scanner(System.in);
        NumConta = teclado.nextInt();

        System.out.println("Digite seu nome: ");
        Scanner teclado = new Scanner(System.in);
        Dono = teclado.nextLine();

        System.out.println("Digite o Tipo de conta:");
        System.out.println("Digite [1] para Conta Corrente ou Digite [2] para Conta Poupança: ");
        Scanner teclado = new Scanner(System.in);
        Valor = teclado.nextInt();

        if(Valor == 1){
            Tipo = "CC";
            saldo = 50;
        }
        else if(Valor == 2){
            Tipo = "CP";
            saldo = 150;
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
        if(Status == true) {
            System.out.println("Digite o valor que deseja depositar: ");
            Scanner teclado = new Scanner(System.in);
            saldo += teclado.nextDouble();
        }
        else{
            System.out.println("Você precisa abrir sua conta antes de fazer um deposito!");
        }
        return saldo;
    }
public double SetSacar(){
        if(Status = true) {
        if (saldo > 0) {
            System.out.println("Digite o valor que deseja sacar: ");
            Scanner teclado = new Scanner(System.in);
            saldo -= teclado.nextDouble();
        } else {
            System.out.println("Sem saldo Disponivel para sacar ");
        }
    }
        else{
            System.out.println("Você precisa abrir sua conta, antes de tentar efetuar um saque!");
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

    public double getSaldo(){
        System.out.println("Valor disponivel na conta é: " + saldo);
return saldo;
    }
}
