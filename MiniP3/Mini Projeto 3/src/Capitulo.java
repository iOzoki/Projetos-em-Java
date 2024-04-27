import java.util.Scanner;

public class Capitulo {
    String nomeCap; 
    String texto;
    String escolha1;
    String escolha2;
    Personagem personagem;
    int perderEnergia;
    Scanner escolheuOpcao = new Scanner(System.in);

    void Mostrar(){
        System.out.println();

    }

    public Capitulo(String nomeCap, String texto){
        this.nomeCap = nomeCap;
        this.texto = texto;
    }

    public int Escolher(){
        System.out.println("Escolha sua opção:");
        System.out.println("1. " + escolha1);
        System.out.println("2. " + escolha2);
    
        int escolha = escolheuOpcao.nextInt(); 
        while (escolha < 1 || escolha > 2) {
            System.out.println("Opção inválida. Escolha novamente:");
            escolha = escolheuOpcao.nextInt(); 
        }
        return escolha; 
    }
}