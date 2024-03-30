import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner Escan = new Scanner(System.in);
        
        System.out.println("Olá, bem-vindo. Sou o bot Ozoki e irei lhe guiar no cadastro do WoW. Para começarmos, qual seu nome?");
        String varNome = Escan.nextLine();
        
        System.out.println("É um prazer," + varNome + ". Qual sua idade?" );
        int varIdade = Escan .nextInt();
        if(varIdade >= 13) {
           System.out.println("Qual seu gênero?");
         String varGenero = Escan .nextLine();
        
         System.out.println("Com qual classe você deseja jogar?\n1.Guerreiro\n2.Caçador\n3.Ladino\n4.Sacerdote\n5.Paladino\n6.Xamã\n7.Conjurador\n8.Monge\n9.Bruxo\n10.Druida");
         int varClasse = Escan .nextInt();

         System.out.println("Seu cadastro está concluido! Seu nome é: " + varNome + " Sua idade: " + varIdade + " Seu genêro: " + varGenero + " E sua classe é: " + varClasse);
          
        }
        else {
            System.out.println("Você não tem idade suficiente para se cadastrar no WoW.");
        }


        Escan .close();
    }
}
