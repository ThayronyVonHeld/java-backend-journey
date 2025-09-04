package pc;

import java.util.Scanner;

public class TesteComputador {
    public static void main(String[] args) {
        // Criando 2 objetos com construtor default
          System.setProperty("file.encoding", "UTF-8");
        try (Scanner sc = new Scanner(System.in)) {
            // Criando 2 objetos com construtor default
            Computador c1 = new Computador();
            Computador c2 = new Computador();
            
            // Preenchendo atributos com SETTERS
            System.out.println("Digite os dados do Computador 1:");
            System.out.print("Processador: ");
            c1.setProcessador(sc.nextLine());
            System.out.print("Placa-mãe: ");
            c1.setPlacaMae(sc.nextLine());
            System.out.print("Memória RAM (GB): ");
            c1.setMemoriaRam(sc.nextInt());
            sc.nextLine(); // limpar buffer
            System.out.print("Placa de Vídeo: ");
            c1.setPlacaDeVideo(sc.nextLine());
            System.out.print("Fonte de Alimentação: ");
            c1.setFonteAlimentacao(sc.nextLine());
            
            System.out.println("\nDigite os dados do Computador 2:");
            System.out.print("Processador: ");
            c2.setProcessador(sc.nextLine());
            System.out.print("Placa-mãe: ");
            c2.setPlacaMae(sc.nextLine());
            System.out.print("Memória RAM (GB): ");
            c2.setMemoriaRam(sc.nextInt());
            sc.nextLine();
            System.out.print("Placa de Vídeo: ");
            c2.setPlacaDeVideo(sc.nextLine());
            System.out.print("Fonte de Alimentação: ");
            c2.setFonteAlimentacao(sc.nextLine());
            
            // Criando 2 objetos com construtor com parâmetros
            System.out.println("\nDigite os dados do Computador 3:");
            System.out.print("Processador: ");
            String proc3 = sc.nextLine();
            System.out.print("Placa-mãe: ");
            String placa3 = sc.nextLine();
            System.out.print("Memória RAM (GB): ");
            int ram3 = sc.nextInt();
            sc.nextLine();
            System.out.print("Placa de Vídeo: ");
            String video3 = sc.nextLine();
            System.out.print("Fonte de Alimentação: ");
            String fonte3 = sc.nextLine();
            
            Computador c3 = new Computador(proc3, placa3, ram3, video3, fonte3);
            
            System.out.println("\nDigite os dados do Computador 4:");
            System.out.print("Processador: ");
            String proc4 = sc.nextLine();
            System.out.print("Placa-mãe: ");
            String placa4 = sc.nextLine();
            System.out.print("Memória RAM (GB): ");
            int ram4 = sc.nextInt();
            sc.nextLine();
            System.out.print("Placa de Vídeo: ");
            String video4 = sc.nextLine();
            System.out.print("Fonte de Alimentação: ");
            String fonte4 = sc.nextLine();
            
            Computador c4 = new Computador(proc4, placa4, ram4, video4, fonte4);
            
            // Exibindo os dados dos 4 computadores
            System.out.println("\n--- Lista de Computadores ---");
            c1.imprimir();
            c2.imprimir();
            c3.imprimir();
            c4.imprimir();
        }
    }
}
