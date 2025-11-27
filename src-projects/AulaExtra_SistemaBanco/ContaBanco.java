package AulaExtra_SistemaBanco;

import java.util.Scanner;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    Scanner teclado = new Scanner(System.in);

    public ContaBanco(){
    status = false;
    saldo = 0;
    }


    public void abrirConta(){
    status = true;
        int Valor = 0;

        System.out.print("Digite o Numero desejado da conta: ");

        numConta = teclado.nextInt();

        System.out.print("Digite seu nome: ");
        dono = teclado.next();

        System.out.println("Digite o Tipo de conta:");
        System.out.print("Digite [1] para Conta Corrente ou Digite [2] para Conta Poupança: ");
        Valor = teclado.nextInt();

        if(Valor == 1){
            tipo = "Conta Corrente";
            saldo = 50;
        }
        else if(Valor == 2){
            tipo = "Conta Poupança";
            saldo = 150;
        }
        else{
            System.out.println("Resposta incorreta! Selecione [1] ou [2]!");
        }


    }

    public void setfecharConta(){
        if(saldo == 0){
        status = false;
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
        if(status == true) {
            System.out.println("Digite o valor que deseja depositar: ");
            saldo += teclado.nextDouble();
        }
        else{
            System.out.println("Você precisa abrir sua conta antes de fazer um deposito!");
        }
        return saldo;
    }
public double SetSacar() {
    if (status = true) {
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
        if(tipo.equals("Conta Corrente")){
            saldo = saldo - 12;
        }
        else{
            saldo = saldo - 20;
        }
        return saldo;
    }

    public int getnumConta() {
        return numConta;
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
