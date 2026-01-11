package Module02.Project.ProjetoYouTube;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 02 de POO");
        v[2] = new Video("Novo Curso MySQL!");

        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Thayrony", 21, "M", "theld");
        g[1] = new Gafanhoto("Clara", 27, "F", "clarita");

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
