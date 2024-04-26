import java.util.Scanner;

public class Capitulo {
    String nomeCap; 
    String texto;
    String escolha1;
    String escolha2;
    
    Scanner escolheuOpcao = new Scanner(System.in);

    public Capitulo(String nomeCap, String texto){
        this.nomeCap = nomeCap;
        this.texto = texto;
    }
}
