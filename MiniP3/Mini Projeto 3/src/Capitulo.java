import java.util.Scanner;

public class Capitulo {
    String nomeCap; 
    String texto;
    String escolha1 = "Opção 1";
    String escolha2 = "Opção 2"; 
    Personagem personagem;
    int perderEnergia;
    int escolhaUsuario; //Armazenar escolha do usúario 
    Scanner escolheuOpcao = new Scanner(System.in);

    public Capitulo(String nomeCap, String texto, Personagem personagem){
        this.nomeCap = nomeCap;
        this.texto = texto;
        this.personagem = personagem;
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
        escolhaUsuario = escolha;
        return escolha; 
    }

    void Mostrar(){
        System.out.println("Você está no capítulo: " + nomeCap + " O nome do seu personagem é: " + personagem.nome
        + " E sua energia atualmente é: " + personagem.energia + " Suas escolhas até agora foram: " + (escolhaUsuario == 1 ? escolha1 : escolha2));

    }
}