import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner Escan = new Scanner(System.in);
        
        System.out.println("Olá, bem-vindo. Sou o bot Ozoki e irei lhe guiar no cadastro do WoW. Para começarmos, qual seu nome?");
        String varNome = Escan.nextLine();
        
        System.out.println("É um prazer, " + varNome + ". Qual sua idade?" );
        int varIdade = Escan.nextInt();
        Escan.nextLine(); 
        
        if(varIdade >= 13) {
            System.out.println("Qual seu gênero?");
            String varGenero = Escan.nextLine();
        
            System.out.println("Com qual classe você deseja jogar?\n1.Guerreiro\n2.Caçador\n3.Ladino\n4.Sacerdote");
            String classeEscolhida = Escan.nextLine();

            if (classeEscolhida.equals("1")){
                classeEscolhida = "Guerreiro"; 
                System.out.println("Seu cadastro está concluído! Seu nome é: " + varNome + " Sua idade: " + varIdade + " Seu gênero: " + varGenero + " E sua classe é: " + classeEscolhida);
            }
            else if (classeEscolhida.equals("2")){
                classeEscolhida = "Caçador"; 
                System.out.println("Seu cadastro está concluído! Seu nome é: " + varNome + " Sua idade: " + varIdade + " Seu gênero: " + varGenero + " E sua classe é: " + classeEscolhida);
            }
            else if (classeEscolhida.equals("3")){
                classeEscolhida = "Ladino"; 
                System.out.println("Seu cadastro está concluído! Seu nome é: " + varNome + " Sua idade: " + varIdade + " Seu gênero: " + varGenero + " E sua classe é: " + classeEscolhida);
            }
            else if (classeEscolhida.equals("4")){
                classeEscolhida = "Sacerdote"; 
                System.out.println("Seu cadastro está concluído! Seu nome é: " + varNome + " Sua idade: " + varIdade + " Seu gênero: " + varGenero + " E sua classe é: " + classeEscolhida);
            }
            else{
                System.out.println("A classe que você está tentando colocar não existe.");                
            }
            
        } 
        else {
            System.out.println("Você não tem idade suficiente para se cadastrar no WoW.");
        }

        Escan.close();
    }
}
