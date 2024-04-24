public class Personagem {
    String nome;
    int vidaBase = 100;
    int energia = 100;
    int executarAcao = -20;
    void Ataque(){
    
    }
    public Personagem(String nome, int energia, int vidaBase ){
        this.nome = nome;
        this.energia = energia;
        this.vidaBase = vidaBase;
    }
    
    void Acao(int perderEnergia){
         energia -= perderEnergia;
         System.out.println("Você consumiu 20 de energia para seguir o capítulo adiante. Sua energia atual é: " + energia);
         if (energia < 0){
            System.out.println("O personagem precisa descansar, tome alguma poção ou durma para recuperar a energia!");
         }
    }
   
}


