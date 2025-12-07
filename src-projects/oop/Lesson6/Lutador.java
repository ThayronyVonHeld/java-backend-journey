package oop.Lesson6;

public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //construtor
    public void Lutador(String no, String na, int id, float al, float pe, String ca, int vi, int de, int em){
    setNome(no);
    setNacionalidade(na);
    setIdade(id);
    setAltura(al);
    setPeso(pe);
    setCategoria(ca);
    setVitorias(vi);
    setDerrotas(de);
    setEmpates(em);
    }
//metodos
    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + "anos");
        System.out.println(getAltura() + "m de Altura");
        System.out.println("Pesando: " + getPeso() + " kg");
        System.out.println("Ganhou: " + getVitorias() + " lutas");
        System.out.println("Perdeu: " + getDerrotas() + " lutas");
        System.out.println("Empatou: " + getEmpates() + " lutas");
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias() + " Vitorias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
    }
    public void ganharLuta(){
    setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
    setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
    setEmpates(getEmpates() + 1);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String no){
    this.nome = no;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }

    public float getAltura(){
        return altura;
    }
    public void setAltura(float al){
        this.altura = al;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String ca){
       if(peso < 52.2){
           categoria = "Inválido";
       }else if (peso <= 70.3){
           categoria = "Leve";
       } else if(peso <= 83.9){
           categoria = "Medio";
       } else if(peso <= 120.2){
           categoria = "pesado";
       } else{
           categoria = "Invalido!";
       }

    }

    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }

    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }

}
