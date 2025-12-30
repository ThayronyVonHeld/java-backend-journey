package Module02.Exercicies.Caneta;

public class Caneta {
        public String modelo;
        public String cor;
        private Float ponta;
        protected int carga;
        private boolean tampada;

        public void status(){
                System.out.println("Modelo: " + this.modelo);
                System.out.println("Uma caneta " + this.cor);
                System.out.println("Ponta: " + this.ponta); // This é o objeto a ser chamado, this.ponta -> C1/C2/C3 -> Esses objetos são o this.c1
                System.out.println("Carga: " + this.carga);
                System.out.println("Está tampada? " + this.tampada);
        }
        public void rabiscar(){
        if(this.tampada == true){
                System.out.println("Error! Não posso posso rabiscar");
        }else{
                System.out.println("Estou Rabiscando");
        }
        }
        public void tampar(){
        this.tampada = true;
        }
        public void destampar(){
        this.tampada = false;
        }
    }

