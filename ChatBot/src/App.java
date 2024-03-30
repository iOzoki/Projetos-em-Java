import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner escaneador = new Scanner(System.in);
        
        System.out.println("Olá, bem-vindo. Sou o bot Ozoki e irei lhe guiar no cadastro do WoW. Para começarmos, qual seu nome?");
        String varNome = escaneador.nextLine();
        
        System.out.println("É um prazer," + varNome + ". Qual sua idade?" );
        int varIdade = escaneador .nextInt();
        if(varIdade >= 13) {
           System.out.println("Qual seu gênero?");
         String varGenero = escaneador .nextLine();
        
         System.out.println("Com qual classe você deseja jogar?\n1.Guerreiro\n2.Caçador\n3.Ladino\n4.Sacerdote\n5.Paladino\n6.Xamã\n7.Conjurador\n8.Monge\n9.Bruxo\n10.Druida");
         int varClasse = escaneador .nextInt();

         System.out.println("Seu cadastro está concluido! Seu nome é: " + varNome + " Sua idade: " + varIdade + " Seu genêro: " + varGenero + " E sua classe é: " + varClasse);
          
        }
        else {
            System.out.println("Você não tem idade suficiente para se cadastrar no WoW.");
        }


        escaneador .close();
    }
}
