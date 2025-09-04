package pc;

public class Computador {
    // Atributos
    private String processador;
    private String placaMae;
    private int memoriaRam;
    private String placaDeVideo;
    private String fonteAlimentacao;

    // Construtor default (sem parâmetros)
    public Computador() {
        this.processador = "";
        this.placaMae = "";
        this.memoriaRam = 0;
        this.placaDeVideo = "";
        this.fonteAlimentacao = "";
    }

    // Construtor com parâmetros
    public Computador(String processador, String placaMae, int memoriaRam, String placaDeVideo, String fonteAlimentacao) {
        this.processador = processador;
        this.placaMae = placaMae;
        this.memoriaRam = memoriaRam;
        this.placaDeVideo = placaDeVideo;
        this.fonteAlimentacao = fonteAlimentacao;
    }

    // Getters e Setters
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getFonteAlimentacao() {
        return fonteAlimentacao;
    }

    public void setFonteAlimentacao(String fonteAlimentacao) {
        this.fonteAlimentacao = fonteAlimentacao;
    }

    // Método imprimir
    public void imprimir() 
    {
          System.setProperty("file.encoding", "UTF-8");
        System.out.println("Processador: " + processador);
        System.out.println("Placa-mãe: " + placaMae);
        System.out.println("Memória RAM: " + memoriaRam + " GB");
        System.out.println("Placa de Vídeo: " + placaDeVideo);
        System.out.println("Fonte de Alimentação: " + fonteAlimentacao);
        System.out.println("---------------------------");
    }
}
