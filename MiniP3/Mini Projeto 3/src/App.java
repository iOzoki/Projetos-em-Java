import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner escaneiaInformação = new Scanner(System.in);
        
        Personagem varProtagonista = new Personagem("", 100, 100);

        Monstro varMonstro = new Monstro();
        
        
        String textoCap1 = "Em um reino distante, uma floresta encantada guarda segredos antigos e perigos desconhecidos."
        + "Você é um aventureiro corajoso que decidiu explorar seus mistérios."
        + "Sua jornada começa quando você se depara com uma bifurcação na estrada que adentra a floresta."
        + "Você tem duas opções:\nOpção 1: Seguir o caminho iluminado pelo sol, que parece seguro e familiar."
        + "\nOpção 2: Entrar na trilha sombria e misteriosa, que promete aventuras desconhecidas.";

        Capitulo capitulo1 = new Capitulo("\nCapítulo 1 - A dualidade da luz e das sombras.\n----------------------------------------------------------\n", textoCap1);
        
        String textoCap2Escolha1 = "\nAo seguir o caminho iluminado, você encontra uma clareira tranquila, mas logo se depara com um rio furioso bloqueando o caminho." 
            + "Você pode tentar construir uma ponte ou procurar por uma passagem secreta nas margens do rio.\nConstruir uma ponte(Opção 1):"
            + "Leva você a enfrentar o monstro da floresta que não esta disposto a deixá-lo prosseguir facilmente."
            + "\nProcurar uma passagem secreta(Opção 2): Você descobre uma caverna oculta, mas está cheia de enigmas e perigos que testarão sua inteligência e habilidades.";

        Capitulo capitulo2escolha1 = new Capitulo("\nCapítulo 2 - A luz que cega.\n----------------------------------------------------------\n", textoCap2Escolha1);

        String textoCap2Escolha2 = "A trilha sombria revela-se repleta de desafios imprevistos. Você se depara com uma árvore gigante com raízes que bloqueiam seu caminho." 
            + "Você pode tentar escalar a árvore ou contorná-la por entre a densa vegetação.\nEscalar a árvore(Opção 1): Conduz a um ninho de pássaros gigantes que protegem" 
            + "ferozmente seu território.\nContornar a árvore(Opção 2): Leva você a descobrir" 
            + "uma antiga ruína, onde criaturas esquecidas pelo tempo guardam segredos valiosos.";
        
        Capitulo capitulo2escolha2 = new Capitulo("\nCapítulo 2 - A trilha sombria e misteriosa.\n----------------------------------------------------------\n", textoCap2Escolha2);

         String textoCap3Escolha1Escolha1 = ("Construir uma ponte: Depois de enfrentar o monstro da floresta" + varMonstro.nome + "e construir uma ponte sobre o rio, você finalmente"
                + "alcança o outro lado. No entanto, ao atravessar, você descobre que a ponte está instável e desaba, deixando-o preso em uma parte desconhecida da floresta," 
                + "sem uma maneira fácil de voltar.");

        Capitulo capitulo3escolha1escolha1 = new Capitulo("\nCapítulo 3 - Sem enxergar no escuro.\n----------------------------------------------------------\n", textoCap3Escolha1Escolha1);

         String textoCap3Escolha1Escolha2 = "Procurar uma passagem secreta: Ao desvendar os enigmas e perigos da caverna oculta, você finalmente chega ao seu final." 
                + "No entanto, para sua surpresa, a passagem leva a uma câmara subterrânea que está desmoronando lentamente. Com o tempo se esgotando e as saídas bloqueadas," 
                + "você percebe que está preso dentro da caverna e seu único destino é a morte.";

        Capitulo capitulo3escolha1escolha2 = new Capitulo("\nCapítulo 3 - O tempo para refletir os pecados.\n----------------------------------------------------------\n", textoCap3Escolha1Escolha1);

         String textoCap3Escolha2Escolha1 = "Depois de enfrentar os pássaros gigantes e escalar a árvore, você alcança o topo, apenas para descobrir que está diante de um" 
        + "abismo profundo. Sem uma maneira de prosseguir, você fica preso no alto da árvore, incapaz de retornar ao chão. Com o passar do tempo," 
        + "você se vê obrigado a aceitar seu destino, resignando-se à solidão do alto da árvore.";

        Capitulo capitulo3escolha2escolha1 = new Capitulo("\nCapítulo 3 - A solitude.\n----------------------------------------------------------\n", textoCap3Escolha2Escolha1);

         String textoCap3Escolha2Escolha2 = "Ao explorar a antiga ruína além da árvore, você desvenda segredos valiosos e encontra artefatos antigos. No entanto, ao tentar sair"
                + "da ruína, você acidentalmente ativa uma armadilha antiga que bloqueia todas as saídas. Percebendo que está preso sem esperança de escapar,"
                + "você se resigna ao seu destino, sabendo que sua jornada na floresta chegou a um fim prematuro.";

        Capitulo capitulo3escolha2escolha2 = new Capitulo("\nCapítulo 3 - O perigo do conhecer.\n----------------------------------------------------------\n", textoCap3Escolha2Escolha2);

        System.out.println("Olá, jogador! Bem-vindo aos Segredos das Matas das Sombras. Para iniciarmos a história, como prefere ser chamado?");
        
        varProtagonista.nome = escaneiaInformação.nextLine();
        System.out.printf("Certo, %s é um prazer tê-lo nessa história." 
        + "\n----------------------------------------------------------", varProtagonista.nome);
        
        System.out.println(capitulo1.nomeCap + capitulo1.texto);
        
        System.out.println("----------------------------------------------------------" 
        + "\nPara cada ação você gastará 20 pontos de energia, se chegar a zero lembre-se de tomar uma poção ou descansar!" 
        + "\n----------------------------------------------------------");
        
        int opções = escaneiaInformação.nextInt();
        escaneiaInformação.nextLine();
        

        if(opções == 1){
            System.out.println(capitulo2escolha1.nomeCap + capitulo2escolha1.texto);
            
            varProtagonista.Acao(20);
            
            opções = escaneiaInformação.nextInt();

            if(opções == 1){
                System.out.println(capitulo3escolha1escolha1.nomeCap + capitulo3escolha1escolha1.texto);
                
                varProtagonista.Acao(20);
            
            }
            else if(opções == 2){
                System.out.println(capitulo3escolha1escolha2.nomeCap + capitulo3escolha1escolha2.texto);
                
                varProtagonista.Acao(20); 
            }
        }
        else if(opções == 2){
            System.out.println(capitulo2escolha2.nomeCap + capitulo2escolha2.texto);
            
            varProtagonista.Acao(20);
            
            opções = escaneiaInformação.nextInt();
            
            if(opções == 1){
                System.out.println(capitulo3escolha2escolha1.nomeCap + capitulo3escolha2escolha1.texto);
                
                varProtagonista.Acao(20);

            }
            else if(opções == 2){
                System.out.println(capitulo3escolha2escolha2.nomeCap + capitulo3escolha2escolha2.texto);
                
                varProtagonista.Acao(20);
            }
        }
    escaneiaInformação.close();
    }
}