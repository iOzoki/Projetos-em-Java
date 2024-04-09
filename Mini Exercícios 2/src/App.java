public class App {
    public static void main(String[] args) {
        int x = 10;

        operacoesBasicas(x);
    }

    public static void operacoesBasicas(int x) {
        int resultado = x;
        resultado += 1;
        System.out.println("O valor X que inicialmente era 10 foi somado o valor 1.\nResultado: " + resultado);

        resultado -= 2;
        System.out.println("O valor X que inicialmente era 11 foi subtraido o valor 2. \nResultado: " + resultado);

        resultado *= 4;
        System.out.println("O valor X que inicialmente era 9 foi multiplicado o valor 4. \nResultado: " + resultado);

        resultado /= 2;
        System.out.println("O valor X que inicialmente era 36 foi dividido pelo valor 2. \nResultado: " + resultado);

        resultado %= 2;
        System.out.println("O valor X que inicialmente era 18 tem seu resto por 2 igual a: \nResultado: " + resultado);
 
    }

}