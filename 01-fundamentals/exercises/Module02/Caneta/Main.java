package Module02.Caneta;

public class Main {
    public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.modelo = "BIC cristal";
    c1.cor = "Azul";
    // ERROR Atributo Privado c1.ponta = 0.5f;
        c1.carga = 50;
      //  c1.tampada = false;
        c1.tampar();
    c1.status();
    c1.rabiscar();
    }
}
