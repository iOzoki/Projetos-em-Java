import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a base: ");
        double base = scan.nextInt();
        System.out.println("Digite a potência: ");
        double potencia = scan.nextInt();

        double resultado = calcularPotencia(base, potencia);
        System.out.println("Resultado: " + resultado);
    }

    static double calcularPotencia(double base, double potencia) {
        if (potencia == 0) {
            return 1;
        } 
        else if (potencia > 0) {
            double resultado = 1;
            for (int i = 1; i <= potencia; i++) {
                resultado *= base;
            }
            return resultado;
        } 
        else {
            double resultado = 1;
            for (int i = 1; i <= -potencia; i++) {
                resultado *= base;
            }
            return 1 / resultado;
        }
    }
}