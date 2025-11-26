package AulaExtra_SistemaBanco;

import javafx.scene.Parent;

public class ContaBanco {

    public int NumConta;
    protected String Tipo;
    private String Dono;
    private double saldo;
    private boolean Status;

    public void abrirConta(){
    Status = true;
    }

    public void fecharConta{
        if(saldo == 0){
        Status = false;
        }
        if else(saldo < 0){
            System.out.println("Sua conta Posui saldo negativo, para fechar, deposite o valor restante");
        }
        else{
            System.out.println("Saque todo o valor da sua conta para fechar");
        }
    }

}
