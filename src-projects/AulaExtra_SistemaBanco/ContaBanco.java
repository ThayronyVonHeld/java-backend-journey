package AulaExtra_SistemaBanco;

import java.util.Scanner;

public class ContaBanco {

    public int NumConta;
    protected String Tipo;
    private String Dono;
    private double saldo;
    private boolean Status;

    Scanner teclado = new Scanner(System.in);

    public ContaBanco(){
    Status = false;
    saldo = 0;
    }


    public void abrirConta(){
    Status = true;
        int Valor = 0;

        System.out.print("Digite o Numero desejado da conta: ");

        NumConta = teclado.nextInt();

        System.out.print("Digite seu nome: ");
        Dono = teclado.next();

        System.out.println("Digite o Tipo de conta:");
        System.out.print("Digite [1] para Conta Corrente ou Digite [2] para Conta Poupança: ");
        Valor = teclado.nextInt();

        if(Valor == 1){
            Tipo = "Conta Corrente";
            saldo = 50;
        }
        else if(Valor == 2){
            Tipo = "Conta Poupança";
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
            System.out.println("Sua conta Posui saldo negativo, para fechar, deposite o valor restante: Valor restante: " + getSaldo());
        }
        else{
            System.out.println("Saque todo o valor da sua conta para fechar");
        }
    }
    public double setDepositar(){
        if(Status == true) {
            System.out.println("Digite o valor que deseja depositar: ");
            saldo += teclado.nextDouble();
        }
        else{
            System.out.println("Você precisa abrir sua conta antes de fazer um deposito!");
        }
        return saldo;
    }
public double SetSacar() {
    if (Status = true) {
        Double Saque = saldo;
        if (saldo > 0) {
            System.out.println("Digite o valor que deseja sacar: ");
            Saque -= teclado.nextDouble();
            if (Saque < 0) {
                System.out.println("Você escolheu um valor maior que o Disponivel, escolha um valor menor, ou deposite");
            }
        }
    }else {
            System.out.println("Você precisa abrir sua conta, antes de tentar efetuar um saque!");
        }
        return saldo;
}

    public double SetPagarMensal(){
        if(Tipo.equals("Conta Corrente")){
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
    public double setSaldo(){
        saldo = setSaldo();
    return setSaldo();
    }
}
